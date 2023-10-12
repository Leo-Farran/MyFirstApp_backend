package com.example.myfirstapp.OrderTabletDAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myfirstapp.OrderTabletEntities.Entrada;

import java.util.List;

@Dao
public interface EntradaDao {

    @Insert
    void insert(Entrada entrada);

    @Update
    void update(Entrada entrada);

    @Delete
    void delete(Entrada entrada);

    @Query("SELECT * FROM Entradas")
    List<Entrada> getAllEntrada();
}

