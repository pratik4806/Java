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

public class _10_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>(17, 0.5f);
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

        for (int i : keys) {
            System.out.println(hashMap.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue().toUpperCase());
        }

        hashMap.remove(2);
        boolean xyxy = hashMap.remove(3, "xyxy");
        System.out.println(xyxy);

//        internal working of the hashmap
//        there are 4 components of the hashmap -key, value, bucket, hash function.
//        key - an identifier is used to retrieve the value.
//        value - the data associated with the key.
//        bucket - the place where the key-value pairs are stored. think of buckets as  cells in a list(array).
//        hash function - converts the key into an index(bucket location) for storage i.e where out key is              stored that location.

//        A hash function is an algorithm that takes an input (or "key") and returns a fixed-size string of             bytes, typically a numerical value. The output is known as a hash code, hash value, or simply hash.           The primary purpose ofa hash function is to map data of arbitrary size to data of fixed size.

//        Deterministic: The same input will always produce the same output.
//        Fixed Output Size: Regardless of the input size, the hash code has a
//        consistent size (e.g., 32-bit, 64-bit).
//        Efficient Computation: The hash function should compute the hash quickly.

//        How data is stored in hashmap ?
//        Step 1: Hashing the Key
//        First, the key is passed through a hash function to generate
//        a unique hash code (an integer number). This hash code
//        helps determine where the key-value pair will be stored in
//        the array (called a "bucket array").

//        Step 2: Calculating the Index
//        The hash code is then used to calculate an index in the array (bucket location) using
//        int index = hashCode % arraySize;
//        The index decides which bucket will hold this key-value pair.
//        For example, if the array size is 16, the key's hash code will be divided by
//        16, and the remainder will be the index.

//        Step 3: Storing in the Bucket
//        The key-value pair is stored in the bucket at the calculated index. Each  bucket can hold multiple key-value pairs (this is called a collision handling mechanism, discussed later).

//        EX. map.put "app e", 50);
//        "apple" is the key.
//        50 is the value.
//        The hash code of "apple" is calculated.
//        The index is found using the hash code.
//        The pair ("apple", 50) is stored in the corresponding bucket.

//        How HashMap Retrieves Data
//        When we call get(key), the HashMap follows these steps:
//        Hashing the Key: Similar to insertion, the key is hashed using the same hash function
//        to calculate its hash code.
//        Finding the Index: The hash code is used to find the index of the bucket
//        where the key-value pair is stored.
//        Searching in the Bucket: Once the correct bucket is found, it checks for the key in that bucket.
//        If it finds the key, it returns the associated value.

//        how hashmap stores the key value pair during collision
//        class Node<K, V> {
//            final int hash;  hash code of the key
//            final K key;   the key itself
//            V value; the value associated with the key
//            Node<K, V> next;  pointer to the next node in case of a collision (linked list)
//    }

//        Handling Collisions
//        Since different keys can generate the same index (called a collision),
//        HashMap uses a technique to handle this situation. Java's HashMap
//        uses Linked Lists (or balanced trees after Java 8) for this.
//        If multiple key-value pairs map to the same bucket, they are stored in a linked list inside the              bucket.
//        When a key-value pair is retrieved, the HashMap traverses the linked list, checking each key until           it finds a match.


//        Handling Collisions
//        map.put("apple", 50);
//        map.put("banana", 30);
//        map.put("orange", 80);
//        Let's say "apple" and "orange" end up in the same bucket due to a hash collision. They will be               stored in a linked list in that bucket:
//        Bucket 5: ("apple", 50) -> ("orange", 80)
//        When we do map.get("orange"), HashMap will go to Bucket 5 and then traverse the linked list to find          the entry with the key "orange".

//        HashMap Resizing (Rehashing)
//        HashMap has an internal array size, which by default is 16. When the number of elements (key-value           pairs) grows and exceeds a certain load factor (default is 0.75), HashMap automatically resizes the          array to hold more data. This process is called rehashing.

//        The default size of the array is 16, so when more than 12 elements (16 * 0.75) are inserted, the             HashMap will resize.

//        Time Complexity
//        HashMap provides constant time 0(1) performance for basic operations like put() and get() (assuming          no collisions). However, if there are many collisions, and many entries are stored in the same               bucket, the performance can degrade to O(n),where n is the number of elements in that bucket.
//        But after Java 8, if there are too many elements in a bucket, HashMap switches to a balanced tree            instead of a linked list to ensure better performance O(log n).
















    }
}

