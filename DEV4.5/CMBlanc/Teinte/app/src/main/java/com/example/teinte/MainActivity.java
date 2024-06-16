package com.example.teinte;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q3c);
        View vue = findViewById(R.id.couleur);
        int rouge = Integer.parseInt(((TextView) findViewById(R.id.rouge)).getText().toString());
        int vert = Integer.parseInt(((TextView) findViewById(R.id.vert)).getText().toString());
        int bleu = Integer.parseInt(((TextView) findViewById(R.id.bleu)).getText().toString());
        vue.setBackgroundColor(Color.argb(255,rouge,vert,bleu));
    }
}