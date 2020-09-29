package main.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        /*
        Une collection de type Set ne permet pas l'ajout de doublons ni l'accès direct à un élément de la collection.
        Les fonctionnalités de base de ce type de collection sont définies dans l'interface java.util.Set.
         */
        System.out.println("HashSet typé: " + "HashSet<String> cars3 = new HashSet<String>();");
        System.out.println("HashSet is Implemented using a hash table. " +
                "\nElements are not ordered. " +
                "\nThe add, remove, and contains methods have constant time complexity O(1).");
        System.out.println("\n" +"HashSet typé: " + "HashSet<String> cars3 = new HashSet<String>();");
        HashSet<String> cars3 = new HashSet<String>();

        cars3.add("BMW");
        cars3.add("Honda");
        cars3.add("Renault");
        System.out.println(cars3);
        // System.out.println(cars3.get(0));



        System.out.println("Set non typé: " + "Set motos = new HashSet();");
        Set motos = new HashSet();

        motos.add("Suzuki");
        motos.add("Honda");
        motos.add("Kawazaki");
        motos.add(1);
        motos.add(true);
        System.out.println(motos);


        System.out.println("\n" +"Set typé: " + "Set<String> cars");
        Set<String> cars = new HashSet();

        cars.add("BMW");
        cars.add("Honda");
        cars.add("Renault");
        // cars.add(1);

        System.out.println(cars);
        System.out.println("\nduplicate test with adding \"Honda\"");
        cars.add("Honda");
        System.out.println(cars);



        System.out.println("\n" +"Set faussement typé: " + "Set cars2 = new HashSet<String>();");
        Set cars2 = new HashSet<String>();

        cars2.add("BMW");
        cars2.add("Honda");
        cars2.add("Renault");
        cars2.add(1);
        System.out.println(cars2);



        System.out.println("\n" +"TreeSet typé trié: " + "TreeSet<Integer> numbers = new TreeSet();");
        System.out.println("TreeSet is implemented using a tree structure(red-black tree in algorithm book). " +
                "\nThe elements in a set are sorted, but the add, remove, and contains methods has time complexity of O(log (n)). " +
                "\nIt offers several methods to deal with the ordered set like first(), last(), headSet(), tailSet(), etc.");
        TreeSet<Integer> numbers = new TreeSet();
        numbers.add(9);
        numbers.add(2);
        numbers.add(3);
        numbers.add(12);
        numbers.add(1);
        System.out.println(numbers);
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        System.out.println(numbers.headSet(3));
        System.out.println(numbers.tailSet(3));



        System.out.println("\n" +"Set typé trié: " + "Set<Integer> numbers2 = new TreeSet();");
        Set<Integer> numbers2 = new TreeSet(numbers);
        System.out.println(numbers2);
        // System.out.println(numbers2.first());
        // System.out.println(numbers2.last());
        // System.out.println(numbers2.headSet(3));
        // System.out.println(numbers2.tailSet(3));



        System.out.println("\n" +"LinkedHashSet typé trié: " + "TreeSet<Integer> numbers = new TreeSet();");
        System.out.println("LinkedHashSet is between HashSet and TreeSet. " +
                "\nIt is implemented as a hash table with a linked list running through it, so it provides the order of insertion. " +
                "\nThe time complexity of basic methods is O(1)." +
                "\nThe order of the output is certain and it is the insertion order:");
        LinkedHashSet<Integer> numbers3 = new LinkedHashSet<>(numbers);
        System.out.println(numbers3);



        /*
        L'interface SortedSet, ajoutée à Java 1.2,
        définit les fonctionnalités pour une collection de type Set qui garantit l'ordre ascendant du parcours de ses éléments.
         */
        System.out.println("\n" + "SortedSet with a TreeSet instanciation");
        SortedSet sorted = new TreeSet();
        sorted.add(78);
        sorted.add(78);
        sorted.add(80);
        sorted.add(10);
        sorted.add(22);
        System.out.println(sorted);



        System.out.println("\n"+ "A ArrayList in a Set");
        ArrayList<Integer> numbers4 = new ArrayList<>();
        numbers4.add(9);
        numbers4.add(2);
        numbers4.add(3);
        numbers4.add(12);
        numbers4.add(1);
        numbers4.add(1);
        Set<Integer> numbers5 = new HashSet<>(numbers4);
        System.out.println(numbers5);

        System.out.println("duplicate test with adding \"3\" in the Set");
        numbers5.add(3);
        System.out.println(numbers5);

    }
}
