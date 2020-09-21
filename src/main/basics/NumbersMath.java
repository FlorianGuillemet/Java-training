package main.basics;

public class NumbersMath {

    public static void main(String[] args) {

        float i = 5.6f;

        System.out.println("-----Round-----");
        System.out.println(Math.round(i));

        System.out.println("-----Log-----");
        System.out.println(Math.log(100));

        System.out.println("-----Power-----");
        System.out.println(Math.pow(10,3));

        System.out.println("-----Square root-----");
        System.out.println(Math.sqrt(9));

        System.out.println("-----PI (Trigonometry)-----");
        double pi = Math.PI;
        System.out.println(pi);

        System.out.println("-----Sine (Trigonometry)-----");
        System.out.println(Math.sin(pi));
        System.out.println(Math.sin(Math.toRadians(60)));

        System.out.println("-----Cosinus(60°) (Trigonometry)-----");
        System.out.println(Math.cos(Math.toRadians(60)));

        System.out.println("-----Random number-----");
        System.out.println(Math.random());

    }
}
