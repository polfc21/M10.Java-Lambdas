package com.nivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nivell3 {
    public static void main(String[] args) {
        Nivell3 exercicis = new Nivell3();
        List<Alumne> alumnes = exercicis.createAlumnesList();

        exercicis.showExercise(1);
        exercicis.showNameAndAge(alumnes);

        exercicis.showExercise(2);
        exercicis.showAlumnsStartsWithLetter(alumnes,"a");

        exercicis.showExercise(3);
        exercicis.showAlumnsPassed(alumnes);

        exercicis.showExercise(4);
        exercicis.showAlumnsPassedNoPHP(alumnes);

        exercicis.showExercise(5);
        exercicis.showAlumnsAdultsJava(alumnes);
    }

    public List<Alumne> createAlumnesList(){
        List<Alumne> alumnes = new ArrayList<>();
        alumnes.add(new Alumne("Pol",24,"JAVA",10));
        alumnes.add(new Alumne("Maria",44,"PHP",4));
        alumnes.add(new Alumne("Andrea",20,"JAVA",3));
        alumnes.add(new Alumne("Joan",17,"JAVA",7));
        alumnes.add(new Alumne("Jordi",16,"PHP",9));
        alumnes.add(new Alumne("Montse",18,"PHP",2));
        alumnes.add(new Alumne("Laia",39,"JAVA",5));
        alumnes.add(new Alumne("Pere",55,"PHP",6));
        alumnes.add(new Alumne("David",61,"PHP",1));
        alumnes.add(new Alumne("Antonia",49,"JAVA",8));
        return alumnes;
    }

    public void showExercise(int number) {
        System.out.println("--------------------------");
        System.out.println("Exercici número " + number);
        System.out.println("--------------------------");
    }

    public void showNameAndAge(List<Alumne> alumnes){
        alumnes.forEach(x -> System.out.println("Nom: " + x.getName() + ", Edat: " + x.getAge()));
    }

    public void showAlumnsStartsWithLetter(List<Alumne> alumnes, String firstLetter){
        List<Alumne> alumnesA =
            alumnes.stream()
                    .filter(x -> x.getName().toLowerCase().startsWith(firstLetter))
                    .collect(Collectors.toList());
        alumnesA.forEach(System.out::println);
    }

    public void showAlumnsPassed(List<Alumne> alumnes){
        alumnes.stream()
                .filter(x -> x.getMarks() >= 5)
                .forEach(System.out::println);
    }

    public void showAlumnsPassedNoPHP(List<Alumne> alumnes){
        alumnes.stream()
                .filter(x -> x.getMarks() >= 5 && !x.getCourse().equals("PHP"))
                .forEach(System.out::println);
    }

    public void showAlumnsAdultsJava(List<Alumne> alumnes){
        alumnes.stream()
                .filter(x -> x.getAge() >= 18 && x.getCourse().equals("JAVA"))
                .forEach(System.out::println);
    }
}
