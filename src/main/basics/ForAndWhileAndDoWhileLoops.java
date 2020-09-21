package main.basics;

public class ForAndWhileAndDoWhileLoops {

    public static void main(String[] args) {

        System.out.println("-------Increase-----------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("-------Decrease-----------");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("-------Increase +2-----------");
        for (int i = 0; i < 10; i+= 2) {
            System.out.println(i);
        }

        System.out.println("-------Ne rentre pas dans la boucle--------");
        for (int i = 100; i > 1000; i--) {
            System.out.println("Ne rentre pas dans la boucle");
        }

        System.out.println("-------While loop-----------");
        int j = 0;

        while (j < 10) {
            System.out.println(j);
            j++;
        }

        System.out.println("-------Do While loop-----------");
        int k = 0;

        do {
            System.out.println(k);
            k++;
        } while(k < 10);

        System.out.println("-------A Do While loop with an exit condition-----------");
        int l = 0;

        do {
            System.out.println(l);
            l++;
        } while(l < -10);

        System.out.println("-------Break statement -> exit loop-----------");
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("-------Continue statement -> pass to the next value of the loop-----------");
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

    }
}
