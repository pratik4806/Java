import java.util.Comparator;

public class _04_StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // return o1.compareTo(o2); // Correct way to compare strings in ascending order
        return o2.length() - o1.length(); // Correct way to compare strings in descending order
    }
    
}
