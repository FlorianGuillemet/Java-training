package main.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        System.out.println("\n"+ "HashMap");
        Map mappy = new HashMap<>();

        mappy.put("Key1", "Value1");
        mappy.put("Key2", "Value2");
        mappy.put("Key3", "Value3");
        mappy.put("Key4", "Value4");
        mappy.put("Key5", "Value5");

        System.out.println(mappy);
        System.out.println(mappy.get("Key3"));
        System.out.println(mappy.containsKey("Key3"));

        // EntrySet
        Iterator it = mappy.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry m = (Map.Entry) it.next();
            System.out.println(m.getKey() + " - " + m.getValue());
        }

        // Sorted Map
        System.out.println("\n"+ "TreeMap");
        TreeMap mappy2 = new TreeMap();

        mappy2.put("Key5", "Value1");
        mappy2.put("Key2", "Value2");
        mappy2.put("Key3", "Value3");
        mappy2.put("Key0", "Value4");
        mappy2.put("Key1", "Value5");
        mappy2.put("1", "Value5");
        mappy2.put("true", "Value5");
        mappy2.put("Yeah", "Value5");

        System.out.println(mappy2);
    }
}
