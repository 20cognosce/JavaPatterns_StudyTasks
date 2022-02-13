package Prac1;

public class Student {
    String name;
    String group;

    Student (String name, String group) {
        this.name = name;
        this.group = group;
    }

    String getName () {
        return this.name;
    }

    String getGroup() {
        return this.group;
    }

    @Override
    public String toString() {
        return this.getName();
    }
 }
