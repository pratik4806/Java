// comparator is an interface.

import java.util.Arrays;
import java.util.List;


public class _03_Comparator {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<Integer> numbers = Arrays.asList(3,6,2,5,9,4,1);

        numbers.sort(new _05_IntegerComparator());
        System.out.println(numbers);
        
        words.sort(new _04_StringComparator());  // custom comparator lengthwise.
        System.out.println(words);
    }
}
