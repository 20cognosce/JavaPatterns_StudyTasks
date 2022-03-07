package Prac6.Prototype;

public class PineTree extends Tree {
    @Override
    void grow() {
        System.out.println("The pine grew!");
    }

    public PineTree() {
        type = "Pine";
    }
}
