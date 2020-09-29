package main.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        /*
        Une collection de type List permet :
        de contenir des doublons
        d'interagir avec un élément de la collection en utilisant sa position
        d'insérer des éléments null
         */

        System.out.println("Liste non typée: " + "List motos");
        List motos = new ArrayList();

        motos.add("Suzuki");
        motos.add("Honda");
        motos.add("Kawazaki");
        motos.add(1);
        motos.add(true);

        System.out.println(motos);
        System.out.println(motos.get(3));

        for (int i = 0; i < motos.size(); i++) {
            System.out.println(motos.get(i));
        }

        System.out.println("\n" +"Liste typée: " + "List<String> cars");
        System.out.println("ArrayList" +
                "\nArrayList is implemented as a resizable array. As more elements are added to ArrayList, its size is increased dynamically. " +
                "\nIt's elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array.");
        List<String> cars = new ArrayList();

        cars.add("BMW");
        cars.add("Honda");
        cars.add("Renault");

        System.out.println(cars);
        System.out.println(cars.get(0));

        for (String str: cars) {
            System.out.println(str);
        }

        System.out.println("\n" +"Linked Liste typée: " + "List<String> cars");
        System.out.println("LinkedList " +
                "\nLinkedList is implemented as a double linked list. " +
                "\nIts performance on add and remove is better than Arraylist, but worse on get and set methods.");

        LinkedList<String> cars2 = new LinkedList<>();

        cars2.add("BMW");
        cars2.add("Honda");
        cars2.add("Renault");

        System.out.println(cars2);
        System.out.println(cars2.get(1));

        cars2.addFirst("Citroën");
        System.out.println(cars2);

        for (String str: cars2) {
            System.out.println(str);
        }
    }
}
