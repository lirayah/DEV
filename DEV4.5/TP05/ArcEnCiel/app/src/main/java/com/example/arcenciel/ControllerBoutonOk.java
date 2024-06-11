package com.example.arcenciel;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
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
        for (int i = 0; i < ids.length - 1; i++) {
            Switch s = activity.findViewById(ids[i]);
            actifs[i] = s.isChecked();
        }
        Intent data = new Intent();
        data.putExtra("actif",actifs);
        activity.setResult(0, data);
        Log.d("jsp","stop");
        activity.finish();
    }
}
