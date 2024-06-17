package com.example.sponsor;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String[] CHAMPS = {AccesBDD.NOM_CHAMP};
    private static final int[] VUES = {R.id.ad};
    private SimpleCursorAdapter cursorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q4d);
        this.cursorAdapter = new SimpleCursorAdapter(this,R.layout.q4d, null, MainActivity.CHAMPS, MainActivity.VUES);
        this.cursorAdapter.setViewBinder(new Lieur());

        this.textSponso();
    }

    public void textSponso(){
        AccesBDD accesBDD = new AccesBDD(this);
        SQLiteDatabase sqLiteDatabase = accesBDD.getReadableDatabase();

        Cursor cursor = sqLiteDatabase.query(AccesBDD.NOM_TABLE,MainActivity.CHAMPS,null,null,null,null,null);
        if (cursor != null){
            cursor.moveToLast();
            ((TextView) findViewById(R.id.ad)).setText(cursor.getString(cursor.getPosition()));
        } else {
            Toast.makeText(this, "Erreur base", Toast.LENGTH_SHORT).show();
        }
    }
}