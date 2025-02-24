import java.util.WeakHashMap;

//An entry in a WeakHashMap will automatically be removed when its key is no longer in ordinary use. More precisely, the presence of a mapping for a given key will not prevent the key from being discarded by the garbage collector,

public class _12_WeakHashMap {
    public static void main(String[] args) {
        WeakHashMap<String, Image> ImageCache = new WeakHashMap<>();
        loadCache(ImageCache);
        System.out.println(ImageCache);
        System.gc();  //suggesting JVM for garbage collection.
        simulateApplicationRunning();
        System.out.println("Caches after running (some entries may be cleared)" + ImageCache);


//        NOTE - if we take keys as string in the weak hashmap then also it will not be cleared by the garbage          collector because string are stored in string pool, string pool is a strong reference.

//        WeakHashMap does not follow insertion order because it is not an ordered collection.


    }

    private static void loadCache(WeakHashMap<String,Image> imageCache) {
        String s1 = new String("Img 1");
        String s2 = new String("Img 2");
        imageCache.put(s1, new Image("Image 1"));
        imageCache.put(s2, new Image("Image 2"));
    }

    private static void simulateApplicationRunning() {
        try{
            System.out.println("Simulating Application Running....");
            Thread.sleep(10000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
