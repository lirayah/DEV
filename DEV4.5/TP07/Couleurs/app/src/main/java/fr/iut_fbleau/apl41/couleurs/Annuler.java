package fr.iut_fbleau.apl41.couleurs;

import android.app.Activity;
import android.view.View;

public class Annuler implements View.OnClickListener {
    private Activity activity;

    public Annuler(Activity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        activity.setResult(1);
        activity.finish();
    }
}
