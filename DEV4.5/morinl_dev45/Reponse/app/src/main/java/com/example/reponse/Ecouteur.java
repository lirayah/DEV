package com.example.reponse;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Ecouteur implements RadioGroup.OnCheckedChangeListener {
    private TextView question;
    private static final String BASE_TEXT = "Quelle est la capitale";
    public Ecouteur(TextView question){
        this.question = question;
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        if (checkedId == R.id.burkina_faso){
            question.setText(BASE_TEXT + " du Burkina Faso?");
        } else if (checkedId == R.id.canada) {
            question.setText(BASE_TEXT + " du Canada?");
        } else if (checkedId == R.id.mongolie) {
            question.setText(BASE_TEXT + " de la Mongolie?");
        }
        question.invalidate();
    }
}
