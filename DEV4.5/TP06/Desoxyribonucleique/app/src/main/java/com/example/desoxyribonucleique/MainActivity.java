package com.example.desoxyribonucleique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text_view);
        AjoutBase ajoutBase = new AjoutBase(textView);
        findViewById(R.id.a).setOnClickListener(ajoutBase);
        findViewById(R.id.g).setOnClickListener(ajoutBase);
        findViewById(R.id.c).setOnClickListener(ajoutBase);
        findViewById(R.id.t).setOnClickListener(ajoutBase);
    }
}