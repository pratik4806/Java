
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StreamDemo3 {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = x -> 2*x;
        System.out.println(unaryOperator.apply(5));
        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
        System.out.println(binaryOperator.apply(5,6));
    }
}
