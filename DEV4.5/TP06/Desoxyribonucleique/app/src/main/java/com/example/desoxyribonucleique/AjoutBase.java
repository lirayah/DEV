package com.example.desoxyribonucleique;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AjoutBase implements View.OnClickListener{
    private TextView textView;

    public AjoutBase(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        String txt = textView.getText() + b.getText().toString();
        textView.setText(txt);
    }
}
