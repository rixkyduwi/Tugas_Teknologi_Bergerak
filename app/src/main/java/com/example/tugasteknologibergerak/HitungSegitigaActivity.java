package com.example.tugasteknologibergerak;

import static com.example.tugasteknologibergerak.R.id.radio_hitung_keliling;
import static com.example.tugasteknologibergerak.R.id.radio_hitung_luas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasteknologibergerak.BangunDatar.Segitiga.KelilingSegitiga;
import com.example.tugasteknologibergerak.BangunDatar.Segitiga.LuasSegitiga;

import java.util.Objects;

public class HitungSegitigaActivity extends AppCompatActivity {

    EditText edtText1, edtText2, edtText3;
    TextView txtHasil, txtView1, txtView2, txtView3;
    Button btnHitung;
    Double alas, tinggi, sisiA, sisiB, sisiC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_segitiga);

        initial();
    }

    private void initial() {
        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        edtText3 = (EditText) findViewById(R.id.edt_text_view_3);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtView3 = (TextView) findViewById(R.id.text_view_3);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);


        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        edtText3.setVisibility(View.INVISIBLE);

        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Segitiga");
    }

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case radio_hitung_luas:
                if (checked) {
                    txtView1.setText(getString(R.string.alas));
                    txtView2.setText(getString(R.string.tinggi));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.INVISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.INVISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
            case radio_hitung_keliling:
                if (checked) {
                    txtView1.setText(getString(R.string.sisiA));
                    txtView2.setText(getString(R.string.sisiB));
                    txtView3.setText(getString(R.string.sisiC));
                    edtText1.setText("");
                    edtText2.setText("");
                    edtText3.setText("");
                    btnHitung.setText(getString(R.string.hitung_keliling));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
        }
    }


    @SuppressLint("SetTextI18n")
    public void hitung(View view) {

        String buttonText = btnHitung.getText().toString();
        if (buttonText.equals(getString(R.string.hitung_luas))) {
            try {
                alas = Double.parseDouble(edtText1.getText().toString());
                tinggi = Double.parseDouble(edtText2.getText().toString());
                LuasSegitiga luasSegitiga = new LuasSegitiga(alas, tinggi);
                txtHasil.setText("Hasil :\nLuas = " + luasSegitiga.hitung_luas());



            } catch (Exception e) {
                //jika salah satu kolom tidak diisi
                Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                if (t != null) t.setGravity(Gravity.CENTER);
                toast.show();

            }
        } else {
            try {
                sisiA = Double.parseDouble(edtText1.getText().toString());
                sisiB = Double.parseDouble(edtText2.getText().toString());
                sisiC = Double.parseDouble(edtText3.getText().toString());
                KelilingSegitiga kelilingSegitiga = new KelilingSegitiga(sisiA,sisiB,sisiC);
                txtHasil.setText("Hasil :\nKeliling = " + kelilingSegitiga.hitung_keliling());


            } catch (Exception e) {
                //jika salah satu kolom tidak diisi
                Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                if (t != null) t.setGravity(Gravity.CENTER);
                toast.show();

            }
        }
    }

}
