package Prac6.Builder;

public class WindowBuilderDirector {
    WindowBuilder builder;

    public WindowBuilderDirector(WindowBuilder builder) {
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("WindowBuilderDirector can't work without concrete WindowBuilder");
        }
    }

    public Window constructWindow() {
        return builder.buildPartGlass().buildPartFrame().build();
    }
}
