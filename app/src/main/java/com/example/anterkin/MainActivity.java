package com.example.anterkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button anter_food;
    Button anter_ride;
    Button anter_box;
    Button anter_shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void food(View view) {
        Intent food = new Intent(MainActivity.this, AnterFood.class);
        startActivity(food);

    }

    public void box(View view) {
        Intent box = new Intent(MainActivity.this, AnterBox.class);
        startActivity(box);
    }

    public void shop(View view) {
        Intent shop = new Intent(MainActivity.this, AnterShop.class);
        startActivity(shop);
    }

    public void ride(View view) {
        Intent ride = new Intent(MainActivity.this, AnterRide.class);
        startActivity(ride);
    }

}
