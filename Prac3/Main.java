package Prac3;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        MapTest mapTest = new MapTest();
        ListTest listTest = new ListTest();


        mapTest.run();
        //Thread.sleep(1000); //makes next first not thread-safe implementation get result of 10000 somehow
        listTest.run();


    }
}
