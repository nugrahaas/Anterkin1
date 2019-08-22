package com.example.anterkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RideReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_report);
        TextView textViewName = findViewById(R.id.textview_nama);
        TextView textViewDari = findViewById(R.id.textview_asal);
        TextView textViewTujuan= findViewById(R.id.textview_tujuan);
        Bundle bundle = getIntent().getExtras();
        String s= bundle.getString("name");
        String t= bundle.getString("alamat");
        String u= bundle.getString("pesanan");
        textViewName.setText(s);
        textViewDari.setText(t);
        textViewTujuan.setText(u);
    }

    public void balikUtamaDariBox(View view) {
        Intent ride = new Intent(this, MainActivity.class);
        startActivity(ride);
    }
}
