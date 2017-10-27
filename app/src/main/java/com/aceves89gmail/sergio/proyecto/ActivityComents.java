package com.aceves89gmail.sergio.proyecto;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityComents extends AppCompatActivity {
private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coments);

    button= (Button) findViewById(R.id.activitycoments_Button);
        editText= (EditText) findViewById(R.id.activitycoments_EditText);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent= new Intent (Intent.ACTION_SENDTO);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Comentarios");
        intent.putExtra(Intent.EXTRA_TEXT, editText.getText());
        intent.setData(Uri.parse("mailto:is703417@iteso.mx"));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        




    }
});

    }
}
