package main.dataStructures;

import java.util.Arrays;

public class Enum {

    /*
    Déclaration facile des constantes et les valeurs reliées.
    Les énumérations hérite de la classe java.lang.Enum.
    Les énumérations ne peuvent pas implémenter des interfaces.
    Les énumérations ne peuvent pas hériter des classes.
    Les méthodes et les variables peuvent être déclarées comme dans la classe.
    Les variables et les constructeurs sont déclarés private.
    Permettre de comparer deux énumérations en utilisant la méthode compareTo().
    Les énumérations sont utilisées avec l'instruction Switch.
     */
    public enum Animals {
        DOG, CAT, COW, LION
    }

    public static void main(String[] args) {

        for (Animals animal: Animals.values()) {
            System.out.println(animal);
        }

        System.out.println(Arrays.asList(Animals.values()).toString());

        System.out.println(Animals.CAT);
        System.out.println(Animals.DOG.toString());

        Animals animal = Animals.LION;
        System.out.println(animal.toString());

        System.out.println(animal.valueOf("CAT"));


    }
}
