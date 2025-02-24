
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// copy on write means whenever a write operation like adding or removing an element.
// instead of modifying the existing list.
// a new copy of the list is created, and the modification is applied to that copy
// this ensures that other threads reading the list, while its being modified are unaffected.


// Read operations - fast and direct, since they happen on a stable listwithout interference from the modifiction.
// Write operations - a new copy of the operation is created for every modification. the reference to the list is updated so that subsequent reads this new list.

public class _09_CopyOnWriteArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cowa = new CopyOnWriteArrayList<>();

        // List<String> list = new ArrayList<>();
        // list.add("Milk");
        // list.add("bread");
        // list.add("eggs");

        // for (String items : list) {
        //     System.out.println(items);
        //     if(items.equals("eggs")){
        //         list.add("Butter");
        //         System.out.println("added butter while reading");
        //     }
        // }
        // System.out.println("List after modification" + list);    // here concurrent modification exception will come.

        
        List<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("Milk");
        list1.add("bread");
        list1.add("eggs");

        for (String items : list1) {
            System.out.println(items);
            if(items.equals("eggs")){
                list1.add("Butter");
                System.out.println("added butter while reading");
            }
        }
        System.out.println("List after modification" + list1);



        

    }
}
