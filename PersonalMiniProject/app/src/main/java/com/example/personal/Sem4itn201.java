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

public class Sem4itn201 extends AppCompatActivity {
    List<Products> productList;

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4itn201);

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
                        "Lecture 1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%201.pdf?alt=media&token=8635365d-7b33-4f84-bdf9-02cbbe6866f0"

                ));

        productList.add(
                new Products(
                        2,
                        "Lecture 2\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%202.pdf?alt=media&token=a422a006-d707-48ec-a0df-5abb4b4462c7"

                ));

        productList.add(
                new Products(
                        3,
                        "Lecture 3\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%203.pdf?alt=media&token=635a6284-670d-4002-ac0e-e9097669d558"

                ));

        productList.add(
                new Products(
                        4,
                        "Lecture 4\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%204.pdf?alt=media&token=9e17ffa2-7d99-4ee1-9031-6baa4f782f15"

                ));

        productList.add(
                new Products(
                        5,
                        "Lecture 5\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%205.pdf?alt=media&token=eb55863b-f6fa-4ad9-8560-fe71e796d985"

                ));

        productList.add(
                new Products(
                        6,
                        "Lecture 6\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%206.pdf?alt=media&token=73e5502a-5a16-44fc-a3cf-8d4cfad6d8cb"

                ));

        productList.add(
                new Products(
                        7,
                        "Lecture 7\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%207.pdf?alt=media&token=f2be5568-fe27-4bbc-ae52-7b82daa3050e"

                ));

        productList.add(
                new Products(
                        8,
                        "Lecture 8\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%208.pdf?alt=media&token=732f035e-f5a9-492f-8f1d-01453837efd5"

                ));

        productList.add(
                new Products(
                        9,
                        "Lecture 9\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%209.pdf?alt=media&token=83340cae-2132-4fda-8be0-8a47c05673ad"

                ));

        productList.add(
                new Products(
                        10,
                        "Lecture 10\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%2010.pdf?alt=media&token=02967fa4-fe97-42fd-9aad-4f4eaf810b0b"

                ));

        productList.add(
                new Products(
                        11,
                        "Lecture 11\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%2011.pdf?alt=media&token=376cccc6-fde6-44e7-b5af-7e602be2b066"

                ));

        productList.add(
                new Products(
                        12,
                        "Lecture 12\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester4%2FNetworking%2FLecture%2012.pdf?alt=media&token=2bc7405a-77a2-43fa-9538-df5b0753b485"

                ));


        ProductAdaptor adapter = new ProductAdaptor(Sem4itn201.this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }

    public void Home(View view) {
        startActivity(new Intent(Sem4itn201.this, MainActivity2.class));
    }
}