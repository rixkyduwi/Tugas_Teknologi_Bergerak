package com.example.tugasteknologibergerak;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_kubus);

        initial();

    }

    private void initial() {

    }
        public void lingkaran (View view){
            Intent intent = new Intent(MainActivity.this, HitungLingkaranActivity.class);
            startActivity(intent);
        }

        public void pilihBangunRuang (View view){
            Intent intent = new Intent(MainActivity.this, PilihBangunRuangActivity.class);
            startActivity(intent);
            setContentView(R.layout.activity_pilih_bangun_ruang);
        }

        public void pilihBangunDatar (View view){
            Intent intent = new Intent(MainActivity.this, PilihBangunDatarActivity.class);
            startActivity(intent);
            setContentView(R.layout.activity_pilih_bangun_datar);
        }


}