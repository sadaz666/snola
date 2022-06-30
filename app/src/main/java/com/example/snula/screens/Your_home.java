package com.example.snula.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.snula.Add_room;
import com.example.snula.R;
import com.example.snula.light;
import com.example.snula.setining;

public class Your_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_home);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
    public void goLogin(View view) {
        Intent intent = new Intent(Your_home.this, sledActivity.class);
        startActivity(intent);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

    public void goAddRoom(View view) {
        Intent intent = new Intent(Your_home.this, Add_room.class);
        startActivity(intent);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);}

    public void golight(View view) {
        Intent intent = new Intent(Your_home.this, light.class);
        startActivity(intent);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);}
    public void gosetting(View view) {
        Intent intent = new Intent(Your_home.this, setining.class);
        startActivity(intent);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);}
}