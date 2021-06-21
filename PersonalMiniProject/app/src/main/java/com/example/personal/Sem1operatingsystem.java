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

public class Sem1operatingsystem extends AppCompatActivity {
    List<Products> productList;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1operatingsystem);

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
                        "Hardware and Software\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F1%20Hardware%20and%20Software%20(1)-converted.pdf?alt=media&token=ae4d6638-8a24-4a3c-9cb8-b1459de5661f"

                ));

        productList.add(
                new Products(
                        2,
                        "Input and Output Devices\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F2%20Different%20types%20of%20%20Input%20and%20Output%20devices.pdf?alt=media&token=7d365229-7d3b-431d-a8ef-4fe2cae16f0b"

                ));

        productList.add(
                new Products(
                        2,
                        "Basics of Operating System\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F3%20Basics%20of%20Operating%20System.pdf?alt=media&token=d800805b-6744-4058-ac4c-3b9d2ba92c8b"

                ));



        productList.add(
                new Products(
                        2,
                        "Types of Operating System\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F6%20Types%20of%20Operating%20System.pdf?alt=media&token=aa620427-ba9f-4e5b-b9b7-2cefdad40e8c"

                ));

        productList.add(
                new Products(
                        2,
                        "Processes\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F7%20%20Processes.pdf?alt=media&token=1408d2c8-d0f7-44c1-9cb6-3b92f6501f0f"

                ));

        productList.add(
                new Products(
                        2,
                        "Processes Scheduling\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F8%20Process%20Scheduling.pdf?alt=media&token=595ae04d-278d-4c4c-8fd6-0d109133d278"

                ));

        productList.add(
                new Products(
                        2,
                        "InterProcesses Communication\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F9%20Inter%20Process%20Communication.pdf?alt=media&token=95bb92c0-b9ab-4b1f-b681-4ad2c8d1724d"

                ));

        productList.add(
                new Products(
                        2,
                        "Memory Management\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F10%20Memory%20Management.pdf?alt=media&token=d27ecb8b-e681-462d-88af-228416503d93"

                ));

        productList.add(
                new Products(
                        2,
                        "Unix Introduction and Distribution\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F13%20Unix%20Introduction%20and%20distribution.pdf?alt=media&token=7c654c30-73c9-4d8d-b571-c6bccc382ce1"

                ));

        productList.add(
                new Products(
                        2,
                        "Mobile OS\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F14%20Mobile%20OS%2C%20its%20variety%20and%20versions.pdf?alt=media&token=dc9d2ea4-5274-4de2-8981-23b6e543b5c0"

                ));

        productList.add(
                new Products(
                        2,
                        "OS Image\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F15%20OS%20image.pdf?alt=media&token=f389fd79-4aae-4759-8e74-5590499bfa8b"

                ));

        productList.add(
                new Products(
                        2,
                        "Virtualization\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F16%20Virtualization.pdf?alt=media&token=d4e99884-e353-46ad-a7ba-9554cbe169be"

                ));

        productList.add(
                new Products(
                        2,
                        "OS Security\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F17%20OS%20Security.pdf?alt=media&token=6ac2fa4c-ac14-47c6-a8b0-6297b9b78618"

                ));

        productList.add(
                new Products(
                        2,
                        "Antivirus\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F18%20Antivirus.pdf?alt=media&token=e3c2a843-f9a9-44da-af09-f75dfce2b857"

                ));

        productList.add(
                new Products(
                        2,
                        "Firewall\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester1%2FOperating%20System%2F19%20Firewall.pdf?alt=media&token=cd90d4ec-09c0-4a3f-b578-384fea7753dc"

                ));



        ProductAdaptor adapter = new ProductAdaptor(Sem1operatingsystem.this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

    public void Home(View view) {
    }
}