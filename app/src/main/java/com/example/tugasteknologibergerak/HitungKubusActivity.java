package com.example.tugasteknologibergerak;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasteknologibergerak.BangunRuang.Kubus;

import java.util.Objects;

public class HitungKubusActivity extends AppCompatActivity {

    EditText edtRusuk;
    TextView txtHasil;
    Double rusuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_kubus);

        initial();

    }

    private void initial() {
        edtRusuk = (EditText) findViewById(R.id.edt_rusuk);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Kubus");
    }

    @SuppressLint("SetTextI18n")
    public void hitung_luas(View view) {
        try {
            rusuk = Double.parseDouble(edtRusuk.getText().toString());
            Kubus kubus = new Kubus(rusuk);
            txtHasil.setText("Hasil :\nLuas = " + kubus.hitung_luas());

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "" + getString(R.string.masukan_nomor), Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    @SuppressLint("SetTextI18n")
    public void hitung_keliling(View view) {
        try {
            rusuk = Double.parseDouble(edtRusuk.getText().toString());
            Kubus kubus = new Kubus(rusuk);
            txtHasil.setText("Hasil :\nKeliling = " + kubus.hitung_keliling());


        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    @SuppressLint("SetTextI18n")
    public void hitung_volume(View view) {
        try {
            rusuk = Double.parseDouble(edtRusuk.getText().toString());
            Kubus kubus = new Kubus(rusuk);
            txtHasil.setText("Hasil :\nVolume = " + kubus.hitung_volume());

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }
}
