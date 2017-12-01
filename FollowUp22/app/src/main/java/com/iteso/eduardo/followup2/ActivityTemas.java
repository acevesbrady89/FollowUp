package com.iteso.eduardo.followup2;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityTemas extends Fragment{
    protected Button boton,prev;
    ImageButton on, off;
    RadioButton opcion1;
    RadioButton opcion2;
    MediaPlayer mediaPlayer1,mediaPlayer2;
    public ActivityTemas() {}
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_temas, container, false);
        boton = (Button)view.findViewById(R.id.activiy_temas_boton);
        on = (ImageButton) view.findViewById(R.id.activity_temas_sonido);
        off = (ImageButton) view.findViewById(R.id.activity_temas_mute);
        opcion1 = view.findViewById(R.id.activity_temas_tema2);
        opcion2 = view.findViewById(R.id.activity_temas_tema3);
        mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.musica);
        mediaPlayer2 = MediaPlayer.create(getContext(), R.raw.musica2);
        prev = (Button)view.findViewById(R.id.activiy_temas_boton2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opcion1.isChecked()){
                    FirstTime firstTime =new FirstTime();
                    firstTime.saveSong(ActivityTemas.this.getContext(),"musica");
                    Toast.makeText(getContext(),"Cancion 1",Toast.LENGTH_LONG).show();
                }
                if(opcion2.isChecked()){
                    FirstTime firstTime =new FirstTime();
                    firstTime.saveSong(ActivityTemas.this.getContext(),"musica2");
                    Toast.makeText(getContext(),"Cancion 2",Toast.LENGTH_LONG).show();
                }
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opcion1.isChecked()){
                    ControlMusica controlMusica = new ControlMusica(0);
                    controlMusica.execute();
                }
                if(opcion2.isChecked()){
                    ControlMusica controlMusica = new ControlMusica(1);
                    controlMusica.execute();
                }
            }
        });

        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstTime firstTime =new FirstTime();
                firstTime.sonidOff(ActivityTemas.this.getContext());
                Toast.makeText(((ActivityAjustes)getActivity()),"Sound off",Toast.LENGTH_LONG).show();
            }
        });
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstTime firstTime =new FirstTime();
                firstTime.sonidOn(ActivityTemas.this.getContext());
                Toast.makeText(((ActivityAjustes)getActivity()),"Sound on",Toast.LENGTH_LONG).show();
            }
        });


        return view;
    }

    class ControlMusica extends AsyncTask<Void,Void,Void> {
        int cancion;
        private ControlMusica(int i) {
            cancion = i;
        }
        private ControlMusica(){cancion=0;}

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            opcion1.setClickable(false);
            opcion2.setClickable(false);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            opcion1.setClickable(true);
            opcion2.setClickable(true);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            switch (cancion){
                case 0:
                    mediaPlayer1.start();
                    mediaPlayer1.seekTo(10000);
                    while (mediaPlayer1.getCurrentPosition()<15000){

                    }
                    mediaPlayer1.pause();
                    mediaPlayer1.seekTo(0);
                    break;
                case 1:
                    mediaPlayer2.start();
                    mediaPlayer2.seekTo(10000);
                    while (mediaPlayer2.getCurrentPosition()<15000){

                    }
                    mediaPlayer2.pause();
                    mediaPlayer2.seekTo(0);
                    break;
            }
            return null;
        }

    }
    @Override
    public void onStop(){
        super.onStop();
        if(mediaPlayer1.isPlaying()){
            mediaPlayer1.stop();
        }
        if(mediaPlayer2.isPlaying()){
            mediaPlayer2.stop();
        }
    }


}