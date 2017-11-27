package com.iteso.eduardo.followup2;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Eduardo on 23/10/2017.
 */

public class FirstTime {
    private int puntosTemp;
    private int puntosHigh;
    private boolean sound;
    private int juegos;
    //private String usuarioT;
    private String tema;
    private boolean firstTime;

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    private int puntosTotales;

    public int getPuntosTemp() {
        return puntosTemp;
    }

    public void setPuntosTemp(int puntosTemp) {
        this.puntosTemp = puntosTemp;
    }

    public int getPuntosHigh() {
        return puntosHigh;
    }

    public void setPuntosHigh(int puntosHigh) {
        this.puntosHigh = puntosHigh;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public int getJuegos() {
        return juegos;
    }

    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }



    public boolean isFirstTime() {
        return firstTime;
    }

    public void setFirstTime(boolean firstTime) {
        this.firstTime = firstTime;
    }

    public FirstTime checkTime(Context context){

        SharedPreferences sharedPreferences =
                context.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        FirstTime una=new FirstTime();
        una.setFirstTime(sharedPreferences.getBoolean("FT",false));
        una.setSound(sharedPreferences.getBoolean("SND",true));
        una.setJuegos(sharedPreferences.getInt("JGS", 0));
        una.setPuntosHigh(sharedPreferences.getInt("PTH", 0));
        una.setPuntosTemp(sharedPreferences.getInt("PTTMP", 0));
        una.setTema(sharedPreferences.getString("TM", null));
        una.setPuntosTotales(sharedPreferences.getInt("PTT", 0));
        return una;
    }
    public void saveFT (Context context ){
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("FT", true);
        editor.apply();
    }


}
