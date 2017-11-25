package com.iteso.eduardo.followup2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Activity_splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask task= new TimerTask() {
            @Override
            public void run() {
                FirstTime Ft = new FirstTime().checkTime(Activity_splash.this);

                Intent intent;

                if (Ft.isFirstTime()){
                    intent=new Intent(Activity_splash.this,ActivityMain.class);


                }else {
                    intent=new Intent(Activity_splash.this,activityRules.class);
                }
                Ft.savePreferences(Activity_splash.this);
                startActivity(intent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 4000);
    }
}
