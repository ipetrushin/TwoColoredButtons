package com.samsung.itschool.twobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class ButtonActivity extends AppCompatActivity {

    Button one, two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        // связываем переменные с элементами интерфейса
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);

        // получаем переданный интент
        Intent i = getIntent();
        int[] colors = i.getIntArrayExtra("colors");
        //String username = i.getStringExtra("username");
        Log.d("mytag", Arrays.toString(colors));

        // задаём цвета на кнопках
        one.setBackgroundColor(colors[0]);
        two.setBackgroundColor(colors[1]);
    }
    public void onClick(View v) {
        int id = v.getId(); // id кнопки, которая нажата
        if (id == R.id.one) {
            // нажата кнопка one
        } else {
            // нажата кнопка two
        }
        //
    }
}
