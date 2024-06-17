package com.example.sponsor;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class AccesBDD extends SQLiteOpenHelper {
    public static final String NOM_BASE = "publicite";
    public static final int VERSION = 1;
    public static final String NOM_TABLE = "publicite";
    public static final String NOM_CHAMP = "publicite_text";


    public AccesBDD(Context context){
        super(context, AccesBDD.NOM_BASE, null, AccesBDD.VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + AccesBDD.NOM_TABLE + "(" +
                BaseColumns._ID + " integer PRIMARY KEY AUTOINCREMENT, " +
                AccesBDD.NOM_CHAMP + " text NOT NULL" +
                ");");

        ContentValues tuple = new ContentValues();

        tuple.put(AccesBDD.NOM_CHAMP, "aaaaaaaaaaaaaaaaa");
        sqLiteDatabase.insert(AccesBDD.NOM_TABLE, null, tuple);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + AccesBDD.NOM_TABLE);
        this.onCreate(sqLiteDatabase);
    }
}
