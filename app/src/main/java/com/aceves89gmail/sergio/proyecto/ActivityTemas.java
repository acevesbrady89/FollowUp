package com.aceves89gmail.sergio.proyecto;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ActivityTemas extends Fragment{
    protected Button boton;
    public ActivityTemas() {}
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_temas, container, false);
        boton = (Button)view.findViewById(R.id.activiy_temas_boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(((ActivityAjustes)getActivity()),"Se guardaron tus preferencias",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }



}
