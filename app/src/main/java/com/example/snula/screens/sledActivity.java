package com.example.snula.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.snula.R;

public class sledActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sled);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
    public void reg(View view) {
        Intent intent = new Intent(sledActivity.this, register.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(sledActivity.this, Your_home.class);
        startActivity(intent);
    }
}