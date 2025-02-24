
import java.util.LinkedList;
import java.util.Stack;

// stack class extends the vector class.

public class _08_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(32);
        stack.push(92);
        stack.push(10);
        stack.push(48);
        System.out.println(stack);
        
        stack.add(2,45);
        System.out.println(stack);

        int element = stack.pop();
        System.out.println(element);
        
        int element1 = stack.peek();
        System.out.println(element1);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());


        // stack implementation using LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(12);
        ll.addLast(12);
        ll.addLast(12);
        ll.addLast(12);

        ll.getLast(); //peek
        ll.removeLast(); // pop

        ll.size();
        ll.isEmpty();

        

    }
}
