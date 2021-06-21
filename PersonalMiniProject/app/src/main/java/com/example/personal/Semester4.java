package com.example.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Semester4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester4);
    }

    public void RetrivePDF(View view) {
        startActivity(new Intent(Semester4.this, Sem4itn201.class));

    }

    public void Sem4mobile(View view) {
        startActivity(new Intent(Semester4.this, Sem4mobile.class));
    }

    public void Home(View view) {
    }
}