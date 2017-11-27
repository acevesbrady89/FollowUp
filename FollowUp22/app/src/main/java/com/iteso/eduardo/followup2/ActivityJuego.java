package com.iteso.eduardo.followup2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.iteso.eduardo.followup2.Database.DataBaseControl;
import com.iteso.eduardo.followup2.Database.DataBaseHandler;
import com.iteso.eduardo.followup2.Database.UpperClass;

import java.text.DecimalFormat;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        randoms= new Vector<>();
        setContentView(R.layout.activity_juego);
        dbh= DataBaseHandler.getInstance(this);
        puntos=0;
        dbc=new DataBaseControl();
        NombreDown= (TextView) findViewById(R.id.nameDown);
        Puntostxt=(TextView) findViewById(R.id.Puntos);
        NombreUp= (TextView) findViewById(R.id.nameUp);
        HandlerUp= (TextView) findViewById(R.id.handleUp);
        HandlerDown= (TextView) findViewById(R.id.handleDown);
        Followers= (TextView) findViewById(R.id.upNumber);


        upperClass=new UpperClass();
        lowerClass=new UpperClass();


    upperClass.cloneUpperClass(dbc.classCreator(generateRandomInt(), dbh));
    lowerClass.cloneUpperClass(dbc.classCreator(generateRandomInt(),dbh));
    pintar();

    }

    public int generateRandomInt(){
        int num=1;
        boolean check=false;
        while(!check) {
            num = ThreadLocalRandom.current().nextInt(1, 96);
            if (!randoms.contains(num))
                check=true;

        }
        randoms.add(num);
        return num;
    }
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.botonMas:
                if(!lowerClass.esMenorOMayor(upperClass)) {
                    puntos++;
                    upperClass.cloneUpperClass(lowerClass);
                    lowerClass.cloneUpperClass(dbc.classCreator(generateRandomInt(),dbh));
                    pintar();
                }
               else {
                    intent = new Intent(this, ActivityPerdiste.class);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.botonMenos:
                if(lowerClass.esMenorOMayor(upperClass)) {
                    puntos++;
                    upperClass.cloneUpperClass(lowerClass);
                    lowerClass.cloneUpperClass(dbc.classCreator(generateRandomInt(),dbh));
                    pintar();
                }
                else {
                    intent = new Intent(this, ActivityPerdiste.class);
                    startActivity(intent);
                    finish();
                }
                break;

        }


    }
    public void pintar(){
        DecimalFormat formato=new DecimalFormat("###,###,###");
        NombreUp.setText(upperClass.getName());
        NombreDown.setText(lowerClass.getName());
        HandlerUp.setText(upperClass.getHandle());
        HandlerDown.setText(lowerClass.getHandle());
        Followers.setText(""+formato.format(upperClass.getFollowers())+"");
        Puntostxt.setText(""+puntos+"");
    }
}
