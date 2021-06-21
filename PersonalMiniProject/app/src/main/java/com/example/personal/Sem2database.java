package com.example.personal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class Sem2database extends AppCompatActivity {
    List<Products> productList;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2database);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.r1);
        relativeLayout.startAnimation(animation);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //initializing the productList
        productList = new ArrayList<>();

        productList.add(
                new Products(
                        1,
                        "Chapter 1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20I%20-%20Chapter%2001.pdf?alt=media&token=840952b7-f3cd-4a62-ab41-daf2ab4eb915"

                ));

        productList.add(
                new Products(
                        1,
                        "Chapter 2\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20I%20-%20Chapter%2002.pdf?alt=media&token=6f933ba0-27c2-45a2-8731-524da1a48f19"

                ));

        productList.add(
                new Products(
                        1,
                        "Chapter 3\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20II%20-%20Chapter%2003.pdf?alt=media&token=8978c0ee-c624-4ede-8d3d-973f1217b094"

                ));

        productList.add(
                new Products(
                        1,
                        "Chapter 4\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20II%20-%20Chapter%2004.pdf?alt=media&token=e27b5210-da2a-40c1-97b8-58a840d4ef7e"

                ));

        productList.add(
                new Products(
                        1,
                        "Chapter 5\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20II%20-%20Chapter%2005.pdf?alt=media&token=e7eb5eae-347b-419c-a84a-d350b065b79c"

                ));

        productList.add(
                new Products(
                        1,
                        "Chapter 7\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20III%20-%20Chapter%2007.pdf?alt=media&token=976867b8-b197-41ff-bc9a-51b34afe434e"

                ));

        productList.add(
                new Products(
                        1,
                        "Chapter 9\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20IV%20-%20Chapter%2009.pdf?alt=media&token=3cadbac2-9f9c-4688-bd8a-111b3635e24d"

                ));

        productList.add(
                new Products(
                        1,
                        "Chapter 10\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20V%20-%20Chapter%2010.pdf?alt=media&token=0b6bd0e2-ea04-48b0-968a-fd510032557c"

                ));

        productList.add(
                new Products(
                        1,
                        "Chapter 11\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20VI%20-%20Chapter%2011%20(2).pdf?alt=media&token=028b9e70-313d-4cf7-8253-313b9a256605"

                ));

        productList.add(
                new Products(
                        1,
                        "Chapter 12\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FUnit%20VII%20-%20Chapter%2012.pdf?alt=media&token=b32bda16-b9cc-45bd-adbf-f9321f044ffc"

                ));

        productList.add(
                new Products(
                        1,
                        "Notations in ERD\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FDatabase%2FNotations%20in%20ERD.pdf?alt=media&token=0efd7f48-fdbc-49f2-99d0-94ab082df8c9"

                ));


        ProductAdaptor adapter = new ProductAdaptor(Sem2database.this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

    public void Home(View view) {
        startActivity(new Intent(Sem2database.this, MainActivity2.class));
    }
}