package com.iteso.eduardo.followup2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ActivityMedallas extends AppCompatActivity {
/*Agregar las medallas*/
    private RecyclerView.Adapter mAdapter;
    ArrayList<Trofeo> myDataSet;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medallas);
        recyclerView = (RecyclerView)findViewById(R.id.fragment_activity_medallas);
        myDataSet = new ArrayList<>();
        mAdapter = new AdapterTrofeo(this,myDataSet);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        fillCards();
    }

    private void fillCards() {
        Trofeo trofeo = new Trofeo();
        trofeo.setTitulo("10 puntos");
        trofeo.setDescrip("Obtuviste 10 puntos en todos tus juegos");
        trofeo.setImagen(verificarTrofeo(0));
        Trofeo trofeo1 = new Trofeo();
        trofeo1.setTitulo("5 puntos seguidos");
        trofeo1.setDescrip("Ganaste 5 putnos sin perder!");
        trofeo1.setImagen(verificarTrofeo(1));
        Trofeo trofeo2 = new Trofeo();
        trofeo2.setTitulo("100 puntos");
        trofeo2.setDescrip("Obtuviste 100 puntos en todos tus juegos ");
        trofeo2.setImagen(verificarTrofeo(2));
        Trofeo trofeo3 = new Trofeo();
        trofeo3.setTitulo("15 High Score");
        trofeo3.setDescrip("Tubiste un HS de 15 puntos o mas ");
        trofeo3.setImagen(verificarTrofeo(3));
        Trofeo trofeo4 = new Trofeo();
        trofeo4.setTitulo("20 Puntos");
        trofeo4.setDescrip("Obtuviste 20 puntos en todos tus juegos");
        trofeo4.setImagen(verificarTrofeo(4));
        Trofeo trofeo5 = new Trofeo();
        trofeo5.setTitulo("40 Juegos");
        trofeo5.setDescrip("Jugaste 40 juegos");
        trofeo5.setImagen(verificarTrofeo(5));
        Trofeo trofeo6 = new Trofeo();
        trofeo6.setTitulo("150 Puntos");
        trofeo6.setDescrip("Hiciste 150 puntos totales");
        trofeo6.setImagen(verificarTrofeo(6));
        myDataSet.add(trofeo4);
        myDataSet.add(trofeo6);
        myDataSet.add(trofeo1);
        myDataSet.add(trofeo5);
        myDataSet.add(trofeo2);
        myDataSet.add(trofeo);
        myDataSet.add(trofeo3);
    }

    private int verificarTrofeo(int trofeo){
        SharedPreferences sharedPreferences =
                ActivityMedallas.this.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        //FirstTime una= new FirstTime();
        int highScore = sharedPreferences.getInt("PTH",0);
        int puntosTotales = sharedPreferences.getInt("PTT",0);
        int juegosJugados = sharedPreferences.getInt("JGS",0);
        int temp = 0;
        switch (trofeo){
            case 0:
                if(puntosTotales>=10){
                    temp = 1;
                }
                break;
            case 1:
                if(highScore>5){
                    temp = 1;
                }
                break;
            case 2:
                if(puntosTotales == 100){
                    temp = 1;
                }
                break;
            case 3:
                if(highScore>=15){
                    temp = 1;
                }
                break;
            case 4:
                if(puntosTotales>=10){
                    temp = 1;
                }
                break;
            case 5:
                if(juegosJugados>=40){
                    temp = 1;
                }
                break;
            case 6:
                if(puntosTotales>=150){
                    temp = 1;
                }
                break;
        }
        return temp;
    }
}
