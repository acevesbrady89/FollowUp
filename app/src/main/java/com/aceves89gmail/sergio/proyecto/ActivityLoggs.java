package com.aceves89gmail.sergio.proyecto;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityLoggs extends Fragment {

    protected ImageButton boton1;
    protected ImageButton boton2;
    public ActivityLoggs() {}
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_loggs, container, false);
        boton1 = (ImageButton) view.findViewById(R.id.imageButton);
        boton2 = (ImageButton) view.findViewById(R.id.imageButton2);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(((ActivityAjustes)getActivity()),"Facebook logg",Toast.LENGTH_LONG).show();
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(((ActivityAjustes)getActivity()),"Twitter logg",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
