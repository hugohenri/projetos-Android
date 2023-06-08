package com.example.persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancodeDados extends SQLiteOpenHelper {

    private static BancodeDados instance =null;

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "BancoInteração.sqlite";
    private Context context;

    public BancodeDados(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public static BancodeDados Sharedinstance(Context context){
        if(instance == null){
            instance = new BancodeDados(context);
        }
        return instance;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query1;
        query1 = "CREATE TABLE IF NOT EXISTS TbAluno (_Matricula INTEGER PRIMARY KEY, NomeAluno TEXT NOT NULL, Email TEXT, Telefone TEXT)";
        db.execSQL(query1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
