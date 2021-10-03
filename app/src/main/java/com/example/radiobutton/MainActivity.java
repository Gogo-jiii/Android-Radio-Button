package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioButtonA, radioButtonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButtonA = findViewById(R.id.radioButtonA);
        radioButtonB = findViewById(R.id.radioButtonB);

        radioButtonA.setOnClickListener(this);
        radioButtonB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == radioButtonA){
            Toast.makeText(MainActivity.this, "A Clicked.", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(MainActivity.this, "B Clicked.", Toast.LENGTH_LONG).show();
        }
    }
}