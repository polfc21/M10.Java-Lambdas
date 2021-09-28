package com.nivell1.fase2;

public class Fase2 {
    public static void main(String[] args) {
        PiInterface numberPi = () -> 3.1415;
        System.out.println(numberPi.getPiValue());
    }
}
