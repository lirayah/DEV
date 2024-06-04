package com.example.tp03;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Fleche f = new Fleche();
        Button b1 = this.findViewById(R.id.goche);
        Button b2 = this.findViewById(R.id.drouate);
        ImageView iv = this.findViewById(R.id.iv);
        iv.setImageResource(R.drawable.fleche_gauche);
        f.setIv(iv);
        b1.setOnClickListener(f);
        b2.setOnClickListener(f);
    }
}