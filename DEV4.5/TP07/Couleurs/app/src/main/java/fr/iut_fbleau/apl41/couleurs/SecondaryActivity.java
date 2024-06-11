package fr.iut_fbleau.apl41.couleurs;

import android.app.Activity;
import android.os.Bundle;


public class SecondaryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondaryactivity);
        Annuler ba = new Annuler(this);
        findViewById(R.id.annuler).setOnClickListener(ba);
        long id = getIntent().getLongExtra("id",-1);
        Supprimer supprimer = new Supprimer(this, id);
        findViewById(R.id.supprimer).setOnClickListener(supprimer);
    }
}
