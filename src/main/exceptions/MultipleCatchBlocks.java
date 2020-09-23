package main.exceptions;

public class MultipleCatchBlocks {

    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            // System.out.println(array[10]);

            int i = 10 / 0;

        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("---Exception 1: Array index Error");
            System.out.println(error);
            System.out.println("---The max index is : " + (array.length - 1));
        } catch (ArithmeticException error) {
            System.out.println("---Exception 2: Maths Error");
            System.out.println(error);
        }

        System.out.println("---Next instruction---");
    }
}
