package com.example.personal;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button mSem1, mSem2, mSem3, mSem4, mSem5, mSem6, mSem7, mSem8;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*int btnLandscape = getResources().getInteger(R.integer.button_inLandscape);*/


        mSem1 = (Button) findViewById(R.id.Sem1);
        mSem2 = (Button) findViewById(R.id.Sem2);
        mSem3 = (Button) findViewById(R.id.Sem3);
        mSem4 = (Button) findViewById(R.id.Sem4);
        mSem5 = (Button) findViewById(R.id.Sem5);
        mSem6 = (Button) findViewById(R.id.Sem6);
        mSem7 = (Button) findViewById(R.id.Sem7);
        mSem8 = (Button) findViewById(R.id.Sem8);

        mSem1.setOnClickListener(this);
        mSem2.setOnClickListener(this);
        mSem3.setOnClickListener(this);
        mSem4.setOnClickListener(this);
        mSem5.setOnClickListener(this);
        mSem6.setOnClickListener(this);
        mSem7.setOnClickListener(this);
        mSem8.setOnClickListener(this);



        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.about:
                Intent intent = new Intent(MainActivity2.this, About.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Sem1:
                startActivity(new Intent(MainActivity2.this, Semester1.class));
                break;

            case R.id.Sem2:
                startActivity(new Intent(MainActivity2.this, Semester2.class));
                break;

            case R.id.Sem3:
                startActivity(new Intent(MainActivity2.this, Semester3.class));
                break;

            case R.id.Sem4:
                startActivity(new Intent(MainActivity2.this, Semester4.class));
                break;

            case R.id.Sem5:
                startActivity(new Intent(MainActivity2.this, Semester5.class));
                break;

            case R.id.Sem6:
                startActivity(new Intent(MainActivity2.this, Semester6.class));
                break;

            case R.id.Sem7:
                startActivity(new Intent(MainActivity2.this, Semester7.class));
                break;

            case R.id.Sem8:
                startActivity(new Intent(MainActivity2.this, Semester8.class));
                break;
        }
    }
}