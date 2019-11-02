package com.iteso.eduardo.followup2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityEstadisticas extends AppCompatActivity {
    private int highScore,puntosTotales,juegosJugados;
    private float promedio,a,b;
    private TextView txtHighScore, txtPuntosTotales, txtJuegosJugados,txtpromedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);
        txtHighScore = (TextView)findViewById(R.id.estadisticas_highscore);
        txtPuntosTotales = (TextView)findViewById(R.id.estadisticas_puntostotales);
        txtJuegosJugados = (TextView)findViewById(R.id.estadisticas_juegojugados);
        txtpromedio = (TextView)findViewById(R.id.estadisticas_promedio);
        SharedPreferences sharedPreferences = ActivityEstadisticas.this.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        highScore = sharedPreferences.getInt("PTH",0);
        puntosTotales = sharedPreferences.getInt("PTT",0);
        juegosJugados = sharedPreferences.getInt("JGS",0);
        txtHighScore.setText(""+highScore);
        txtPuntosTotales.setText(""+puntosTotales);
        txtJuegosJugados.setText(""+juegosJugados);
        a = puntosTotales;
        b = juegosJugados;
        promedio = (a/b);
        txtpromedio.setText( String.format( "%.2f", promedio ) );


    }
}
