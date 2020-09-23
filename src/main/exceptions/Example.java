package main.exceptions;

public class Example {

    public static void main(String[] args) {
        int[] array = new int[10];

        // System.out.println(array[10]);

        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println(error);
            System.out.println("---The max index is : " + (array.length - 1));
        }

        System.out.println("---Next instruction---");
    }
}
