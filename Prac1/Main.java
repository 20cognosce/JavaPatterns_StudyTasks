package Prac1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> ungroupedStudents = createArray();
        Map<String, List<Student>> groupedStudents = DistributorIntoGroups.apply(ungroupedStudents);
        System.out.println(groupedStudents.toString());
    }

    public static ArrayList<Student> createArray() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", "IKBO-01-20"));
        students.add(new Student("Petrov", "IKBO-04-20"));
        students.add(new Student("Sidorov", "IKBO-10-20"));
        students.add(new Student("Bashirov", "IKBO-04-20"));
        students.add(new Student("Smirnov", "IKBO-04-20"));
        students.add(new Student("Lebedev", "IKBO-10-20"));
        students.add(new Student("Rakov", "IKBO-24-20"));
        students.add(new Student("Abdulov", "IKBO-01-20"));
        students.add(new Student("Magomedov", "IKBO-24-20"));
        students.add(new Student("Chukov", "IKBO-24-20"));

        return students;
    }

    static Function<ArrayList<Student>, Map<String, List<Student>>> DistributorIntoGroups = (ArrayList<Student> students) -> {
        Map<String, List<Student>> groupedStudents = new HashMap<>();
        students.forEach(student -> {
            ArrayList<Student> studentToAdd;

            if (groupedStudents.get(student.getGroup()) == null) {
                studentToAdd = new ArrayList<>();
            } else {
                studentToAdd = new ArrayList<>(groupedStudents.get(student.getGroup()));
            }

            studentToAdd.add(student);
            groupedStudents.put(student.getGroup(), studentToAdd);
        });
        return groupedStudents;
    };
}
