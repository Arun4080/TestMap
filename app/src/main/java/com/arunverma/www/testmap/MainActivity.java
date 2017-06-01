package com.arunverma.www.testmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
   Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void connect(View view){
        Intent i = new Intent(this , MapsActivity.class);
        final EditText e = (EditText) findViewById(R.id.editText);
        String location = e.getText().toString();

        i.putExtra("location", location);
        startActivity(i);



    }
}
