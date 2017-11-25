package com.iteso.eduardo.followup2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.iteso.eduardo.followup2.Database.DataBaseControl;
import com.iteso.eduardo.followup2.Database.DataBaseHandler;
import com.iteso.eduardo.followup2.Database.UpperClass;

public class TestActivity extends AppCompatActivity {
    TextView a1,a2,a3;
    DataBaseHandler dbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        a1=(TextView) findViewById(R.id.a1);
        a2=(TextView) findViewById(R.id.a2);
        a3=(TextView) findViewById(R.id.a3);
        dbh= DataBaseHandler.getInstance(this);
        DataBaseControl dbc=new DataBaseControl();
        UpperClass upperClass =new UpperClass();
        upperClass.cloneUpperClass(dbc.classCreator(5,dbh));
        a1.setText(upperClass.getHandle());
        a2.setText(upperClass.getName());
        a3.setText(""+upperClass.getFollowers()+"");
    }
}
