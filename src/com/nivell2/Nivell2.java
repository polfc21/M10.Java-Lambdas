package com.nivell2;

import java.util.Arrays;
import java.util.Comparator;

public class Nivell2 {
    public static void main(String[] args) {
        Nivell2 exercicis = new Nivell2();
        String[] array = {"si","33","hello","1","barbacoa","42", "entretingut", "aplicació", "17234", "arbitratge"};

        exercicis.showExercise(1);
        exercicis.showArraySortedByLengthAsc(array);

        exercicis.showExercise(2);
        exercicis.showArraySortedByLengthDesc(array);

        exercicis.showExercise(3);
        exercicis.showArraySortedByAlphabeticOrder(array);

        exercicis.showExercise(4);
        exercicis.showArraySortedByPreference(array, "e");

        exercicis.showExercise(5);
        exercicis.showArrayReplacingCharacters(array, 'a', '4');

        exercicis.showExercise(6);
        exercicis.showArrayOnlyNumericValues(array);

        exercicis.showExercise(7);
        float num1 = 3, num2 = 3;

        OperationInterface suma = (a, b) -> a + b;
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma.operacio(num1,num2));

        OperationInterface resta = (a, b) -> a - b;
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta.operacio(num1,num2));

        OperationInterface multiplicacio = (a, b) -> a * b;
        System.out.println("Multiplicació: " + num1 + " * " + num2 + " = " + multiplicacio.operacio(num1,num2));

        OperationInterface divisio = (a, b) -> a / b;
        System.out.println("Divisió: " + num1 + " / " + num2 + " = " + divisio.operacio(num1,num2));
    }

    public void showExercise(int number) {
        System.out.println("--------------------------");
        System.out.println("Exercici número " + number);
        System.out.println("--------------------------");
    }

    public void showArraySortedByLengthAsc(String[] array) {
        Arrays.stream(array)
                .sorted(Comparator.comparing(x -> x.length()))
                .forEach(System.out::println);
    }

    public void showArraySortedByLengthDesc(String[] array) {
        Arrays.stream(array)
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }

    public void showArraySortedByAlphabeticOrder(String[] array) {
        Arrays.stream(array)
                .sorted(Comparator.comparing(x -> x.charAt(0)))
                .forEach(System.out::println);
    }

    public void showArraySortedByPreference(String[] array, String priority) {
        Arrays.stream(array)
                .sorted(Comparator.comparing((String x) -> x.contains(priority)).reversed())
                .forEach(System.out::println);
    }

    public void showArrayReplacingCharacters(String[] array, char replaced, char replacing) {
        Arrays.stream(array)
                .map(x -> x.replace(replaced, replacing))
                .forEach(System.out::println);
    }

    public void showArrayOnlyNumericValues(String[] array) {
        String regex = "[0-9]*";
        Arrays.stream(array)
                .filter(x -> x.matches(regex))
                .forEach(System.out::println);
    }
}
