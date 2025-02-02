
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo6 {

    public static void main(String[] args) {
        // intermediate operations transforms the stream into the another stream.
        // they are lazy means, they donot execute  until the terminal operation is invoked.

        // 1. Filter
        List<String> names = Arrays.asList("Ram", "Shyam", "Ghamshyam", "Akshit", "Prateek", "Prateek");
        // intermediate operation
        Stream<String> filteredStream = names.stream().filter(x -> x.startsWith("A"));
        // terminal operation
        long a = names.stream().filter(x -> x.startsWith("A")).count();

        // 2. Map
        Stream<String> upperCaList = names.stream().map(String::toUpperCase); //method reference

        // Sorted()
        Stream<String> sort = names.stream().sorted();
        Stream<String> sortUsingComparator = names.stream().sorted((v, w) -> v.length() - w.length());

        // 4. distinct
        System.out.println(names.stream().filter(x -> x.startsWith("P")).distinct().count());

        // 5. limit the output
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        // 6. skip operation
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count()); // here the count starts with 11.

    }
}
