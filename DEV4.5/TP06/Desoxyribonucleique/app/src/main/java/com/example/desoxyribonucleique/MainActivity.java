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
        this.observateurPrefs = new ObservateurPrefs();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        preferences.registerOnSharedPreferenceChangeListener(this.observateurPrefs);
        boolean boutonA = preferences.getBoolean(SettingsActivity.BOUTON_A,true);
        boolean boutonC = preferences.getBoolean(SettingsActivity.BOUTON_C,true);
        boolean boutonG = preferences.getBoolean(SettingsActivity.BOUTON_G,true);
        boolean boutonT = preferences.getBoolean(SettingsActivity.BOUTON_T,true);
        if (!boutonA){
            findViewById(R.id.a).setActivated(false);
        } else if (!boutonC) {
            findViewById(R.id.c).setActivated(false);
        } else if (!boutonG) {
            findViewById(R.id.g).setActivated(false);
        } else if (!boutonT) {
            findViewById(R.id.t).setActivated(false);
        }
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
}