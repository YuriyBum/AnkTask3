package com.berum.act2x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    String username = "Виктор";
    Supruga Zhanna = new Supruga();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nameview = findViewById(R.id.textView2);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
        Zhanna.name = "Жанна";
        Zhanna.age = 21;

    }

    @Override
    protected void onStart() {
        super.onStart();


    }


    @Override
    protected void onResume() {
        super.onResume();
        TextView nameview = findViewById(R.id.textView2);
        nameview.append(" Родился ");
        nameview.append("12.03 ");
        nameview.append(" Жена: " + Zhanna.name + ", " + Zhanna.age + " лет от роду. ");
        Toast.makeText(this.getApplicationContext(), "Добро пожаловать на страницу " + username, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView nameview = findViewById(R.id.textView2);
        nameview.append(". Живой! ");
        Toast.makeText(this.getApplicationContext(), "Сворачиваем страницу...", Toast.LENGTH_LONG).show();
    }


}
