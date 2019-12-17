package com.example.esame01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import static android.content.Intent.ACTION_VIEW;

public class Exit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);
    }
    public void open_Phone(View view) {
        Intent intent = new Intent(ACTION_VIEW, Uri.parse("tel:0546 22932"));
        startActivity(intent);
    }

}
