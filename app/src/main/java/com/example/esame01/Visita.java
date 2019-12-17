package com.example.esame01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Scanner;

public class Visita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita);
    }

    /*
    *   TecOrVis è una variabile statica condivisa tra le varie classi del progetto.
    *   Viene settata ad 1 se è stato selezionato tecnico, 0 se è stato selezionato visitatore.
    *   Inizialmente settato a -1
     */
    public static int tecOrVis = -1;

    public void open_mappa_vis(View view) {
        tecOrVis = 0;
        Intent intent = new Intent(this,Mappa.class);
        startActivity(intent);
    }
    public void open_mappa_tec(View view) {
        tecOrVis = 1;
        Intent intent = new Intent(this,Mappa.class);
        startActivity(intent);
    }
}
