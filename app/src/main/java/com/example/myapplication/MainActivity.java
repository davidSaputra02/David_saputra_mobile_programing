package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     b = findViewById(R.id.TampilToast);
     b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "David saputra:C21572002",Toast.LENGTH_SHORT).show();
    }
}