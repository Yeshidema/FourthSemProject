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

public class Sem4mobile extends AppCompatActivity {
    List<Products> productList;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4mobile);

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
                        "Unit 1_Part1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FMobile%20Application%2FUnit1%2FUnitI_PartI.pdf?alt=media&token=93aef66c-0d0c-46fb-9f50-9197421bf4db"

                ));

        productList.add(
                new Products(
                        2,
                        "Unit 4_Part1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FMobile%20Application%2FUnit4%2FUnitIV_PartI.pdf?alt=media&token=44c3b9ee-f763-40ea-a9d6-88367d61acb2"

                ));

        productList.add(
                new Products(
                        3,
                        "Unit 4_Part2\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FMobile%20Application%2FUnit4%2FUnitIV_PartII.pdf?alt=media&token=a1940c82-509e-4fcb-ba49-7a6c31d0c369"

                ));

        productList.add(
                new Products(
                        4,
                        "Unit 4_Part3\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FMobile%20Application%2FUnit4%2FUnitIV_PartIII.pdf?alt=media&token=9727d7b7-2298-4830-8d4d-1b04ebc2c80a"

                ));

        productList.add(
                new Products(
                        5,
                        "Unit 4_Part4\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FMobile%20Application%2FUnit4%2FUnitIV_PartIV.pdf?alt=media&token=8e87554a-a4e4-4b67-8069-96f2e3c0ed14"

                ));

        productList.add(
                new Products(
                        6,
                        "Unit 4_Part5\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FMobile%20Application%2FUnit4%2FUnitIV_PartV.pdf?alt=media&token=7dc8226d-ea47-4e19-a36d-297898e788f0"

                ));

        productList.add(
                new Products(
                        7,
                        "Unit 4_Part6\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FMobile%20Application%2FUnit4%2FUnitIV_PartVI.pdf?alt=media&token=c6f60436-2020-4c87-bf2f-72bb6b11ff97"

                ));

        ProductAdaptor adapter = new ProductAdaptor(Sem4mobile.this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }

    public void Home(View view) {
        startActivity(new Intent(Sem4mobile.this, MainActivity2.class));
    }
}