package fr.iut_fbleau.apl41.couleurs;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Supprimer implements View.OnClickListener{
    private Activity activity;
    private long idBase;

    public Supprimer(Activity activity, long idBase) {
        this.activity = activity;
        this.idBase = idBase;
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        i.putExtra("id", idBase);
        activity.setResult(0, i);
        activity.finish();
    }
}
