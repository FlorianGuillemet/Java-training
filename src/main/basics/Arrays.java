package main.basics;

public class Arrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};

        int array2[] = {1, 2, 3, 4, 5, 10, 51, 103, 8};
        float array3[] = {1, 2, 3, 4, 5, 10, 51, 103, 8};

        System.out.println("-----Print value at location 0-----");
        System.out.println(array2[0]);

        System.out.println("-----Print length-----");
        System.out.println(array2.length);

        System.out.println("-----Loop-----");
        for (int i =0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("-----For each loop, on float array-----");
        for (float x: array3) {
            System.out.println(x);
        }

        System.out.println("-----Loop with exception java.lang.ArrayIndexOutOfBoundsException-----");
        for (int i =0; i <= array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
