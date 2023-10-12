package com.example.myfirstapp.OrderTabletDAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myfirstapp.OrderTabletEntities.Principal;

import java.util.List;

@Dao
public interface PrincipalDao {

    @Insert
    default void insert(PrincipalDao principal) {

    }

    @Update
    default void update(PrincipalDao principal) {

    }

    @Delete
    default void delete(PrincipalDao principal) {
    }

    @Query("SELECT * FROM Principales")
    default List<Principal> getAllPrincipal() {


        return null;
    }

}
