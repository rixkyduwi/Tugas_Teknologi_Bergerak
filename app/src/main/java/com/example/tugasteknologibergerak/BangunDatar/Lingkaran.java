package com.example.tugasteknologibergerak.BangunDatar;

import com.google.android.material.math.MathUtils;

public class Lingkaran {
    public double jari_jari;
    public Lingkaran(double r) {
        jari_jari = r;
    }

    public double hitung_luas() {
        return Math.PI * Math.pow(jari_jari, 2);
    }

    public double hitung_kelilingg() {
        double a = 3.141592653* 2.0 * jari_jari;

        return a;
    }
}