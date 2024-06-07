package com.example.tp03;

import android.view.View;
import android.widget.ImageView;

public class Fleche implements View.OnClickListener {
    private ImageView iv;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.drouate){
            this.iv.setImageResource(R.drawable.fleche_droite);
        } else if (v.getId() == R.id.goche) {
            this.iv.setImageResource(R.drawable.fleche_gauche);
        }
    }

    public void setIv(ImageView iv) {
        this.iv = iv;
    }
}
