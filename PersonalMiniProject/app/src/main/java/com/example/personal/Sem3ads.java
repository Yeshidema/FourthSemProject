package com.example.personal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Sem3ads extends AppCompatActivity {
    List<Products> productList;

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3ads);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.r1);
        relativeLayout.startAnimation(animation);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //initializing the productList
        productList = new ArrayList<>();
        /*TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Unit 1");
        textView.setTextSize(20);*/

        productList.add(
                new Products(
                        1,
                        "Basics of Algorithms Part 1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2Funit1%2FBasics%20of%20Algorithms%20Part%20I.pdf?alt=media&token=4b0a6476-8f50-4e10-9742-f8c516b06bfa"

                ));

        productList.add(
        new Products(
                2,
                "Basics of Algorithms Part 2\n",
                60000,
                R.drawable.sem4network,
                "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2Funit1%2FBasics%20of%20Algorithms%20Part%20II.pdf?alt=media&token=5b20f794-1fad-43ef-95d2-b2132a2cfcf6"

        ));

        productList.add(
                new Products(
                        3,
                        "Basics of Algorithm Part 3\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2Funit1%2FBasics%20of%20Algorithms%20Part%20III.pdf?alt=media&token=fd12f0d8-d21e-497f-b154-7bffb2df040d"

                ));

        productList.add(
                new Products(
                        4,
                        "Data Structure part 1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit2%2FDataStructure_Part%20I.pdf?alt=media&token=ee8383db-7d65-413f-8525-7a4c406fb350"

                ));

        productList.add(
                new Products(
                        5,
                        "Data Structure part 2\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit2%2FDataStructure_Part%20II.pdf?alt=media&token=6ebad914-783a-4756-bfc4-784af99433de"

                ));

        productList.add(
                new Products(
                        6,
                        "Data Structure part 3\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit2%2FDataStructure_Part%20III.pdf?alt=media&token=3e1bd75f-902f-46f3-ba8f-f18c78c19077"

                ));

        productList.add(
                new Products(
                        7,
                        "Data Structure part 4\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit2%2FDataStructure_Part%20IV.pdf?alt=media&token=5756eb0a-0e20-44b4-bb74-3958a541fde1"

                ));

        productList.add(
                new Products(
                        8,
                        "Sorting Algorithm part 1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit3%2FSorting%20Algorithms_Part%20I.pdf?alt=media&token=f9aac208-09af-41bb-b5d2-373416ce3ed7"

                ));

        productList.add(
                new Products(
                        9,
                        "Sorting Algorithm part 2\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit3%2FSorting%20Algorithms_Part%20II.pdf?alt=media&token=797e8734-e5bf-4ee4-9017-11baa40d91ce"

                ));

        productList.add(
                new Products(
                        10,
                        "Sorting Algorithm part 3\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit3%2FSorting%20Algorithms_Part%20III.pdf?alt=media&token=dae27665-6081-4985-bcbd-d19f9afd8bd0"

                ));

        productList.add(
                new Products(
                        11,
                        "Sorting Algorithm part 4\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit3%2FSorting%20Algorithms_Part%20IV.pdf?alt=media&token=b946a6d5-1117-4c18-b7a7-3c035772d8de"

                ));

        productList.add(
                new Products(
                        12,
                        "Sorting Algorithm part 5\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit3%2FSorting%20Algorithms%20V.pdf?alt=media&token=64334928-4da5-4952-a546-5c5c92e33936"

                ));

        productList.add(
                new Products(
                        13,
                        "Sorting Algorithm part 6\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit3%2FSorting%20Algorithms%20VI.pdf?alt=media&token=c56d53ce-8c77-401c-bca9-b7a7f168dda6"

                ));

        productList.add(
                new Products(
                        14,
                        "Sorting Algorithm part 7\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit3%2FSorting%20Algorithms_Part%20VII.pdf?alt=media&token=cafa4eb7-aadb-4ff4-9248-0a31a5793bec"

                ));

        productList.add(
                new Products(
                        15,
                        "Sorting Algorithm part 8\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit3%2FSorting%20ALgorithms_Part%20VIII.pdf?alt=media&token=b1b10057-651d-4855-8375-9bd1b400634b"

                ));

        productList.add(
                new Products(
                        16,
                        "Merge Sort\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit3%2FMergeSort.pdf?alt=media&token=0fda60cd-55c7-4328-be8c-fd19a757aef7"

                ));

        productList.add(
                new Products(
                        17,
                        "Searching Algorithm part 1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit4%2FSearching%20Algorithms_Part%20I.pdf?alt=media&token=c746d1d5-9766-4374-9e98-9d66e9732653"

                ));

        productList.add(
                new Products(
                        18,
                        "Searching Algorithm part 2\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit4%2FSearching%20Algorithms_Part%20I.pdf?alt=media&token=c746d1d5-9766-4374-9e98-9d66e9732653"

                ));

        productList.add(
                new Products(
                        19,
                        "Searching Algorithm part 3\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit4%2FSearching%20Algorithms_Part%20III.pdf?alt=media&token=e5c9427e-bf7d-40a0-b856-81068c16b560"

                ));

        productList.add(
                new Products(
                        20,
                        "Advanced Data Structure part 1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit5%2FAdvanced%20DataStructure_Part%20I.pdf?alt=media&token=6e8e4723-e70e-4491-8dfd-062445ebf38a"

                ));

        productList.add(
                new Products(
                        21,
                        "Advanced Data Structure part 2\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit5%2FAdvanced%20Data%20Structure_Part%20II.pdf?alt=media&token=594e6e76-49dd-46dd-be24-0bba123644a9"

                ));

        productList.add(
                new Products(
                        22,
                        "Advanced Data Structure part 3\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit5%2FAdvanced%20Data%20Structure_Part%20III.pdf?alt=media&token=f6fdd2a8-13f5-42eb-99f8-8cc6a6057a32"

                ));

        productList.add(
                new Products(
                        23,
                        "Advanced Data Structure part 4\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit5%2FAdvanced%20Data%20Structure_Part%20IV.pdf?alt=media&token=60f074a4-4b8d-4001-8c36-f70d083f5353"

                ));

        productList.add(
                new Products(
                        24,
                        "Advanced Data Structure part 5\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit5%2FAdvanced%20DataStructure_Part%20V.pdf?alt=media&token=93381394-d083-4fc9-bf30-349521473801"

                ));

        productList.add(
                new Products(
                        25,
                        "Advanced Data Structure part 6\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit5%2FAdvanced%20Data%20Structure_Part_VI.pdf?alt=media&token=8a9d613b-b9bc-4432-b94a-f258190bd818"

                ));

        productList.add(
                new Products(
                        26,
                        "AVL Trees\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit5%2Favltrees_with_GUI.pdf?alt=media&token=24e4d22a-feab-4ae2-b7ea-d237c2acf9d1"

                ));

        productList.add(
                new Products(
                        27,
                        "Graphs part 1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit6%2FGraphs_Part%20I.pdf?alt=media&token=a3de3f12-363a-4076-9082-16d6485d5d81"

                ));

        productList.add(
                new Products(
                        28,
                        "Graphs part 2\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit6%2FGraphs_Part%20II.pdf?alt=media&token=6ffd2541-a990-43fe-8081-0776578514df"

                ));

        productList.add(
                new Products(
                        29,
                        "Graphs part 3\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit6%2FGraphs_Part%20III.pdf?alt=media&token=5b739060-3ea9-4420-8041-10f45c8e00b9"

                ));

        productList.add(
                new Products(
                        30,
                        "Graph_BellmenFord\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit6%2FGraph_BellmanFord.pdf?alt=media&token=38f84096-12fb-4374-ba85-d6a990ec7694"

                ));

        productList.add(
                new Products(
                        31,
                        "Graph_Dijkstra\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit6%2FGraph_Dijkstra.pdf?alt=media&token=342133e8-291f-4d3d-af1c-62aa9d3289ea"

                ));

        productList.add(
                new Products(
                        32,
                        "Heap and HeapSort\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit7%2FHeap%20and%20HeapSort.pdf?alt=media&token=9ce8d4cf-1782-477a-a5b0-901fa96df377"

                ));

        productList.add(
                new Products(
                        33,
                        "MST_Demo1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit7%2FMST_Demo1.pdf?alt=media&token=7e9e9a59-178f-49de-8ce9-45ea6aff1045"

                ));

        productList.add(
                new Products(
                        34,
                        "Spanning Tree\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit7%2FSpanning%20Tree_Part%20I.pdf?alt=media&token=258a89ff-f885-41f8-821c-19bea86ecbf0"

                ));

        productList.add(
                new Products(
                        35,
                        "Minimum Spanning Tree_demo1\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester3%2FAlgorithm%20and%20DataStrutures%2FUnit7%2FMinimum%20Spanning%20Tree_Demo1.pdf?alt=media&token=e5b64d72-c117-46cc-93b5-583e388e4a74"

                ));




        ProductAdaptor adapter = new ProductAdaptor(Sem3ads.this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);


    }

    public void Home(View view) {
    }
}