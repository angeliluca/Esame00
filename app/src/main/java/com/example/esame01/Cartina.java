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
        Intent intent = new Intent(this,Exit.class);
        startActivity(intent); }
}
