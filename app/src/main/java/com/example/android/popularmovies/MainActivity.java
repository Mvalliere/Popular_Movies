package com.example.android.popularmovies;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void showPic(View view){


        ImageView test = (ImageView) findViewById(R.id.First_Image);




        test.setBackgroundColor(Color.parseColor("#F03580"));


        Picasso.with(this)
                .load("http://i.imgur.com/DvpvklR.png")
                .into(test);
    }
}
