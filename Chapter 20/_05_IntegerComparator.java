import com.sun.source.doctree.ReturnTree;
import java.util.Comparator;

public class _05_IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
       return o2.compareTo(o1); //descending
    }
    
}
