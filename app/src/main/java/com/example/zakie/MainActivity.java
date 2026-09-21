package com.example.zakie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button superButton1 = findViewById(R.id.superButton1);
        Button superButton2 = findViewById(R.id.superButton2);
        Button superButton3 = findViewById(R.id.superButton3);

        superButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Profile clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        superButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Get Started clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        superButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Chat clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}