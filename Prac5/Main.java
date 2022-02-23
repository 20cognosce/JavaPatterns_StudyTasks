package Prac5;

public class Main {
    public static void main(String[] args) {
        testLazySingleton();
        testEnumSingleton();
        testSimpleSingleton();
        testClassHolderSingleton();
    }

    static void testLazySingleton() {
        LazySingleton x = LazySingleton.getInstance();
        LazySingleton y = LazySingleton.getInstance();
        LazySingleton z = LazySingleton.getInstance();

        x.info = (x.info).toUpperCase();

        System.out.println("\nString from x is " + x.info + " Object hashcode: " + x.hashCode());
        System.out.println("String from y is " + y.info + " Object hashcode: " + y.hashCode());
        System.out.println("String from z is " + z.info + " Object hashcode: " + z.hashCode());

        z.info = (z.info).toLowerCase();

        System.out.println("String from x is " + x.info + " Object hashcode: " + x.hashCode());
        System.out.println("String from y is " + y.info + " Object hashcode: " + y.hashCode());
        System.out.println("String from z is " + z.info + " Object hashcode: " + z.hashCode());
    }

    static void testEnumSingleton(){
        EnumSingleton x = EnumSingleton.getInstance();
        EnumSingleton y = EnumSingleton.getInstance();
        EnumSingleton z = EnumSingleton.getInstance();

        x.setInfo(x.getInfo().toUpperCase());

        System.out.println("\nString from x is " + x.getInfo() + " Object hashcode: " + x.hashCode());
        System.out.println("String from y is " + y.getInfo() + " Object hashcode: " + y.hashCode());
        System.out.println("String from z is " + z.getInfo() + " Object hashcode: " + z.hashCode());

        z.setInfo(z.getInfo().toLowerCase());

        System.out.println("String from x is " + x.getInfo() + " Object hashcode: " + x.hashCode());
        System.out.println("String from y is " + y.getInfo() + " Object hashcode: " + y.hashCode());
        System.out.println("String from z is " + z.getInfo() + " Object hashcode: " + z.hashCode());
    }

    static void testSimpleSingleton() {
        SimpleSingleton x = SimpleSingleton.getInstance();
        SimpleSingleton y = SimpleSingleton.getInstance();
        SimpleSingleton z = SimpleSingleton.getInstance();

        x.setInfo(x.getInfo().toUpperCase());

        System.out.println("\nString from x is " + x.getInfo() + " Object hashcode: " + x.hashCode());
        System.out.println("String from y is " + y.getInfo() + " Object hashcode: " + y.hashCode());
        System.out.println("String from z is " + z.getInfo() + " Object hashcode: " + z.hashCode());

        z.setInfo(z.getInfo().toLowerCase());

        System.out.println("String from x is " + x.getInfo() + " Object hashcode: " + x.hashCode());
        System.out.println("String from y is " + y.getInfo() + " Object hashcode: " + y.hashCode());
        System.out.println("String from z is " + z.getInfo() + " Object hashcode: " + z.hashCode());
    }

    static void testClassHolderSingleton() {
        ClassHolderSingleton x = ClassHolderSingleton.getInstance();
        ClassHolderSingleton y = ClassHolderSingleton.getInstance();
        ClassHolderSingleton z = ClassHolderSingleton.getInstance();

        x.setInfo(x.getInfo().toUpperCase());

        System.out.println("\nString from x is " + x.getInfo() + " Object hashcode: " + x.hashCode());
        System.out.println("String from y is " + y.getInfo() + " Object hashcode: " + y.hashCode());
        System.out.println("String from z is " + z.getInfo() + " Object hashcode: " + z.hashCode());

        z.setInfo(z.getInfo().toLowerCase());

        System.out.println("String from x is " + x.getInfo() + " Object hashcode: " + x.hashCode());
        System.out.println("String from y is " + y.getInfo() + " Object hashcode: " + y.hashCode());
        System.out.println("String from z is " + z.getInfo() + " Object hashcode: " + z.hashCode());
    }
}
