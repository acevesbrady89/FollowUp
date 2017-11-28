package com.iteso.eduardo.followup2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.iteso.eduardo.followup2.Database.UpperClass;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;

public class ActivityPerdiste extends AppCompatActivity {
    ImageView pd1, pd2;
    TextView followers1, followers2, name1,name2;
    TextView puntaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdiste);
        pd1=(ImageView) findViewById(R.id.perdiste_imagen1);
        pd2=(ImageView) findViewById(R.id.perdiste_imagen2);
        followers1=(TextView) findViewById(R.id.perdiste_Followers1);
        followers2=(TextView) findViewById(R.id.perdisteFollowers2);
        name1=(TextView) findViewById(R.id.perdiste_Name1);
        name2=(TextView) findViewById(R.id.perdiste_Name2);
        puntaje=(TextView) findViewById(R.id.perdiste_puntos);
        DecimalFormat formato = new DecimalFormat("###,###,###");
        Intent data= getIntent();
        UpperClass upperClass= data.getParcelableExtra("UP");
        UpperClass lowerClass= data.getParcelableExtra("LOW");
        int puntos=data.getIntExtra("PT",0);
        name1.setText(upperClass.getHandle());
        name2.setText(lowerClass.getHandle());
        new Imagen1().execute(upperClass.getImagen());
        new Imagen2().execute(lowerClass.getImagen());
        followers1.setText( "" + formato.format(upperClass.getFollowers()) + "");
        followers2.setText( "" + formato.format(lowerClass.getFollowers()) + "");
        puntaje.setText(""+puntos+"");
    }

    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.regresarMenu:
                intent = new Intent(this, ActivityMain.class);
                startActivity(intent);
                finish();

                break;

            case R.id.perdiste_newgame:
                intent = new Intent(this, ActivityJuego.class);
                startActivity(intent);
                finish();
                break;

        }

    }
    class Imagen2 extends AsyncTask<String, Void, Bitmap> {
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
            pd2.setImageBitmap(bitmap);


        }

    }

    class Imagen1 extends AsyncTask<String, Void, Bitmap> {
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
            pd1.setImageBitmap(bitmap);


        }
    }
}
