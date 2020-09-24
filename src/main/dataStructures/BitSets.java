package main.dataStructures;

import java.util.BitSet;

public class BitSets {

    public static void main(String[] args) {

        /*

         */
        BitSet b1 = new BitSet(4);
        BitSet b2 = new BitSet(4);

        b1.set(0, 4, true);

        b2.set(0, false);
        b2.set(1, true);
        b2.set(2, false);
        b2.set(3, true);

        System.out.println("B1 : " + b1);
        System.out.println("B2 : " + b2);

        b1.or(b2);
        System.out.println("B1 : " + b1);

        b1.and(b2);
        System.out.println("B1 : " + b1);

        BitSet b3 = new BitSet(4);
        b3.set(0, true);
        b3.set(1, true);
        b3.set(2, true);
        b3.set(3, true);

        b2.xor(b3);
        System.out.println("B2 : " + b2);


    }


}
