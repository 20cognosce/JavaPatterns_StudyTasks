package Prac6.Builder;

public class ClassicWindowBuilder implements WindowBuilder {
    String glass;
    String frame;

    @Override
    public WindowBuilder buildPartGlass() {
        this.glass = "Classic fragile glass";
        return this;
    }

    @Override
    public WindowBuilder buildPartFrame() {
        this.frame = "Classic wooden frame";
        return this;
    }

    @Override
    public Window build() {
        return new Window (this.glass, this.frame);
    }
}
