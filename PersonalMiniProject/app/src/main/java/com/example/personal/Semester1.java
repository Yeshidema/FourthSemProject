package com.example.personal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Semester1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester1);
    }

    public void Sem1java(View view) {
        startActivity(new Intent(Semester1.this, Sem1java.class));
    }

    public void Sem1python(View view) {
        startActivity(new Intent(Semester1.this, Sem1python.class));

    }

    public void Sem1operatinfsystem(View view) {
        startActivity(new Intent(Semester1.this, Sem1operatingsystem.class));
    }

    public void Home(View view) {
        startActivity(new Intent(Semester1.this, MainActivity2.class));
    }
}