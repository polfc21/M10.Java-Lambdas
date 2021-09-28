package com.nivell1.fase3;

public class Fase3 {
    public static void main(String[] args) {
        StringInterface stringInterface = x -> new StringBuilder().append(x).reverse().toString();
        System.out.println(stringInterface.reverse("Hola món!"));
    }
}
