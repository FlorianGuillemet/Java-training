package main.dataStructures;

import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {

        /*
        La classe java Vector implémente un tableau d'objets similaire à ArrayList.
        Les éléments de Vector sont accessibles à travers d'un indice entier.
        La taille d'un Vector est variable selon le besoin(ajouter ou supprimer des éléments) après la création.

        Vector est synchronisée ce qui veut dire qu'il permet plusieurs opérations au même temps toutefois,
        il ne garantie pas de bonnes performances lors d'une utilisation multi-threading.
        Il est recommandé d'utiliser ArrayList qui donne de bonnes performances
        si vous n'aurez pas besoin de synchroniser la liste.

        Vector implémente l'interface List comme ArrayList,
        son inconvénient est qu'il donne de faible performance
        comme on l'a mentionné à cause de sa synchronisation dans les opération d'ajout, recherche, suppression et modification de ces éléments.
         */
        Vector vector = new Vector();

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement("Last element");

        System.out.println(vector);
        System.out.println(vector.get(0));
        System.out.println(vector.get(2));

    }


}
