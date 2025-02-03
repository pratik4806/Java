
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

        // 3. Sorted()
        Stream<String> sort = names.stream().sorted();
        Stream<String> sortUsingComparator = names.stream().sorted((v, w) -> v.length() - w.length());

        // 4. distinct
        System.out.println(names.stream().filter(x -> x.startsWith("P")).distinct().count());

        // 5. limit the output
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        // 6. skip operation
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count()); // here the count starts with 11.

        // 7. peek - it is an intermediate operator
        // performs the operation on each element as it consumes.
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

        // 8. toArray() - terminal operator - converts stream to array.
        Object[] z = Stream.of(1, 2, 3, 4, 5).toArray();
        System.out.println(Arrays.toString(z));

        // 9. min /max
        Optional<Integer> u1 = Stream.of(43, 76, 34, 71).max(Comparator.naturalOrder());
        Optional<Integer> u2 = Stream.of(43, 76, 34, 71).min(Comparator.naturalOrder());
        System.out.println(u1.get());
        System.out.println(u2.get());

        // 10. forEachOrder - it is used with the parallel stream to print the output in ordered manner.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("printing using the parallel stream");
        numbers.parallelStream().forEach(System.out::println);
        System.out.println("printing using the forEachOrdered() stream");
        numbers.parallelStream().forEachOrdered(System.out::println);

        // example
        // streams cannot be used after the terminal operation.
        List<String> names1 = Arrays.asList("Ram", "Shyam", "Ghamshyam", "Akshit", "Prateek", "Prateek");
        Stream<String> s1 = names1.stream();
        // terminal operation
        s1.forEach(System.out::println);
        // List<String> listss = s1.map(String::toLowerCase).toList(); // exception will occur.

    }
}
