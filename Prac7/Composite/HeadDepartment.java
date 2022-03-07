package Prac7.Composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private final Integer id;
    private final String name;

    private final List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
