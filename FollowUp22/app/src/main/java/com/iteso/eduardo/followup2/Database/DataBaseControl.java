package com.iteso.eduardo.followup2.Database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

/**
 * Created by Eduardo on 24/11/2017.
 */

public class DataBaseControl {
    public UpperClass classCreator(int idUser, DataBaseHandler dh){
        UpperClass upperClass= new UpperClass();
        Cursor cursor;
        String selectQuery="SELECT " +DataBaseHandler.KEY_ID + ","
                + DataBaseHandler.KEY_USERNAME + ","
                + DataBaseHandler.KEY_NAME + ","
                + DataBaseHandler.KEY_IMG + ","
                + DataBaseHandler.KEY_FOLLOWERS
                + " FROM " + DataBaseHandler.TABLE_USERS
                + " WHERE " + DataBaseHandler.KEY_ID + " = "
                + idUser;
        SQLiteDatabase db= dh.getReadableDatabase();
        cursor=db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()){
            upperClass.setId(cursor.getInt(0));
            upperClass.setName(cursor.getString(1));
            upperClass.setHandle(cursor.getString(2));
           upperClass.setFollowers(cursor.getInt(4));
            upperClass.setImagen(cursor.getString(3));
        }
        try {
            cursor.close();
            db.close();
        }catch (Exception e){

        }
        db=null;
        cursor=null;
        return upperClass;


    }

}
