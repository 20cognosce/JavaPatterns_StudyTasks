package Prac6.Prototype;

public class OakTree extends Tree {
    @Override
    void grow() {
        System.out.println("The oak grew!");
    }

    public OakTree() {
        type = "Oak";
    }
}
