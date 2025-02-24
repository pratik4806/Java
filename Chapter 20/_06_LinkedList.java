import java.util.LinkedList;

// A LinkedList is a linear data structure where each element is a separate object called a node. Each node contains two parts:
// Data: The value stored in the node.
// Pointers: Two pointers, one pointing to the next node (next) and the other pointing to the previous node (previous).

// Performance Considerations
// LinkedList has different performance characteristics compared to ArrayList:
// Insertions and Deletions: LinkedList is better for frequent insertions and deletions in the middle of the list because it does not require shifting elements, as in ArrayList.

//Random Access: LinkedList has slower random access (get(int index)) compared to ArrayList because it has to traverse the list from the beginning to reach the desired index.

// Memory Overhead: LinkedList requires more memory than ArrayList because each node in a linked list requires extra memory to store references to the next and previous nodes.

// Linked List is not also thread safe.
public class _06_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(23);
        ll.add(29);
        ll.add(80);
        ll.add(78);
        ll.add(67);

        ll.addFirst(20);
        ll.addLast(90);
        ll.getFirst();
        ll.getLast();

        System.out.println(ll);

        ll.removeIf(x -> x%2 ==0);
        System.out.println(ll);






    }
}
