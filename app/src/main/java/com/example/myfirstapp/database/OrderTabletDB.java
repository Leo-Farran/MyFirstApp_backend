package com.example.myfirstapp.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.room.migration.Migration;

import com.example.myfirstapp.OrderTabletDAO.BebidaDao;
import com.example.myfirstapp.OrderTabletDAO.EntradaDao;
import com.example.myfirstapp.OrderTabletDAO.PostreDao;
import com.example.myfirstapp.OrderTabletDAO.PrincipalDao;
import com.example.myfirstapp.OrderTabletEntities.Bebida;
import com.example.myfirstapp.OrderTabletEntities.Entrada;
import com.example.myfirstapp.OrderTabletEntities.Postre;
import com.example.myfirstapp.OrderTabletEntities.Principal;

@Database(entities = {Entrada.class}, version = 1)
public abstract class OrderTabletDB extends RoomDatabase {

    public static OrderTabletDB INSTANCE;

    public static OrderTabletDB getInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, OrderTabletDB.class, "OrderTablet.db")
                    .allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
        return INSTANCE;
    }
    public abstract EntradaDao entradaDao();
    public abstract PrincipalDao principalDao();
    public abstract PostreDao postreDao();
    public abstract BebidaDao bebidaDao();

    }

