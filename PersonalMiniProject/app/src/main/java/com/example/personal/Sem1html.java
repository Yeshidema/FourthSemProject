package com.example.personal;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Sem1html extends AppCompatActivity {
    List<Products> productList;

    RecyclerView recyclerView;

    /*private final String PRODUCTS = "products";

    private SharedPreferences mPreferences;

    private String sharedPreFile = "com.example.personal.sharedPrefs";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1html);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.r1);
        relativeLayout.startAnimation(animation);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        /*mPreferences = getSharedPreferences(sharedPreFile, MODE_PRIVATE);*/



        //initializing the productList
        productList = new ArrayList<>();

        productList.add(
                new Products(
                        1,
                        "HTML Forms\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit%201%20HTML%20Forms.pdf?alt=media&token=dba2059a-2643-4895-b0fd-30aeb13102e9"

                ));

        productList.add(
                new Products(
                        1,
                        "Links and Images\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit%201%20HTML%20Links%20and%20Images.pdf?alt=media&token=b58593fa-2d65-4724-a502-1f58cc1ff5ea"

                ));

        productList.add(
                new Products(
                        1,
                        "Page Layout\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit%201%20HTML%20Page%20layout.pdf?alt=media&token=7da6b050-72ae-4d70-9300-59632c698f29"

                ));

        productList.add(
                new Products(
                        1,
                        "Elements and Attributes\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit%201%20HTML%20elements%20and%20attributes.pdf?alt=media&token=585d01ce-d88e-4253-b25e-f548f1ee8448"

                ));

        productList.add(
                new Products(
                        1,
                        "Multimedia\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit%201%20HTML%20multmedia.pdf?alt=media&token=f490d833-f2ba-450f-a1db-bb09c8449cc2"

                ));

        productList.add(
                new Products(
                        1,
                        "Tables\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit%201%20HTML%20table.pdf?alt=media&token=873ea463-6a29-4da7-9ce5-a38c6f095c87"

                ));

        productList.add(
                new Products(
                        1,
                        "CSS\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit%202%20CSS.pdf?alt=media&token=214459fb-0a59-4752-b1b8-b4cf46f7102d"

                ));

        productList.add(
                new Products(
                        1,
                        "Control Statement\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit3%2FControl%20Statment.pdf?alt=media&token=172d484c-80ad-470d-b4bf-d16d21e42d40"

                ));

        productList.add(
                new Products(
                        1,
                        "Form Validation\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit3%2FFormValidaiton.pdf?alt=media&token=e6181a36-20b9-45b1-9d84-a614353d4b0e"

                ));

        productList.add(
                new Products(
                        1,
                        "JSON and AJAX\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit3%2FJSON%20and%20AJAX.pdf?alt=media&token=0d61c00d-4bcd-42b4-a766-72c5fd57af37"

                ));

        productList.add(
                new Products(
                        1,
                        "Javascript\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit3%2FJavaScrpt.pdf?alt=media&token=0892a248-517c-4d70-bb63-c3156e9bdccb"

                ));

        productList.add(
                new Products(
                        1,
                        "Javascript Event\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit3%2FJavaScript%20Event.pdf?alt=media&token=65641d50-20ff-460e-933e-d93ecdbdf569"

                ));

        productList.add(
                new Products(
                        1,
                        "Objects\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit3%2FObjects.pdf?alt=media&token=9d1afe48-f4c1-4771-b0a8-8ac92e5e92e5"

                ));

        productList.add(
                new Products(
                        1,
                        "HTTP Methods\n",
                        60000,
                        R.drawable.l,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit4%2FHTTP%20Methods.pdf?alt=media&token=c06d82e2-9da5-45d6-8dbb-1a03b5ee2590"

                ));

        productList.add(
                new Products(
                        1,
                        "MVC Architecture\n",
                        60000,
                        R.drawable.sem4network,
                        "https://firebasestorage.googleapis.com/v0/b/personalproject-2021.appspot.com/o/Semester2%2FWeb%20Programming%2FUnit5%2Fmvc.pdf?alt=media&token=201f8c27-1ace-4c4e-9ea6-9b140a801dad"

                ));

        ProductAdaptor adapter = new ProductAdaptor(Sem1html.this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }



    public void Home(View view) {
    }

   /* @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences.Editor preferenceEditor = mPreferences.edit();
        preferenceEditor.putString(PRODUCTS, String.valueOf(productList));
        preferenceEditor.apply();

    }*/
}