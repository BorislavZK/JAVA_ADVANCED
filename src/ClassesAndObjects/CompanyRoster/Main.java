package ClassesAndObjects.CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Employee> employees = new ArrayList<>();

        //Peter 120.00 Dev Development peter@abv.bg 28

        for (int i = 0; i < n; i++) {

            String[] line = scan.nextLine().split("\\s+");
            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String department = line[3];

            Employee employee = new Employee(name, salary, position, department);

            if (line.length == 6) {

                String email = line[4];
                int age = Integer.parseInt(line[5]);

                employee.setAge(age);
                employee.setEmail(email);

            } else if (line.length == 5) {

                if (Character.isDigit(line[4].charAt(0))) {
                    int age = Integer.parseInt(line[4]);

                    employee.setAge(age);
                    employee.setEmail("n/a");
                } else {
                    String mail = line[4];

                    employee.setAge(-1);
                    employee.setEmail(mail);
                }
            }

            employees.add(employee);

        }
    }
}
