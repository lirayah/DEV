package com.example.desoxyribonucleique;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

public class SettingsActivity extends PreferenceActivity {
    public static final String BOUTON_A = "A";
    public static final String BOUTON_C = "C";
    public static final String BOUTON_G = "G";
    public static final String BOUTON_T = "T";
    private ObservateurPrefs obs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.addPreferencesFromResource(R.xml.preference);
        this.obs = new ObservateurPrefs();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this.obs);
    }
}