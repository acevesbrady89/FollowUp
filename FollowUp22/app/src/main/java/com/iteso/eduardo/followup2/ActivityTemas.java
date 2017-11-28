package com.iteso.eduardo.followup2;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityTemas extends Fragment{
    protected Button boton;
    ImageButton on, off;

    public ActivityTemas() {}
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_temas, container, false);
        boton = (Button)view.findViewById(R.id.activiy_temas_boton);
        on = (ImageButton) view.findViewById(R.id.activity_temas_sonido);
        off = (ImageButton) view.findViewById(R.id.activity_temas_mute);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(((ActivityAjustes)getActivity()),"Se guardaron tus preferencias",Toast.LENGTH_LONG).show();
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




}
