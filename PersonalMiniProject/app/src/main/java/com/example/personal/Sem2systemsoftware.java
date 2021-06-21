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

public class Sem2systemsoftware extends AppCompatActivity {
    List<Products> productList;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2systemsoftware);

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
                        "UML:Overview\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUnit%201.pdf?alt=media&token=3eb3a235-2b89-41b1-a80d-fdeced8a54f9"

                ));

        productList.add(
                new Products(
                        1,
                        "Software Development Life Cycle\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2Funit1.pdf?alt=media&token=2240f7e4-a37e-4a34-8b59-b4a9b09b0712"

                ));

        productList.add(
                new Products(
                        1,
                        "Incremental Model\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUnit%201%20(1).pdf?alt=media&token=c388f4c9-ba88-4541-a460-c3ce90f256e2"

                ));

        productList.add(
                new Products(
                        1,
                        "UML Use Case Diagram\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUnit%201.6.pdf?alt=media&token=64b4b197-2591-4b67-a513-3515ec70b1e3"

                ));

        productList.add(
                new Products(
                        1,
                        "UML Diagram\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUnit%201.6%20(1).pdf?alt=media&token=38f5d6f4-11a9-4c34-9247-02c445b16013"

                ));
        productList.add(
                new Products(
                        1,
                        "UML Diagram 2\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUML%20Diagrams.pdf?alt=media&token=64d14766-9c23-4e8a-a9eb-277581425ccc"

                ));


        productList.add(
                new Products(
                        1,
                        "UML Sequence Diagram\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUML%20Sequence%20Diagram.pdf?alt=media&token=9ecbce66-3570-4837-8c1c-d039b7d79dd3"

                ));

        productList.add(
                new Products(
                        1,
                        "Activity Diagram\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FActivity%20Diagram.pdf?alt=media&token=1d86fb4f-1711-46b8-84a8-cc01d5a51ed2"

                ));

        productList.add(
                new Products(
                        1,
                        "Software Development Models\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FSoftware%20Development%20Models.pdf?alt=media&token=35426b20-526a-4ab0-b306-e6cdcc2d727a"

                ));

        productList.add(
                new Products(
                        1,
                        "Requirements\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUnit%202.pdf?alt=media&token=2a85279a-2dcd-456d-a17f-f462e3c3ef5a"

                ));

        productList.add(
                new Products(
                        1,
                        "Requirement Analysis and Modeling\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUnit%202%20(1).pdf?alt=media&token=254d3a92-cedb-46ad-84a6-5541d8b435f1"

                ));

        productList.add(
                new Products(
                        1,
                        "Domain Model\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUnit%203.pdf?alt=media&token=7a60968b-52a4-4930-a890-b602c18a1870"

                ));

        productList.add(
                new Products(
                        1,
                        "Associations and Attributes\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUnit%204.pdf?alt=media&token=ecbce2fc-e384-418e-a02d-95fc37397c9f"

                ));

        productList.add(
                new Products(
                        1,
                        "GRASP\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FSoftware%20System%20Design%2FUnit%2010.pdf?alt=media&token=afe3e07e-40dd-4794-9528-6fb4f49d0631"

                ));

        ProductAdaptor adapter = new ProductAdaptor(Sem2systemsoftware.this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

    public void Home(View view) {
        startActivity(new Intent(Sem2systemsoftware.this, MainActivity2.class));
    }
}