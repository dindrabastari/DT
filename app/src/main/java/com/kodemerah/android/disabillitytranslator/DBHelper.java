package com.kodemerah.android.disabillitytranslator;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Tersandung on 5/20/16.
 */
public class DBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "DT.db";
    public static final String TABLE_NAME = "KATA_DASAR";
    public static final String COL_ID = "ID";
    public static final String COL_KATA = "KATA";
    public static final String COL_LAFAL = "LAFAL";
    public static final String COL_DESKRIPSI = "DESKRIPSI";
    public static final String COL_VIDEO = "VIDEO";


    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " ( " +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_KATA + " TEXT, " +
                COL_LAFAL + " TEXT, " +
                COL_DESKRIPSI + " TEXT, " +
                COL_VIDEO + " TEXT " +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("DATABASE", "OLD VERSION = " + oldVersion);
        Log.d("DATABASE", "NEW VERSION = " + newVersion);
    }

}
