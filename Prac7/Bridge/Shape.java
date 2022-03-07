package Prac7.Bridge;

public abstract class Shape {
    protected Color color;
    /*
    Using Color interface is the bridge itself - Abstraction
    Because each color of our figures implements Color
    And we store generalizing interface Color instead of concrete classes
    Blue, Red - Realization
    */

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}
