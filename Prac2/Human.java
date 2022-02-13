package Prac2;

import java.time.LocalDate;

public class Human {
    int age;
    String firstName, lastName;
    LocalDate birthDate;
    int weight;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                this.getAge() + " "
                + this.getFirstName() + " "
                + this.getLastName() + " "
                + this.getBirthDate() + " "
                + this.getWeight();
    }
}
