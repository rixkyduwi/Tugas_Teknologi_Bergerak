package com.example.tugasteknologibergerak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class PilihBangunDatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_bangun_datar);
    }



    public void lingkaran(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungLingkaranActivity.class);
        startActivity(intent);
    }

    public void persegi(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungPersegiActivity.class);
        startActivity(intent);
    }

    public void segitiga(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungSegitigaActivity.class);
        startActivity(intent);
    }

}