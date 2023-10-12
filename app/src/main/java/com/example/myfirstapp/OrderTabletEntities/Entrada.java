package com.example.myfirstapp.OrderTabletEntities;

import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Entradas")
public class Entrada {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    @NonNull
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(@NonNull Double precio) {
        this.precio = precio;
    }

    @NonNull
    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(@NonNull String descripción) {
        this.descripción = descripción;
    }

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;

    @NonNull
    @ColumnInfo(name = "nombre")
    @Size(max = 25)
    private String nombre;

    @NonNull
    @ColumnInfo(name = "precio")
    private Double precio;

    @NonNull
    @ColumnInfo(name = "descripción")
    @Size(max = 340)
    private String descripción;
}
