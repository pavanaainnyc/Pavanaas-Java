import java.util.*;

public class EmployeeManager {

    // Employee class to hold details
    static class Employee {
        String id;
        String name;
        String department;
        double salary;

        Employee(String id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return String.format("ID: %s, Name: %s, Dept: %s, Salary: %.2f", id, name, department, salary);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Employee> employees = new HashMap<>();

        System.out.print("Enter number of employees to add: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee details (ID Name Department Salary): ");
            String line = scanner.nextLine();
            String[] parts = line.split("\\s+");
            if (parts.length != 4) {
                System.out.println("Invalid input! Please enter exactly 4 fields.");
                i--;
                continue;
            }

            String id = parts[0];
            String name = parts[1];
            String dept = parts[2];
            double salary;

            try {
                salary = Double.parseDouble(parts[3]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid salary format! Please enter a valid number.");
                i--;
                continue;
            }

            employees.put(id, new Employee(id, name, dept, salary));
        }

        // Process command-line arguments to update employee salaries
        // Format: ID=newSalary (e.g. E101=75000)
        for (String arg : args) {
            String[] updateParts = arg.split("=");
            if (updateParts.length != 2) {
                System.out.println("Invalid argument format: " + arg);
                continue;
            }

            String id = updateParts[0];
            double newSalary;

            try {
                newSalary = Double.parseDouble(updateParts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid salary in argument: " + arg);
                continue;
            }

            Employee emp = employees.get(id);
            if (emp != null) {
                emp.salary = newSalary;
                System.out.println("Updated salary for employee ID: " + id);
            } else {
                System.out.println("Employee ID not found: " + id);
            }
        }

        // Display all employees
        System.out.println("\nFinal Employee List:");
        for (Employee emp : employees.values()) {
            System.out.println(emp);
        }

        scanner.close();
    }
}
