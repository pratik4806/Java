// it is a part of java.util package
// it is a sub interface of the collection interface
// it provides the way to store an ordered collection of elements known as sequence
// List allows for precise control over the element, where the elements are inserted and can contain the duplicate elements 
// the List interface is implemented by the several classes in the java collection framework
// like Arraylist, LinkedList, vector and stack.

// An ArrayList is a resizable array implementation of the List interface. Unlike arrays in Java, which have fixed size
// an ArrayList can change its size dynamically as elements are added or removed. 
// This flexibility makes it a popular choice when the number of elements in a list isn't known in advance.

// Internal working
// Unlike a regular array, which has a fixed size, an ArrayList can grow and shrink as elements are added or removed. 
// This dynamic resizing is achieved by creating a new array when the current array is full and copying the elements to the new array.
// When you create an ArrayList, it has an initial capacity (default is 10).
// The capacity refers to the size of the internal array that can hold elements before needing to resize.


// Adding Elements
// When we add an element to an ArrayList, the following steps occur 
// Check Capacity: Before adding the new element, ArrayList checks if there is enough space in the internal array (elementData). If the array is full, it needs to be resized. 
// resize if Necessary: If the internal array is full, the ArrayList will create a new array with a larger capacity (usually 1.5 times the current capacity) and copy the elements from the old array to the new array.
//Add the Element: The new element is then added to the internal array at the appropriate index, and the size is incremented.

// Removing Elements
// Check Bounds:The ArrayList first checks if the index is within the valid range.

// Remove the Element: The element is removed, and all elements to the right of the removed element are shifted one position to the left to fill the gap.

// Reduce Size: The size is decremented by 1.


// although the initial capacity of the arraylist is 10, if you want to give the capacity then you can.
// if the initial capacity exceeds then the arraylist internally grow by present capacity * 1.5
// eg. initial capacity = 10
// we have put 1 element, it becomes 11
// then new capacity = 11 * 1.5 = 16.5 = 16(Int) 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.event.ListSelectionEvent;

class _02_List{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(11);
        list.add(98);
        list.add(180);

        // for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("***********************");
        for (Integer element : list) {
            System.out.println(element);
        }

        // check if element exist
        System.out.println(list.contains(2));
        
        // remove element
        System.out.println(list.remove(2));
        
        // add element
        list.add(1,38);
        System.out.println(list);
        
        // replace element on that particular index
        list.set(3, 39);
        System.out.println(list);


        // asList method returns the fixed sized list i.e we cannot add elements to the list.
        List<String> l = Arrays.asList("Monday", "Tuesday");
        System.out.println(l.getClass().getName()); 

        // we can modify the fixed sized arraylist
        l.set(1, "Wednesday");
        System.out.println(l.get(1));


        // by the list.of method we can create unmodifiable arraylist i.e wecannot set or add further elements.
        List<Integer> l1 = List.of(1,2,3,4,5);

        List<Integer> l2 = List.of(6,7,8,9,10);

        // adding unmodifiable list to the existing list.
        list.addAll(l1);
        System.out.println(list);

         // Creating an ArrayList of Integer
         ArrayList<Integer> numbers = new ArrayList<>();

         // Adding 5 integer elements
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);
         numbers.add(40);
         numbers.add(50);

        //  remove method generally takes the index - means it removes the element on that particular index. the remove method will remove the first occurence of the element only if your arraylist contains duplicates.
        numbers.remove(1);  //20

        numbers.remove(Integer.valueOf(3)); //40

        // converting the list to the array.
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println(array.toString());


        // sort an arraylist
        Collections.sort(list);
        System.out.println(list);

        

        











        


    }
}