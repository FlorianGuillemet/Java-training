package main.basics;

public class Strings {

    public static void main(String[] args) {

        String str = "Hello world";
        System.out.println(str);

        System.out.println("-----Character location at 0-----");
        System.out.println(str.charAt(0));

        System.out.println("-----String length-----");
        System.out.println(str.length());

        System.out.println("-----String to uppercase-----");
        System.out.println(str.toUpperCase());

        System.out.println("-----String contains-----");
        System.out.println(str.contains("el"));

    }
}
