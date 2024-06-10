package com.example.arcenciel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secondary);
        Intent i = getIntent();
        boolean[] booleans = i.getExtras().getBooleanArray("couleurs");
        int[] switchs = new int[]{R.id.Rouge, R.id.Orange, R.id.Jaune, R.id.Vert, R.id.Bleu, R.id.Indigo, R.id.Violet};
        for (int j = 0; j < switchs.length; j++) {
            if (booleans[j]){
                Switch _swicth = findViewById(switchs[j]);
                _swicth.toggle();
            }
        }
        ControllerBoutonOk controllerBoutonOk = new ControllerBoutonOk(switchs, booleans, this);
    }
}