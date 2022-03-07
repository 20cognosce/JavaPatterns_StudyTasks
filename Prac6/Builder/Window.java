package Prac6.Builder;

public class Window { //Product
    String glass;
    String frame;

    public Window(String glass, String frame) {
        this.glass = glass;
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Window{" +
                "glass='" + glass + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }
}
