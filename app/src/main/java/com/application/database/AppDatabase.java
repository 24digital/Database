package com.application.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Marion on 3/5/2015.
 */
public class AppDatabase extends SQLiteOpenHelper {

private String createSql= "create table"+ "Person"
        + "("
        +"_id integer primary key autoincrement,"
        +"name text not null,"
        +"phone_num text not null,"
        +")";
    public AppDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createSql);
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
