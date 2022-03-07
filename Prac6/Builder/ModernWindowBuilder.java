package Prac6.Builder;

public class ModernWindowBuilder implements WindowBuilder {
    String glass;
    String frame;

    @Override
    public WindowBuilder buildPartGlass() {
        this.glass = "Modern hard glass";
        return this;
    }

    @Override
    public WindowBuilder buildPartFrame() {
        this.frame = "Modern plastic frame";
        return this;
    }

    @Override
    public Window build() {
        return new Window (this.glass, this.frame);
    }
}
