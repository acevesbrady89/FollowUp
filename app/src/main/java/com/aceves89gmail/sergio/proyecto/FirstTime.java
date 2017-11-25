package com.aceves89gmail.sergio.proyecto;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Eduardo on 23/10/2017.
 */

public class FirstTime {

    private boolean firstTime;

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


        return una;
    }
    public void savePreferences (Context context ){
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.iteso.aceves89gmail.sergio.proyecto", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("FT", true);
        editor.apply();

    }

}
