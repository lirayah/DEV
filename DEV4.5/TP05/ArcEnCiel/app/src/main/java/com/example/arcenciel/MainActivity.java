package com.example.arcenciel;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Couleurs couleurs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Vue v = findViewById(R.id.vue);
        this.couleurs = v.getModel();
        ControllerBouton cb = new ControllerBouton(couleurs, this);
        findViewById(R.id.selection).setOnClickListener(cb);
    }
}