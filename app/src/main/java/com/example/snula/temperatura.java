package com.example.snula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.snula.screens.Your_home;

public class temperatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
    public void goToMainScreen(View view) {
        Intent intent = new Intent(temperatura.this, Your_home.class);
        startActivity(intent);
    }
    public void goLightGo(View view) {
        Intent intent = new Intent(temperatura.this, light.class);
        startActivity(intent);
    }
}