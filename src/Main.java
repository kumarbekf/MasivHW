import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "John", 30, 50000));
        employees.add(new Employee(2, "Mary", 25, 40000));
        employees.add(new Employee(3, "David", 35, 70000));
        employees.add(new Employee(4, "Samagan", 25, 10000));
        employees.add(new Employee(5, "Baikal", 10, 20000));
        employees.add(new Employee(6, "Bilal", 11, 40000));
        employees.add(new Employee(7, "Dilnaz", 15, 60000));
        employees.add(new Employee(8, "Yrys", 15, 80000));
        employees.add(new Employee(9, "Aida", 45, 10000));
        employees.add(new Employee(10, "Umar", 12, 30000));


        Administrator administrator = new Administrator("admin", "password");
        administrator.getAllEmployees(employees);
        administrator.deleteAll(employees);
    }  }