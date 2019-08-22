package com.example.anterkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FoodReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_report);
        TextView textViewName = findViewById(R.id.textview_nama);
        TextView textViewaAlamat = findViewById(R.id.textview_alamat);
        TextView textViewPesanan = findViewById(R.id.textview_pesanan);
        Bundle bundle = getIntent().getExtras();
        String s= bundle.getString("name");
        String t= bundle.getString("alamat");
        String u= bundle.getString("pesanan");
        textViewName.setText(s);
        textViewaAlamat.setText(t);
        textViewPesanan.setText(u);
    }

    public void balikUtamaDariBox(View view) {
        Intent ride = new Intent(this, MainActivity.class);
        startActivity(ride);
    }
}
