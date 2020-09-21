package main.basics;

public class Characters {

    public static void main(String[] args) {

        char c = 'a';

        // not compiled
        // char b = "b";

        char t = '\t';
        System.out.println(t + "Hello");

        char d = 'd';
        System.out.println(Character.isLetter(d));

        char char1 = '1';
        System.out.println(Character.isLetter(char1));

        char e = 'E';
        System.out.println(Character.isUpperCase(e));

        char f = 'f';
        System.out.println(Character.toUpperCase(f));
    }
}
