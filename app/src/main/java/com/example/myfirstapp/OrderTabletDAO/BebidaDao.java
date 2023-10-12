package com.example.myfirstapp.OrderTabletDAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myfirstapp.OrderTabletEntities.Bebida;

import java.util.List;

@Dao
public interface BebidaDao {

    @Insert
    default void insert(BebidaDao bebida) {

    }

    @Update
    default void update(BebidaDao bebida) {

    }

    @Delete
    default void delete(BebidaDao bebida) {
    }

    @Query("SELECT * FROM Bebidas")
    default List<Bebida> getAllPostre() {


        return null;
    }

}