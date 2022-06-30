package com.example.snula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.snula.screens.MainActivity;
import com.example.snula.screens.Your_home;

public class light extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
    public void addRoom(View view) {
        Intent intent = new Intent(light.this, Add_room.class);
        startActivity(intent);
    }
    public void goTerm(View view) {
        Intent intent = new Intent(light.this, temperatura.class);
        startActivity(intent);
    }
    public void goToMainScreen(View view) {
        Intent intent = new Intent(light.this, Your_home.class);
        startActivity(intent);
    }
}