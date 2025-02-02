import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamDemo1 {
    public static void main(String[] args) {
         // predicate --> functional interface (boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(20));
        
        Predicate<String> isWordStartsWithP = x -> x.toLowerCase().startsWith("p");
        Predicate<String> isWordStartsWithK = x -> x.toLowerCase().endsWith("k");
        Predicate<String> and = isWordStartsWithP.and(isWordStartsWithK);
        System.out.println(isWordStartsWithP.test("P"));
        System.out.println(and.test("Pratik"));

        // Function Interface
        Function<Integer, Integer> doubleIt = x -> x*2;
        Function<Integer, Integer> tripleIt = x -> x*3;
        System.out.println(doubleIt.apply(1000));

        // it will first double it then triple it, but result is same.
        System.out.println(doubleIt.andThen(tripleIt).apply(100));

        // it will first triple it then double it, but result is same.
        System.out.println(doubleIt.compose(tripleIt).apply(100));

        // identity Method - it will return the argument, that you will pass to the apply method.
        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(23);
        System.out.println(res);


        // Consumer - it accept the parameter and then prints it.
        // Consumer - sirf leta hai deta kuch nahi.
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(56);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<List<Integer>> printList =   x -> {
            for(int i :x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        // supplier - sirf deta hai
        Supplier<String> printHello = () -> "Hello World";
        System.out.println(printHello.get());


        // combined example
        Predicate<Integer> predicate = x -> x%2 ==0;
        Function<Integer,Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
    }
    
}
