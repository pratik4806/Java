import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.xml.stream.events.Namespace;
import jdk.jshell.SnippetEvent;

public class StreamDemo7 {
    public static void main(String[] args) {
        // terminal operations

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        
        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach - it is an terminal operator. means it prints the result.
        list.stream().forEach(x -> System.out.println(x));

        // reduce - combines the elements to produce the single result
        Optional<Integer> a = list.stream().reduce(Integer::sum); //method reference
        System.out.println(a.get());

        // count


        // anymatch, allmatch, nonematch
        Boolean b1 =  list.stream().anyMatch(x -> x%2 ==0);
        System.out.println(b1);

        Boolean b2 =  list.stream().allMatch(x -> x%2 ==0);
        System.out.println(b2);

        Boolean b3 =  list.stream().noneMatch( x ->  x < 0);
        System.out.println(b3);

        // findfirst and findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // Example : filtering and collecting names
        List<String> name = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(name.stream().filter(x-> x.length() > 3).toList());

        // Example : Squaring and sorting the numbers
        List<Integer> num = Arrays.asList(5,9,2,8,1,7);
        System.out.println(num.stream().map(x -> x *x ).sorted().toList());

        // Example : summing the values
        List<Integer> values = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sumOptional= values.stream().reduce(Integer :: sum);
        System.out.println(sumOptional.get());

        // Example : find the occurence of character
        String word = "Hello World";
        // chars() internally converts the string into stream.
        System.out.println(word.chars().filter(c -> c == 'l').count());

        










 

    }
}
