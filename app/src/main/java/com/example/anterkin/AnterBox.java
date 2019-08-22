package com.example.anterkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AnterBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anter_box);
        final EditText name = findViewById(R.id.edit_text_nama);
        final EditText alamat = findViewById(R.id.edit_text_alamat);
        final EditText pesanan = findViewById(R.id.edit_text_pesan);
        Button button = findViewById(R.id.btn_order);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AnterBox.this, BoxReport.class);
                i.putExtra("name", name.getText().toString());
                i.putExtra("alamat", alamat.getText().toString());
                i.putExtra("pesanan", pesanan.getText().toString());
                startActivity(i);
            }
        });
    }
}
