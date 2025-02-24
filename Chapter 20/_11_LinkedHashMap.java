import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;



public class _11_LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Orange", 10);
        hashMap.put("Apple", 20);
        hashMap.put("Banana", 11);

        hashMap.putIfAbsent("Guava",29);
        Integer apple = hashMap.getOrDefault("Grapes", 0);
        System.out.println(apple);

        Set<Map.Entry<String, Integer>> entries1 = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry: entries1){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



        System.out.println("********************************************");
//       insertion order is maintain in the LinkedHashMap unlike the HashMap
//      internally linkedHashMap having the doubly linked  list. hence it becomes slow in performance as             compared to the HashMap.
//        when the insertion order matters, in that case we use the LinkedHashMap.
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.8f, true);
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Banana", 11);

//        initialCapacity – the initial capacity
//        loadFactor – the load factor
//        accessOrder – the ordering mode - true for access-order, false for insertion-order. means if we want          to get any element from the LinkedHashMap then it will come last.
//        LinkedHashMap is not also thread safe.

        linkedHashMap.get("Banana");  // it will come last.


        Set<Map.Entry<String, Integer>> entries2 = linkedHashMap.entrySet();
        for (Map.Entry<String, Integer> entry: entries2){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
