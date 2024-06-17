package com.example.reponse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q3d);
        TextView tv = findViewById(R.id.question);
        Ecouteur ecouteur = new Ecouteur(tv);
        ((RadioGroup) findViewById(R.id.reponses)).setOnCheckedChangeListener(ecouteur);
    }
}