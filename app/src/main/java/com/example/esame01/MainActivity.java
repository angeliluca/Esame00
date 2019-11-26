/*
 Area commenti, vi chiedo di scrivere qui cose eventualmente utili agli altri.

 */
package com.example.esame01.;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.esame01.R;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void visita(View view) {
        Intent intent = new Intent(this, Visita.class);
        startActivity(intent);
    } }
