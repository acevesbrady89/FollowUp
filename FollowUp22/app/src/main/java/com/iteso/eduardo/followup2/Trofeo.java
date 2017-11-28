package com.iteso.eduardo.followup2;

import android.widget.ImageView;

/**
 * Created by Sergio Aceves on 27/11/2017.
 */

public class Trofeo {
    private int imagen;
    private String titulo;
    private String descrip;

    public Trofeo(int ima, String tit, String des) {
        imagen = ima;
        titulo = tit;
        descrip = des;
    }
    public Trofeo(){
        imagen = 0;
        titulo = "";
        descrip = "";
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public String toString() {
        return titulo+", "+descrip;
    }
}
