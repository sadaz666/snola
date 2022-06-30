package com.example.snula.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.snula.R;


import java.util.UUID;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Animation anim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.icon);
        String id = UUID.randomUUID().toString();
        anim= AnimationUtils.loadAnimation(this, R.anim.anim_splash);
        imageView.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() { startActivity(new Intent(MainActivity.this, sledActivity.class));
            }
        },4000);
    }



    /*
    private TextView textView;
    private EditText editText;
    private EditText editText1;
    String mail = "ng";
    String pass = "1111";
    String mailp = "";
    String passp = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String id = UUID.randomUUID().toString();
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextText);
        editText1 = findViewById(R.id.editTextTextPassword);
    }
    public void ggg (View view)
    {
        mailp = editText.getText().toString();
        passp = editText1.getText().toString();


        if(mail.equals(mailp))
        {
            Intent intent = new Intent(MainActivity.this,sledActivity.class);
            startActivity(intent);
            textView.setText(mailp);
        }
        else
        {
            textView.setText(mailp);
            Toast.makeText(getApplicationContext(),"некоректные данные", Toast.LENGTH_LONG).show();
        }

    }
    */
}