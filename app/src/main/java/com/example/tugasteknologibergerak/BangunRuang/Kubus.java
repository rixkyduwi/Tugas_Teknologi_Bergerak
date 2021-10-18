package com.example.tugasteknologibergerak.BangunRuang;

public class Kubus {
    double rusuk;

    public Kubus(double r) {
        rusuk = r;
    }

    public double hitung_luas() {
        return 6 * Math.pow(rusuk, 2);
    }

    public double hitung_keliling() {
        return 12 * rusuk;
    }

    public double hitung_volume() {
        return rusuk * rusuk * rusuk;
    }
}