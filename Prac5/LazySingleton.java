package Prac5;

//+ : lazy initialization, thread-safe
//- : low performance in multithreading
public class LazySingleton {
    private static LazySingleton single_instance = null;

    public String info;

    private LazySingleton() {
        info = "Lazy Singleton";
    }

    public static synchronized LazySingleton getInstance() {
        if (single_instance == null) {
            single_instance = new LazySingleton();
        }
        return single_instance;
    }
}
