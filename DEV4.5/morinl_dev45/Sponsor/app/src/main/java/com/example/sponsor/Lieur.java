package com.example.sponsor;

import android.database.Cursor;
import android.view.View;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class Lieur implements SimpleCursorAdapter.ViewBinder {
    @Override
    public boolean setViewValue(View view, Cursor cursor, int i) {
        if (view.getId() == R.id.ad){
            ((TextView) view).setText(cursor.getString(i));
            return true;
        }
        return false;
    }
}
