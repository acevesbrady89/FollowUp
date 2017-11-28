package com.iteso.eduardo.followup2;

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
        myDataSet.add(trofeo);
        Trofeo trofeo1 = new Trofeo();
        trofeo1.setTitulo("5 puntos seguidos");
        trofeo1.setDescrip("C");
        trofeo1.setImagen(verificarTrofeo(1));
        myDataSet.add(trofeo1);
        Trofeo trofeo2 = new Trofeo();
        trofeo2.setTitulo("100 puntos");
        trofeo2.setDescrip("Obtuviste 100 puntos en todos tus juegos ");
        trofeo2.setImagen(verificarTrofeo(2));
        myDataSet.add(trofeo2);
        Trofeo trofeo3 = new Trofeo();
        trofeo3.setTitulo("15 High Score");
        trofeo3.setDescrip("Tubiste un HS de 15 puntos o mas ");
        trofeo3.setImagen(verificarTrofeo(3));
        myDataSet.add(trofeo3);
        Trofeo trofeo4 = new Trofeo();
        trofeo4.setTitulo("20 Puntos seguidos");
        trofeo4.setDescrip("Obtuviste 20 puntos en todos tus juegos");
        trofeo4.setImagen(verificarTrofeo(4));
        myDataSet.add(trofeo4);
    }

    private int verificarTrofeo(int trofeo){
        int temp = 0;
        switch (trofeo){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return temp;
    }
}
