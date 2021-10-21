package com.example.tugasteknologibergerak;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PilihBangunRuangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_bangun_ruang);

    }

    public void kubus(View view) {
        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungKubusActivity.class);
        startActivity(intent);
    }
}
