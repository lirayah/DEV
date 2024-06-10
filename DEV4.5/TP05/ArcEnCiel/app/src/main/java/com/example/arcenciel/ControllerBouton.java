package com.example.arcenciel;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class ControllerBouton implements View.OnClickListener{
    private Couleurs couleurs;
    private MainActivity mainActivity;

    public ControllerBouton(Couleurs couleurs, MainActivity mainActivity) {
        this.couleurs = couleurs;
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(mainActivity,SecondaryActivity.class);
        i.putExtra("couleurs",couleurs.getActif());
        Log.d("A","ICI");
        mainActivity.startActivityForResult(i, Activity.RESULT_OK);
    }
}
