
import java.util.Arrays;
import java.util.List;

public class StreamDemo10 {

    public static void main(String[] args) {
        // flatmap
        // handles the collections of lists or arrays where each element is itself a collection.
        // flatten the nested structure (eg. list with in the list) so that they can be processed as a single sequence of element.
        // Transform and flat the elements at the same time.

        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("apple", "Banana"),
                Arrays.asList("Orange", "Kiwi"),
                Arrays.asList("Pear", "Grape")
        );
        System.out.println(listOfList.get(1).get(1));

        // now using the flatmap
        System.out.println(listOfList.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());

        List<String> str = Arrays.asList(
                "Hello World",
                "Java Streams are powerful",
                "Flatmap is very convenient"
        );

        System.out.println(
                str.stream()
                        .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                        .map(String::toUpperCase)
                        .toList());

    }
}
