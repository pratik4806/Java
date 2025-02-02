
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {

    public static void main(String[] args) {
        // Method reference - use method without invoking & used in place of lambda expression.
        List<String> Students = Arrays.asList("Ram", "shyam", "Ghanshyam");
        // The forEach method in Java internally uses the Consumer<T> functional interface.
        Students.forEach(x -> System.out.println(x));        
        // Method reference
        Students.forEach(System.out::println);


        // Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        @SuppressWarnings("unused")
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList()); 


    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name){
        this.name = name;
    }
}
