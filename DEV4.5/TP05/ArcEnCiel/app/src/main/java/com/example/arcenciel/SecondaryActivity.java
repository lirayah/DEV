package com.example.arcenciel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondaryActivity extends AppCompatActivity {
    private boolean[] actifs;
    private int[] ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secondary);
        Intent i = getIntent();
        this.actifs = i.getExtras().getBooleanArray("couleurs");
        ids = new int[]{
                R.id.Rouge, R.id.Orange,
                R.id.Jaune, R.id.Vert,
                R.id.Bleu, R.id.Indigo, R.id.Violet};

        for (int j = 0; j < ids.length; j++) {
            if (actifs[j]){
                Switch _swicth = findViewById(ids[j]);
                _swicth.toggle();
            }
        }
        ControllerBoutonOk controllerBoutonOk = new ControllerBoutonOk(ids, actifs, this);
        this.findViewById(R.id.boutonOk).setOnClickListener(controllerBoutonOk);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}