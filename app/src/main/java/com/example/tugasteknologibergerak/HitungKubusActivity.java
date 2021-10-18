package com.example.tugasteknologibergerak;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasteknologibergerak.BangunRuang.Kubus;

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

        getSupportActionBar().setTitle("Kubus");
    }

    public void hitung_luas(View view) {
        try {
            rusuk = Double.parseDouble(edtRusuk.getText().toString());
            Kubus kubus = new Kubus(rusuk);
            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + kubus.hitung_luas()));


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "" + getString(R.string.masukan_nomor), Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    public void hitung_keliling(View view) {
        try {
            rusuk = Double.parseDouble(edtRusuk.getText().toString());
            Kubus kubus = new Kubus(rusuk);
            txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + kubus.hitung_keliling()));


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    public void hitung_volume(View view) {
        try {
            rusuk = Double.parseDouble(edtRusuk.getText().toString());
            Kubus kubus = new Kubus(rusuk);
            txtHasil.setText(String.valueOf("Hasil :\nVolume = " + kubus.hitung_volume()));


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }
}
