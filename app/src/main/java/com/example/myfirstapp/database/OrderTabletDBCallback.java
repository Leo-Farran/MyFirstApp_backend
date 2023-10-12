package com.example.myfirstapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;

public class OrderTabletDBCallback extends RoomDatabase.Callback {

    private Context context;

    public OrderTabletDBCallback(Context context) {
        this.context = context;
    }

    @Override
    public void onCreate(SupportSQLiteDatabase db) {
        super.onCreate(db);

        // Aquí puedes realizar cualquier operación inicial de la base de datos
    }

}