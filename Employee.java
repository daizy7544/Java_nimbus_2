package java_nimbus;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String id;
    private String designation;
    private double salary;

    public Employee(String name, String id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", ID='" + id + '\'' +
                ", Designation='" + designation + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
