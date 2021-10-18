package com.example.tugasteknologibergerak;

public class Polymorphism {

    int display() {
        int a = 10;

        return a;
    }

    int display(int nilai1) {
        int a = 10;
        int b;

        b = a + nilai1;

        return b;
    }

    int display(int nilai1, int nilai2) {
        int c;

        c = nilai1 + nilai2;

        return c;
    }

    float display(float nilai1) {
        float d;

        d = nilai1 * 100;

        return d;
    }

    String display(String message) {
        String str = "Method ";

        str = str.concat(message);

        return str;
    }
}