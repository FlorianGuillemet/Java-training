package main.exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {

//            int i = 10 / 1;

            int i = 10 / 0;

        } catch (ArithmeticException error) {
            System.out.println("---Arithmetic Exception ");
        } finally {
            System.out.println("---finally instruction --> finally block is always executed");
        }

        System.out.println("---Next instruction");
    }

}
