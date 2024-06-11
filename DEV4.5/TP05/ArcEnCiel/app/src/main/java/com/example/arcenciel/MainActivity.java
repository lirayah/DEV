package com.example.arcenciel;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Couleurs couleurs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        VuePrincipale v = findViewById(R.id.vue);
        this.couleurs = v.getModel();
        ControllerBouton cb = new ControllerBouton(couleurs, this);
        findViewById(R.id.selection).setOnClickListener(cb);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 0) {
            Log.d("jsp", "Onestlaaaaaaaaaaaaaa");
            couleurs.setActif(data.getExtras().getBooleanArray("actif"));
        }
        Log.d("jsp","bite");
    }
}