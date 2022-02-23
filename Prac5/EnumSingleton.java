package Prac5;

//
public enum EnumSingleton {
    INSTANCE("Enum Singleton");

    private String info;

    private EnumSingleton(String info) {
        this.info = info;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
