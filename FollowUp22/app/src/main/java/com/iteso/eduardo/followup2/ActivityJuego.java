package com.iteso.eduardo.followup2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.iteso.eduardo.followup2.Database.DataBaseControl;
import com.iteso.eduardo.followup2.Database.DataBaseHandler;
import com.iteso.eduardo.followup2.Database.UpperClass;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class ActivityJuego extends AppCompatActivity {
    TextView NombreUp, NombreDown;
    TextView HandlerUp, HandlerDown;
    TextView Followers;
    TextView Puntostxt;
    int puntos;
    UpperClass upperClass;
    UpperClass lowerClass;
    DataBaseControl dbc;
    DataBaseHandler dbh;
    private Vector<Integer> randoms;
    ImageView upIMG, downIMG;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        randoms = new Vector<>();
        setContentView(R.layout.activity_juego);
        SharedPreferences sharedPreferences =
                ActivityJuego.this.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        mediaPlayer = MediaPlayer.create(this, R.raw.musica);
        dbh = DataBaseHandler.getInstance(this);
        puntos = 0;
        dbc = new DataBaseControl();
        NombreDown = (TextView) findViewById(R.id.nameDown);
        Puntostxt = (TextView) findViewById(R.id.Puntos);
        NombreUp = (TextView) findViewById(R.id.nameUp);
        HandlerUp = (TextView) findViewById(R.id.handleUp);
        HandlerDown = (TextView) findViewById(R.id.handleDown);
        Followers = (TextView) findViewById(R.id.upNumber);
        upIMG = (ImageView) findViewById(R.id.imageUp);
        downIMG = (ImageView) findViewById(R.id.imageDown);
        if (sharedPreferences.getBoolean("SND", true)) {
            mediaPlayer.start();
        }


        upperClass = new UpperClass();
        lowerClass = new UpperClass();


        upperClass.cloneUpperClass(dbc.classCreator(generateRandomInt(), dbh));
        lowerClass.cloneUpperClass(dbc.classCreator(generateRandomInt(), dbh));
        pintar();


    }

    public int generateRandomInt() {
        int num = 1;
        Random rand = new Random();
        boolean check = false;
        while (!check) {
            num = rand.nextInt(96) + 1;
            //num = ThreadLocalRandom.current().nextInt(1, 96);
            if (!randoms.contains(num))
                check = true;

        }
        randoms.add(num);
        return num;
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.botonMas:
                if (!lowerClass.esMenorOMayor(upperClass)) {
                    puntos++;
                    upperClass.cloneUpperClass(lowerClass);
                    lowerClass.cloneUpperClass(dbc.classCreator(generateRandomInt(), dbh));
                    pintar();
                } else {
                    intent = new Intent(this, ActivityPerdiste.class);

                    intent.putExtra("UP", upperClass);
                    intent.putExtra("LOW", lowerClass);
                    intent.putExtra("PT", puntos);
                    startActivity(intent);
                    finish();

                }
                break;
            case R.id.botonMenos:
                if (lowerClass.esMenorOMayor(upperClass)) {
                    puntos++;
                    upperClass.cloneUpperClass(lowerClass);
                    lowerClass.cloneUpperClass(dbc.classCreator(generateRandomInt(), dbh));
                    pintar();
                } else {
                    intent = new Intent(this, ActivityPerdiste.class);
                    intent.putExtra("UP", upperClass);
                    intent.putExtra("LOW", lowerClass);
                    intent.putExtra("PT", puntos);
                    startActivity(intent);
                    finish();
                }
                break;

        }


    }

    public void pintar() {
        DecimalFormat formato = new DecimalFormat("###,###,###");
        NombreUp.setText(upperClass.getName());
        NombreDown.setText(lowerClass.getName());
        HandlerUp.setText(upperClass.getHandle());
        HandlerDown.setText(lowerClass.getHandle());
        Followers.setText("" + formato.format(upperClass.getFollowers()) + "");
        Puntostxt.setText("" + puntos + "");
        new MyUpImage().execute(upperClass.getImagen());
        new MyDownImage().execute(lowerClass.getImagen());
    }

    class MyUpImage extends AsyncTask<String, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... urls) {
            try {
                URL url = new URL(urls[0]);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoInput(true);
                conn.connect();
                InputStream inputStream = conn.getInputStream();
                return BitmapFactory.decodeStream(inputStream);
            } catch (MalformedURLException url) {
                return null;
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            upIMG.setImageBitmap(bitmap);


        }

    }

    class MyDownImage extends AsyncTask<String, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... urls) {
            try {
                URL url = new URL(urls[0]);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoInput(true);
                conn.connect();
                InputStream inputStream = conn.getInputStream();
                return BitmapFactory.decodeStream(inputStream);
            } catch (MalformedURLException url) {
                return null;
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            downIMG.setImageBitmap(bitmap);


        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = ActivityJuego.this.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        if (sharedPreferences.getBoolean("SND", false)) {
            mediaPlayer.start();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences sharedPreferences = ActivityJuego.this.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        if (sharedPreferences.getBoolean("SND", false)) {
            mediaPlayer.pause();
        }
    }
}


