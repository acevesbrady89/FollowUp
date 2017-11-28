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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityTemas extends Fragment{
    protected Button boton;
    RadioButton opcion1;
    RadioButton opcion2;
    //RadioButton radioButton;
    public ActivityTemas() {}
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_temas, container, false);
        boton = (Button)view.findViewById(R.id.activiy_temas_boton);
        opcion1 = view.findViewById(R.id.activity_temas_tema2);
        opcion2 = view.findViewById(R.id.activity_temas_tema3);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opcion1.isChecked()){
                    //Verificar Checked Preferences
                    Toast.makeText(getContext(),"opcion1",Toast.LENGTH_LONG).show();
                }
                if(opcion2.isChecked()){
                    //Verificar Checked Preferences
                    Toast.makeText(getContext(),"opcion2",Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }



}
