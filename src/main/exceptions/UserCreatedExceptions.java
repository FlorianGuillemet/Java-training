package main.exceptions;

public class UserCreatedExceptions {

    public static void main(String[] args) {

        try {

            throw new MyException("Custom BUGGG...");

        } catch (MyException error) {
            System.out.println(error.toString());
        }
    }

}

class MyException extends Exception {

    String str;

    MyException(String string) {
        str = string;
    }

    public String toString() {
        return (str + "--> This is my exception !!");
    }

}
