package main.exceptions;

public class ThrowAndThrowsKeywords {

    public static void main(String[] args) {

        try {

            function();

        } catch (ArithmeticException error) {
            System.out.println("---Arithmetic Exception Triggered");
        }

        System.out.println("---Next instruction");
    }

    public static void function() throws ArithmeticException {
        throw new ArithmeticException();

//        throw new ArithmeticException();

    }
}
