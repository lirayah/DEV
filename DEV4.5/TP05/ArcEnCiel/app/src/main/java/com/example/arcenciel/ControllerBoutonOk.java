package com.example.arcenciel;

import android.view.View;
import android.widget.Switch;

public class ControllerBoutonOk implements View.OnClickListener {
    private int[] ids;
    private boolean[] actifs;
    private SecondaryActivity activity;

    public ControllerBoutonOk(int[] ids, boolean[] actifs, SecondaryActivity activity) {
        this.ids = ids;
        this.actifs = actifs;
        this.activity = activity;
    }
//TODO SetOnClickListener ?? (pareil pour le bouton pour aller dans cette activité
    @Override
    public void onClick(View v) {
        for (int i = 0; i < ids.length - 1; i++) {
            Switch s = v.findViewById(ids[i]);
            actifs[i] = s.isChecked();
        }
        activity.setResult(1);
    }
}
