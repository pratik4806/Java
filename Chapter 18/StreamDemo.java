
// import java.util.Arrays;
// import java.util.List;
// import java.util.function.Consumer;
// import java.util.function.Function;
// import java.util.function.Predicate;
// import java.util.function.Supplier;


@FunctionalInterface
interface MathOperation {

    int calculate(int a, int b);
}

class StreamDemo {

    public static void main(String[] args) {
        // java 8 -> minimal code, functional programming
        // java 8 -> lambda expression, streams, Date and time API.
        // lambda expression - is an anonymous function(no name, no return type, no access modifier)
        // functional  - are those interfaces having only one abstract method.

        // thread implementation using lambda expression.
        Thread t = new Thread(() -> {
            System.out.println("hi there");
        });
        t.start();

        // lambda expression for interface implementation
        MathOperation sum = (a, b) -> {
            return a + b;
        };
        MathOperation sub = (a, b) -> {
            return a - b;
        };
        MathOperation mul = (a, b) -> {
            return a * b;
        };
        MathOperation div = (a, b) -> {
            return a / b;
        };

        int a = sum.calculate(1, 6);
        int b = sub.calculate(1, 6);
        int c = mul.calculate(1, 6);
        int d = div.calculate(1, 6);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
