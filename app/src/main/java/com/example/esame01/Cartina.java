package com.example.esame01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cartina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartina);
    }


    public void open_exit(View view) {
        Intent intent = new Intent(this, Exit.class);
        startActivity(intent);
    }

    public void open_centifolia(View view) {
        Intent intent = new Intent(this, centifolia.class);
        startActivity(intent);
    }

    public void open_tea(View view) {
        Intent intent = new Intent(this, tea.class);
        startActivity(intent);
    }

    public void open_lincoln(View view) {
        Intent intent = new Intent(this, Lincoln.class);
        startActivity(intent);
    }

    public void open_versicolor(View view) {
        Intent intent = new Intent(this, Versicolor.class);
        startActivity(intent);
    }

}