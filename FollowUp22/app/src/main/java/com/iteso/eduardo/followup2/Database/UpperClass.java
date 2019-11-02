package com.iteso.eduardo.followup2.Database;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Eduardo on 24/11/2017.
 */

public class UpperClass implements Parcelable {
    private String handle;
    private String name;
    private int followers;
    private String imagen;
    private int id;

    public UpperClass (){

    }
    public void cloneUpperClass(UpperClass upperClass){
        name=upperClass.getName();
        id=upperClass.getId();
        followers =upperClass.getFollowers();
        handle=upperClass.getHandle();
        imagen=upperClass.getImagen();

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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(handle);
        dest.writeString(name);
        dest.writeInt(followers);
        dest.writeString(imagen);
        dest.writeInt(id);
    }
    protected UpperClass(Parcel in){
        handle=in.readString();
        name=in.readString();
        followers=in.readInt();
        imagen=in.readString();
        id=in.readInt();
    }
    public static final Creator<UpperClass> CREATOR = new Creator<UpperClass>() {
        @Override
        public UpperClass createFromParcel(Parcel source) {
            return new UpperClass(source);
        }

        @Override
        public UpperClass[] newArray(int size) {
            return new UpperClass[0];
        }
    };
}
