package com.example.arcenciel;

import android.content.Intent;
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

    @Override
    public void onClick(View v) {
        activity.finish();
    }
}
