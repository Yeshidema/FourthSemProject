package com.example.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Semester3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester3);
    }

    public void Sem3SoftwareEngineering(View view) {
        Intent intent = new Intent(Semester3.this, Sem3softwareengineering.class);
        startActivity(intent);
    }

    public void Sem3ADS(View view) {
        Intent intent = new Intent(Semester3.this, Sem3ads.class);
        startActivity(intent);
    }

    public void Home(View view) {
    }
}