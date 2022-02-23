package Prac5;

//+ : thread-safe, high performance in multithreading
//- : not a lazy initialization
public class SimpleSingleton {
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private String info;

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    private SimpleSingleton() {
        info = "Simple Singleton";
    }

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }
}
