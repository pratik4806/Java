
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo8 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering..." + name);
                    return name.length() > 3;
                });

        // this will execute first
        System.out.println("Before terminal operation..");
        List<String> result = stream.collect(Collectors.toList());
        System.out.println("after terminal operation..");
        System.out.println(result);

    }
}
