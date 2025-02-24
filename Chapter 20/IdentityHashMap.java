import java.util.HashMap;
import java.util.Map;

public class IdentityHashMap {
    public static void main(String[] args) {
        String key1 = new String("Key 1");
        String key2 = new String("Key 2");

        Map<String, Integer> map = new HashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);

        System.out.println(map);

    }
}
