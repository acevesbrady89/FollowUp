package com.iteso.eduardo.followup2.Database;

import android.media.Image;

/**
 * Created by Eduardo on 24/11/2017.
 */

public class UpperClass {
    private String handle;
    private String name;
    private int followers;
    private Image imagen;
    private int id;

    public UpperClass (){

    }
    public void cloneUpperClass(UpperClass upperClass){
        name=upperClass.getName();
        id=upperClass.getId();
        followers =upperClass.getFollowers();
        handle=upperClass.getHandle();

    }

    /**
     * True == Mayor
     * False == Menor
     * @return
     */
    public boolean esMenorOMayor(UpperClass upperClass){
        if(upperClass.followers>=getFollowers())
            return true;
        return false;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }







}
