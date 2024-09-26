package com.example.sigmowemobilki;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button buttonDisable;

    private Button buttonEnable;

    private int count = 0;

    private TextView counter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        buttonDisable = findViewById(R.id.buttonDisable);

        counter = findViewById(R.id.counter);

        counter.setText("Counter: " + count);

        buttonDisable.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                count++;

                counter.setText("Counter: " + count);

                buttonDisable.setEnabled(false);

            }

        });

        buttonEnable = findViewById(R.id.buttonEnable);

        buttonEnable.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                buttonDisable.setEnabled(true);

            }

        });

    }

}
