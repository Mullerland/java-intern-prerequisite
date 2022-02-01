package ru.rtech.internship;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String[] tests = {"try it on me", "what about me, huh?", "my name is vasya. london is the capital of great-britain!"};
        for (String s : tests) {
            System.out.println(task1.capitalize(s));
        }

    }
}
