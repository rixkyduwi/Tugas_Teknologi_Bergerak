package com.example.tugasteknologibergerak;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasteknologibergerak.BangunDatar.Lingkaran;

public class HitungLingkaranActivity extends AppCompatActivity {
    EditText edtJariJari;
    TextView txtHasil;
    Double jari;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_lingkaran);

        initial();

    }

    private void initial() {
        edtJariJari = (EditText) findViewById(R.id.edt_jari_lingkaran);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_lingkaran);

        getSupportActionBar().setTitle("Lingkaran");
    }

    public void hitung_luas(View view) {
        try {
            jari = Double.parseDouble(edtJariJari.getText().toString());
            Lingkaran lingkaran = new Lingkaran(jari);
            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + lingkaran.hitung_luas()));


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

    public void hitung_keliling(View view) {
        try {
            jari = Double.parseDouble(edtJariJari.getText().toString());
            Lingkaran lingkaran = new Lingkaran(jari);
            txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + lingkaran.hitung_keliling()));


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
