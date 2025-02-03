
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {

    public static void main(String[] args) {
        // Stream - introduce in java 8, used to perocess the collection of data in a functional and declarative manner.
        // simply data processing.
        // embrace functional programming
        // improve readibility & maintainibility
        // enable easy parallelism

        // what is stream?
        // a sequence of elements supporting functional and  declarative programming.
        // How to use stream?
        // source, intermediate operation and  terminal operation.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        // creating streams
        // 1. from collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream = list.stream();

        // 2. from arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3. using stream.of()
        Stream<String> stream2 = Stream.of("a", "b", "c");

        // 4. create infinite stream
        Stream<Integer> generate = Stream.generate(() -> 1);
        Stream.iterate(1, a -> a + 1).limit(100).collect(Collectors.toList());

    }
}
