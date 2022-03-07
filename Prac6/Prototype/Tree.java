package Prac6.Prototype;

public abstract class Tree implements Cloneable {
    String type;

    public String getType() {
        return type;
    }

    abstract void grow();

    @Override
    public Tree clone() {
        Tree copy = null;
        try {
            copy = (Tree) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }
}
