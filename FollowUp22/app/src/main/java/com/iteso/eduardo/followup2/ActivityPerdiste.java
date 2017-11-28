package com.iteso.eduardo.followup2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class ActivityPerdiste extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdiste);
    }
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.regresarMenu:
                intent = new Intent(this, ActivityMain.class);
                startActivity(intent);
                finish();

                break;

            case R.id.perdiste_newgame:
                intent = new Intent(this, ActivityJuego.class);
                startActivity(intent);
                finish();
                break;

        }

    }
}
