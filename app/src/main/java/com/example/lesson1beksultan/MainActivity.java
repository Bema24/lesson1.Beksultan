package com.example.lesson1beksultan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);
        Glide.with(this).load("https://i.pinimg.com/474x/23/ab/a6/23aba60b66ef08174bb7455c4a8a2d2f.jpg").into(image);
        Log.d("ololo", "onCreate: Рождаемся");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ololo", "onStart: Дышим");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ololo", "onResume: Живем");
    }
}