package com.example.snula.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.snula.R;
import com.example.snula.setining;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
    public void exet(View view) {
        Intent intent = new Intent(register.this, sledActivity.class);
        startActivity(intent);
    }
    public void log(View view) {
        Intent intent = new Intent(register.this, setining.class);
        startActivity(intent);
    }
}