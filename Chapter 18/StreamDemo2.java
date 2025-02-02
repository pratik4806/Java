
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class StreamDemo2 {

    public static void main(String[] args) {

        // Bipredicate, BiConsumer, BiSupplier
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));

        BiConsumer<Integer, String> biConsumer = (x,y) ->{
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept(100, "Pratik");

        BiFunction<String, String, Integer> bifunction = (x,y) -> (x+y).length();
        System.out.println(bifunction.apply("Prateek", "something"));






    }
}
