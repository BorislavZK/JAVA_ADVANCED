package ExamPreparation.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {
    private List<Employee> employees;
    private String name;
    private int capacity;

    public Cafe(String name, int capacity) {
        this.employees = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void addEmployee(Employee employee) {
        if (this.employees.size() < this.capacity) {
            this.employees.add(employee);
        }
    }

    public boolean removeEmployee(String name) {
        boolean isExist = false;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                isExist = true;
                employees.remove(employee);
                break;
            }
        }

        return isExist;
    }

    public Employee getOldestEmployee() {
        List<Employee> sortedEmployees = employees
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getAge(), e1.getAge()))
                .collect(Collectors.toList());
        return sortedEmployees.get(0);
    }

    public Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount() {
        return this.employees.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Employees working at Cafe %s:", this.name))
                .append(System.lineSeparator());
        for (Employee employee : employees) {
            sb.append("Employee: ").append(employee).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
