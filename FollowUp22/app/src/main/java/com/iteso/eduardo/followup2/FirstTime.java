package com.iteso.eduardo.followup2;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Eduardo on 23/10/2017.
 */

public class FirstTime {

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
/**
 *      Todo lo que esta aqui abajo es como para leer, si en alguna clase necesitas leer lo haces igual que aquí
 *      Primero inicializas SharedPreferences (literal copiando y pegado desde SharedPreferences hasta Mode Private;)
 *      Por ejemplo si quieres saber cuantos juegos hay en total necesitas pedir la variable JGS de la manera
 *      sharedPreferences.getInt("JGS,0); El cero es en caso de que no la encuentre el valor que mandará.
 *
 */
        SharedPreferences sharedPreferences =
                context.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        FirstTime una=new FirstTime();
        una.setFirstTime(sharedPreferences.getBoolean("FT",false));
        una.setSound(sharedPreferences.getBoolean("SND",true));
        una.setJuegos(sharedPreferences.getInt("JGS", 0));
        una.setPuntosHigh(sharedPreferences.getInt("PTH", 0));
        una.setTema(sharedPreferences.getString("TM", null));
        una.setPuntosTotales(sharedPreferences.getInt("PTT", 0));
        return una;
    }

    /**
     * Estas funciones las hice para mandar datos a sharedPreferences, en tu clase tienes que
     * crear un FirstTime ft = new FirstTime para poder llamar a estos metodos.
     *
     */
    public void saveFT (Context context ){
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("FT", true);
        editor.apply();
    }
    public void sonidOn(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("SND", true);
        editor.apply();
    }
    public void sonidOff(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("SND", false);
        editor.apply();
    }
    public void saveSong(Context context, String song ){
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("TM", song);
        editor.apply();
    }
    public void saveActPerdiste(Context context, int score){
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if(sharedPreferences.getInt("PTH",0)<score) {
            editor.putInt("PTH", score);

        }
        setPuntosTotales(sharedPreferences.getInt("PTT",0)+score);
        setJuegos(sharedPreferences.getInt("JGS", 0)+1);
        editor.putInt("PTT", getPuntosTotales());
        editor.putInt("JGS",getJuegos());
        editor.apply();
    }

}
