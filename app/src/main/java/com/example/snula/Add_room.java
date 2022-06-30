package com.example.snula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.snula.screens.MainActivity;
import com.example.snula.screens.Your_home;

public class Add_room extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
    public void goMenu(View view) {
        Intent intent = new Intent(Add_room.this, Your_home.class);
        startActivity(intent);
    }
}