package com.example.utsdwikisulthon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textCounter);
        Button buttonTambah = findViewById(R.id.buttonTambah);
        Button buttonKurang = findViewById(R.id.buttonKurang);

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter += 1;
                textView.setText(String.valueOf(counter));
            }
        });

        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter -= 1;
                textView.setText(String.valueOf(counter));
            }
        });

    }
}