package com.nivell1.fase1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Fase1 {
    public static void main(String[] args) {
        Fase1 exercicis = new Fase1();

        exercicis.showExercise(1);
        exercicis.showNames(3,'A');

        exercicis.showExercise(2);
        System.out.println(exercicis.getStringNumbers());

        exercicis.showExercise(3);
        List<String> words = exercicis.getListStrings("o");
        exercicis.showListStrings(words);

        exercicis.showExercise(4);
        List<String> words2 = exercicis.getListStrings("o", 5);
        exercicis.showListStrings(words2);

        exercicis.showExercise(5);
        exercicis.showMonthsWithLambda();

        exercicis.showExercise(6);
        exercicis.showMonthsWithMethodReference();
    }

    public void showExercise(int number){
        System.out.println("--------------------------");
        System.out.println("Exercici número " + number);
        System.out.println("--------------------------");
    }

    public void showNames(int length, char firstLetter) {
        List<String> names = Arrays.asList("Pol", "Ana", "Andrea", "Ali", "Mariano", "David");
        names.stream()
                .filter(x -> x.length() == length)
                .filter(x -> x.charAt(0) == firstLetter)
                .forEach(System.out::println);
    }

    public String getStringNumbers() {
        List<Integer> numbers = Arrays.asList(3,44);
        return numbers.stream()
                .map(x -> (x % 2 == 0) ? "e" + x : "o" + x)
                .collect(Collectors.joining(","));
    }

    public List<String> getListStrings(String containingLetter) {
        List<String> words = Arrays.asList("Paco", "Manolo", "Messi", "Oropesa");
        return words.stream()
                .filter(x -> x.contains(containingLetter))
                .collect(Collectors.toList());
    }

    public List<String> getListStrings(String containingLetter, int length) {
        List<String> words = Arrays.asList("Paco", "Manolo", "Messi", "Oropesa");
        return words.stream()
                .filter(x -> x.contains(containingLetter))
                .filter(x -> x.length() > length)
                .collect(Collectors.toList());
    }

    public void showListStrings(List<String> words) {
        words.stream().forEach(System.out::println);
    }

    public void showMonthsWithLambda() {
        List<String> months = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
                "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");
        months.stream()
                .forEach(x -> System.out.println(x));
    }

    public void showMonthsWithMethodReference() {
        List<String> months = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
                "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");
        months.stream()
                .forEach(System.out::println);
    }

}
