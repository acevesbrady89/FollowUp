package com.iteso.eduardo.followup2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    MediaPlayer mediaPlayer;
    boolean musicControl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //mediaPlayer = MediaPlayer.create(this, R.raw.musica);
       // mediaPlayer.start();
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.contentActivity_JugarTwitter:
                intent = new Intent(this, ActivityJuego.class);
                startActivity(intent);
                finish();
            break;
        }

    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_medallas) {
            Toast.makeText(this,"MEDALLAS",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ActivityMedallas.class);
            startActivity(intent);
        } else {
            if (id == R.id.nav_ajustes) {
                Toast.makeText(this,"AJUSTES",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, ActivityAjustes.class);
                startActivity(intent);
            } else if (id == R.id.nav_rules) {
                Toast.makeText(this,"INSTRUCCIONES",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, activityRules.class);
                startActivity(intent);
            } else if (id == R.id.menu_AboutUs) {
                Toast.makeText(this,"ABOUT US",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, activity_aboutus.class);
                startActivity(intent);

            } else if (id == R.id.nav_share) {
                Toast.makeText(this,"Estadisticas",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, ActivityEstadisticas.class);
                startActivity(intent);

            } else if (id == R.id.nav_send) {
                Toast.makeText(this,"COMENTARIOS",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, ActivityComents.class);
                startActivity(intent);
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
