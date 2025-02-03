
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {
        // Parallel streams
        // a type of stream that enables parallel processing of the elements.
        // allowing multiple threads to process parts of stream simultaneously
        // this significantly improves the performace for large datasets.
        // workloads is distributed along multiple threads.

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x+1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(StreamDemo9::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime); // 186ms

         // now with parallel stream
        startTime = System.currentTimeMillis();
        list = Stream.iterate(1, x -> x+1).limit(20000).toList();
        factorialList = list.parallelStream().map(StreamDemo9::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime); // 99ms

        startTime = System.currentTimeMillis();
        list = Stream.iterate(1, x -> x+1).limit(20000).toList();
        factorialList = list.parallelStream().map(StreamDemo9::factorial).sequential().toList();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime); // 22ms

        // parallel stream are most effective for the CPU intensive task or large datasets where task are independent
        // they may add overhead for simple task or small datasets.






       



    }
    private  static long factorial(int n){
        long result  =1;
        for (int i = 2; i < n; i++) {
            result = result *i;
        }
        return  result;
    }
}
