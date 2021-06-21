package com.example.personal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class Sem1python extends AppCompatActivity {
    List<Products> productList;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1python);

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
                        "Introduction\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FIntro2ITP101.pdf?alt=media&token=b0b60d68-926f-4234-bba5-0bf08776702c"

                ));

        productList.add(
                new Products(
                        2,
                        "Introduction contd\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FIntro2Python.pdf?alt=media&token=5893b611-5300-44e5-8e05-e3bb11486288"

                ));

        productList.add(
                new Products(
                        3,
                        "Functions\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FLecture_Functions_BScIT.pdf?alt=media&token=6c48143b-c3f3-4b17-bdba-e8701c6b3cbf"

                ));

        productList.add(
                new Products(
                        4,
                        "Linx Intro\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FLinuxIntro.pdf?alt=media&token=0a66939b-4acf-48ef-a562-2102d91c7b01"

                ));

        productList.add(
                new Products(
                        5,
                        "ListsTuplesDictionariesSets\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FListsTuplesDictionariesSets.pdf?alt=media&token=fd9266cc-4dca-4376-a02b-2c73dbbbcb39"

                ));

        productList.add(
                new Products(
                        7,
                        "MatPlotLib\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FMatplotlib.pdf?alt=media&token=7fae17a0-e7cf-4903-bfa5-2109ed8f6970"

                ));

        productList.add(
                new Products(
                        8,
                        "Numpy\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FNumpy.pdf?alt=media&token=ef20ba21-2a7a-4bd5-8074-792eb6454d35"

                ));

        productList.add(
                new Products(
                        9,
                        "Strings\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FStrings.pdf?alt=media&token=e9279319-a650-4d9d-b84a-fd922238aa30"

                ));

        productList.add(
                new Products(
                        10,
                        "Files\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FFiles.pdf?alt=media&token=6ebc3d83-5b24-4fca-a198-130c9bdca9ee"

                ));

        productList.add(
                new Products(
                        11,
                        "Exceptions\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FExceptions.pdf?alt=media&token=6e2f3521-610d-4fb1-a182-720c9a3a704c"

                ));

        productList.add(
                new Products(
                        12,
                        "Debugging\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FPython%2FDebugging.pdf?alt=media&token=fcff17cf-f2a6-4cdd-9ade-a11fdddf754f"

                ));

        ProductAdaptor adapter = new ProductAdaptor(Sem1python.this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }

    public void Home(View view) {
    }
}