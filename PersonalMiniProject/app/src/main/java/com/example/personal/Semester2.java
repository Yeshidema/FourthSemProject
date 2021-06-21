package com.example.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Semester2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester2);
    }

    public void sem2html(View view) {
        startActivity(new Intent(Semester2.this, Sem1html.class));
    }

    public void Sem2database(View view) {

        startActivity(new Intent(Semester2.this, Sem2database.class));
    }

    public void Sem2systemsoftware(View view) {
        startActivity(new Intent(Semester2.this, Sem2systemsoftware.class));
    }

    public void Home(View view) {
        startActivity(new Intent(Semester2.this, MainActivity2.class));
    }
}