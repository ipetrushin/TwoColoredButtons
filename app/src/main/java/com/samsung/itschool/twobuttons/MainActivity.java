package com.samsung.itschool.twobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int red = Color.rgb(255,0,0);
    // задаём палитру цветов
    int [] colors = {Color.RED, Color.GREEN, Color.BLUE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent i = new Intent(this, ButtonActivity.class);
        // передаём палитру цветов (массив чисел)
        i.putExtra("colors", colors);
        // можно передавать и строки тоже
        i.putExtra("username", "Petya");
        // вызываем вторую активность
        startActivity(i);
    }
}
