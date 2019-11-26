/*
 Area commenti, vi chiedo di scrivere qui cose eventualmente utili agli altri.
 prova
 */
package com.example.rosetopersolino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void visita(View view) {
        Intent intent = new Intent(this, Visita.class);
        startActivity(intent);
    } }
