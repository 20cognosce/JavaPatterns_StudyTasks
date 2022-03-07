package Prac6.Builder;

public interface WindowBuilder {
    WindowBuilder buildPartGlass();
    WindowBuilder buildPartFrame();
    Window build();
}
