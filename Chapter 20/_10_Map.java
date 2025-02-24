// In Java, a Map is an object that maps keys to values. It cannot contain duplicate keys, and each key can map to at most one value. Think of it as a dictionary where you look up a word (key) to find its definition (value).

// Map doesnot extend the collection interface.

// Key Characteristics of the Map Interface
//Key-Value Pairs: Each entry in a Map consists of a key and a value.
//Unique Keys: No two entries can have the same key.
//One Value per Key: Each key maps to a single value.
//Order: Some implementations maintain insertion order(LinkedHashMap), natural order (TreeMap), or no order (HashMap).

//hashmap does not require elements to put into the order.

//hashmap does not follow the insertion order.

//Key Characteristics
//Unordered: Does not maintain any order of its elements.Allows null Keys and Values: Can have one null key and multiple null values.
//Not Synchronized: Not thread-safe; requires external
//synchronization if used in a multithreaded context.
//Performance: Offers constant-time performance (0(1)) for basic operations like get and put, assuming the hash function disperses elements properly.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _10_Map {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Pratik");
        hashMap.put(2, "Rahul");
        hashMap.put(3, "jay");
        System.out.println(hashMap);

        String s = hashMap.get(3);
        System.out.println(s);

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("jay"));

//        keys are unique hence stored in set.
        Set<Integer> keys = hashMap.keySet();

        for (int i:keys){
            System.out.println(hashMap.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry: entries){
            System.out.println(entry.getKey() + " " + entry.getValue().toUpperCase());
        }

        hashMap.remove(2);
        boolean xyxy = hashMap.remove(3, "xyxy");
        System.out.println(xyxy);



    }
}

