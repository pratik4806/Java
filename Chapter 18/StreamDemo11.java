
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo11 {

    public static void main(String[] args) {
        // Collectors is a utility class
        // provides set of methods to create common collectors.

        // 1. collecting to a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(names);

        // 2. collecting to a set
        List<Integer> nums = Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 5, 6);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. collecting to a collection
        ArrayList<String> alist = names.stream().collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(alist);

        // 4. joining the strings
        String concaString = names.stream().collect(Collectors.joining(", ")).toUpperCase();
        System.out.println(concaString);

        // 5. summarizing the data
        // generates the statistical summary (count, sum, min, max, average)
        List<Integer> numbers = Arrays.asList(2, 6, 22, 65, 234, 4, 61, 23);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());

        // 6. calculating average
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(average);

        // 7. count
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println(count);

        // 8. Grouping elements
        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams", "Collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length()))); // group by the length of the elments in the list.
        System.out.println(words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.joining(", ")
                )));



        System.out.println(words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.counting()
                )));



        TreeMap<Integer, Long> treeMap = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new, Collectors.counting()
                ));
        System.out.println("Treemap -" + treeMap);



        // 9.  Partitioning the elements
        // partitions the elements into the two groups (true or false) base on predicate.
        System.out.println(words.stream().collect(Collectors.partitioningBy(p -> p.length() > 5)));

        // 10. Mapping and collecting
        // applies the mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toLowerCase(), Collectors.toList())));

        // example : Collecting name by length
        List<String> l1 = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        // example : counting word occurence
        String sentence = "Hello World Hello World Java";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x-> x.length(), Collectors.counting())));  
        
        
        // partioning even and odd number
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x-> x%2 ==0)));

        // Summing values in a map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Carrot", 30);
        Optional<Integer> operation =  items.values().stream().reduce(Integer::sum);
        System.out.println(operation);
        System.out.println(items.values().stream().collect(Collectors.summingInt(x->x)));


        // Example : creating a map from the stream elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mangoes");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.length(), x -> x.toUpperCase())));
        

        






    }
}
