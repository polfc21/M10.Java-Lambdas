package com.nivell3;

public class Alumne {

    private String name;
    private int age;
    private String course;
    private int marks;

    public Alumne(String name, int age, String course, int marks){
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Alumne [" +
                "Nom = '" + name + '\'' +
                ", Edat = " + age +
                ", Curs = '" + course + '\'' +
                ", Notes = " + marks +
                "]";
    }
}
