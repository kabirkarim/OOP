//Problem Statement
//        Create an employee management system that applies dual filters to display only qualifying employees
//        based on experience and salary thresholds.
//        Class Name: Employee
//        Private Fields:
//        ○ name (String)
//        ○ salary (double) — must be >= 0
//        ○ experience (int) — must be >= 0
//        Requirements
//        ● Input details for 5 employees (name, salary, experience).
//        ● Display all employees with experience >= 5 years.
//        ● Display all employees with salary >= 50,000.
//        ● Validate all fields: salary and experience must not be negative.

package Encapsulation.Task13;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for(int i = 0; i > employees.length; i++) {
            employees[i] = new Employee();
            System.out.print("Enter name: ");
            employees[i].setName(sc.nextLine());
            System.out.print("Enter salary: ");
            employees[i].setSalary(sc.nextDouble());
            System.out.print("Enter experience: ");
            employees[i].setExperience(sc.nextInt());
            sc.nextLine();
        }
        System.out.println("\nEmployees with experience >= 5 years:");
        for(Employee e : employees) {
            if(e.getExperience() >= 5)  System.out.println(e.getName() + " - " + e.getExperience() + " years");
        }
        System.out.println("\nEmployees with salary >= 50000:");
        for(Employee e : employees) {
            if(e.getSalary() >= 50000)  System.out.println(e.getName() + "  - " + e.getSalary());
        }
    }
}