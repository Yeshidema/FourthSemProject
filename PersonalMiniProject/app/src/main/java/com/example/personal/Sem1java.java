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

public class Sem1java extends AppCompatActivity {
    List<Products> productList;

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1java);

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
                        "Unit 1_OOPS\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2F1.%20Unit-I-OOPS.pdf?alt=media&token=9425950d-54bf-4007-8d96-5d8992fa580a"

                ));

        productList.add(
                new Products(
                        2,
                        "Unit 2_OOPS\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2F2.%20Unit-II-OOPS.pdf?alt=media&token=32be1e14-fa06-4c96-afdf-27ec83f1b593"

                ));

        productList.add(
                new Products(
                        3,
                        "Unit 3_Arrays\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2F3.%20Unit-III-Arrays.pdf?alt=media&token=177fcc4d-df18-41f9-a6ec-86a86f3ced3a"

                ));


        productList.add(
                new Products(
                        4,
                        "Unit 4_Methods\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2F4.%20Unit-IV-Methods.pdf?alt=media&token=2a9b3126-7d87-4ee7-8654-0a7ee5a35915"

                ));


        productList.add(
                new Products(
                        5,
                        "Unit 4_Methods_contd\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2F5.%20Unit-IV-Method_Contd.pdf?alt=media&token=fa7afb5f-78f5-4553-afb4-1e2601957e4f"

                ));

        productList.add(
                new Products(
                        6,
                        "Unit 5_Classes\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2F6.%20Unit-V-Classes%20(1).pdf?alt=media&token=2a71a757-6a2b-454e-91fe-355501e34019"

                ));

        productList.add(
                new Products(
                        7,
                        "Unit 6_OPPS Concept\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2F7.%20Unit-VI-OOPS.pdf?alt=media&token=fb9a69d5-7a77-4ad9-8660-4a5a9d7e6190"

                ));

        productList.add(
                new Products(
                        8,
                        "Unit 6_Abstract Interface\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2F8.%20Unit-VI-OOPS-AbstractInterface.pdf?alt=media&token=77d2eea1-8fe2-4e61-abd9-9f64efbac3ef"

                ));

        productList.add(
                new Products(
                        9,
                        "Testing and Debugging\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2F9.%20Unit-VIII-Testing%20%20Debugging.pdf?alt=media&token=4ca40982-c0de-47c1-a6b4-e3e80eb0b7d7"

                ));

        productList.add(
                new Products(
                        10,
                        "Exceptions\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FJava%20Programming%20Language%2FExceptions%20(1).pdf?alt=media&token=0e0e25fd-c894-40b1-b706-442085696570"

                ));


        ProductAdaptor adapter = new ProductAdaptor(Sem1java.this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }

    public void Home(View view) {
    }
}