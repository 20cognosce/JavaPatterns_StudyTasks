package Prac7.Composite;

public class FinancialDepartment implements Department {
    private final Integer id;
    private final String name;

    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
