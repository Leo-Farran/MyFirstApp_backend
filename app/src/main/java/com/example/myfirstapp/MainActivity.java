package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import com.example.myfirstapp.OrderTabletDAO.EntradaDao;
import com.example.myfirstapp.OrderTabletEntities.Entrada;
import com.example.myfirstapp.database.OrderTabletDB;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OrderTabletDB db = OrderTabletDB.getInstance(this.getApplicationContext());
        EntradaDao dao = db.entradaDao();
        Entrada nuevaEntrada = new Entrada();
        nuevaEntrada.setNombre("Nombre de la entrada");
        nuevaEntrada.setPrecio(10.99);
        nuevaEntrada.setDescripción("Descripción de la entrada");
        dao.insert(nuevaEntrada);
        List<Entrada> entradas = dao.getAllEntrada();
        for (Entrada entrada : entradas) {
            Log.d("MainActivity", "Entrada ID: " + entrada.getId());
            Log.d("MainActivity", "Nombre: " + entrada.getNombre());
            Log.d("MainActivity", "Precio: " + entrada.getPrecio());
            Log.d("MainActivity", "Descripción: " + entrada.getDescripción());
        }
    }

    /** Llamado cuando el usuario toca el botón Enviar */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
