package main.dataStructures;

import java.util.Iterator;
import java.util.Properties;

public class Propertiess {

    public static void main(String[] args) {

        /*

         */
        Properties films = new Properties();

        films.put("Star Wars", "Return of the Jedi");
        films.put("Batman", "The Dark Knight Rises");
        films.put("Lord of the Rings", "The Two Towers");

        System.out.println(films);
        System.out.println(films.get("Star Wars"));

        Iterator it = films.keySet().iterator();

        while (it.hasNext())
        {
            String str = (String) it.next();
            System.out.println(str + " : " + films.get(str));
        }

    }


}
