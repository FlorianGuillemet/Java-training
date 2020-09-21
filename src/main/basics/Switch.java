package main.basics;

public class Switch {

    public static void main(String[] args) {

        int x = 2;

        System.out.println("x = " + x);

        Switch switchObject = new Switch();

        System.out.println("-----------------With break-------------");

        switchObject.switchWithBreak(x);

        System.out.println("-----------------Without break-------------");

        switchObject.switchWithoutBreak(x);


    }

    public void switchWithBreak(int x) {
        switch (x) {
            case 0:
                System.out.println("number = 0");
                break;
            case 1:
                System.out.println("number = 1");
                break;
            case 2:
                System.out.println("number = 2");
                break;
            case 3:
                System.out.println("number = 3");
                break;
            default:
                System.out.println("none value");
        }
    }

    public void switchWithoutBreak(int x) {
        switch (x) {
            case 0:
                System.out.println("number = 0");
            case 1:
                System.out.println("number = 1");
            case 2:
                System.out.println("number = 2");
            case 3:
                System.out.println("number = 3");
            default:
                System.out.println("none value");
        }
    }
}
