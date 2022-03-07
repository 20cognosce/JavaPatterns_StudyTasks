package Prac7;

import Prac7.Bridge.*;
import Prac7.Composite.*;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(new Red());
        Shape triangle = new Triangle(new Blue());
        System.out.println(square.draw());
        System.out.println(triangle.draw());

        HeadDepartment headDepartment = new HeadDepartment(1, "Head department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");
        Department salesDepartment = new SalesDepartment(3, "Sales department");

        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(salesDepartment);
        headDepartment.printDepartmentName();
    }
}
