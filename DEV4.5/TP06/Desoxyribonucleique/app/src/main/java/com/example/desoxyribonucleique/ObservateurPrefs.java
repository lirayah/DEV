package com.example.desoxyribonucleique;

import android.content.SharedPreferences;

import androidx.annotation.Nullable;

public class ObservateurPrefs implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, @Nullable String key) {
        assert key != null;
        switch (key){
            case SettingsActivity.BOUTON_A:
                break;

            case SettingsActivity.BOUTON_C:
                break;

            case SettingsActivity.BOUTON_G:
                break;

            case SettingsActivity.BOUTON_T:
                break;

            default:
                break;
        }
    }
}
