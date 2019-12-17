/*
 Area commenti, vi chiedo di scrivere qui cose eventualmente utili agli altri.

 */
package com.example.esame01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import com.example.esame01.R;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setAppLocale(String localeCode){
        Resources resources = getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration config = resources.getConfiguration();
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR1){
            config.setLocale(new Locale(localeCode.toLowerCase()));
        } else {
            config.locale = new Locale(localeCode.toLowerCase());
        }
        resources.updateConfiguration(config, dm);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void visita(View view) {
        Intent intent = new Intent(this, Visita.class);
        startActivity(intent);
    }

    public void setEn(View view){
        setAppLocale("en");
    }

    public void setFra(View view){
        setAppLocale("fr");
    }
    public void setIt(View view){
        setAppLocale("it");
    }

    public void setGer(View view){
        setAppLocale("de");
    }

    public void setSpa(View view){
        setAppLocale("es");
    }



}
