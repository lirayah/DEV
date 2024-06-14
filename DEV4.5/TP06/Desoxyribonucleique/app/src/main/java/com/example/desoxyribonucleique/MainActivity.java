package com.example.desoxyribonucleique;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ObservateurPrefs observateurPrefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView textView = findViewById(R.id.text_view);
        AjoutBase ajoutBase = new AjoutBase(textView);
        findViewById(R.id.a).setOnClickListener(ajoutBase);
        findViewById(R.id.g).setOnClickListener(ajoutBase);
        findViewById(R.id.c).setOnClickListener(ajoutBase);
        findViewById(R.id.t).setOnClickListener(ajoutBase);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_parametres) {
            Intent i = new Intent(this, SettingsActivity.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onStart() {
        super.onStart();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (!sharedPreferences.getBoolean(getResources().getString(R.string.a), true)){
            ((Button) findViewById(R.id.a)).setEnabled(false);
        } else {
            ((Button) findViewById(R.id.a)).setEnabled(true);
        }
        int couleur = Integer.parseInt(sharedPreferences.getString(getResources().getString(R.string.background_color), "ff0f4a1f"), 16);
        findViewById(R.id.vue_background).setBackgroundColor(couleur);
    }
}