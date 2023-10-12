package com.example.myfirstapp.OrderTabletDAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myfirstapp.OrderTabletEntities.Postre;

import java.util.List;

@Dao
public interface PostreDao {

    @Insert
    default void insert(PostreDao postre) {

    }

    @Update
    default void update(PostreDao postre) {

    }

    @Delete
    default void delete(PostreDao postre) {
    }

    @Query("SELECT * FROM Postres")
    default List<Postre> getAllPostre() {


        return null;
    }

}
