package com.berum.act2x;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String username = "Егор";
    Supruga Nastia = new Supruga();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), FirstActivity.class);
                startActivity(intent);
            }
        });
        Nastia.name = "Анастасия";
        Nastia.age = 19;
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView nameview = findViewById(R.id.text2View2);
        nameview.append(" Хороший человек ");
        nameview.append(" Жена: " + Nastia.name + ", " + Nastia.age + " лет от роду. ");
        Toast.makeText(this.getApplicationContext(), "Добро пожаловать на страницу " + username, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView nameview = findViewById(R.id.text2View2);
        nameview.append(", живой. ");
        Toast.makeText(this.getApplicationContext(), "Сворачиваем страницу...", Toast.LENGTH_LONG).show();
    }

}
