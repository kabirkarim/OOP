
//Problem Statement
//        Create an employee system that calculates bonuses based on years of experience and identifies the
//        employee who earns the highest bonus.
//        Class Name: Employee
//        Private Fields:
//        ○ name (String)
//        ○ salary (double) — must be >= 0
//        ○ experience (int) — must be >= 0
//        Requirements
//        ● Input details for 5 employees (name, salary, experience).
//        ● calculateBonus(): experience >= 5 years = 20% of salary; otherwise = 10% of salary.
//        ● Find and display the employee with the maximum bonus.
//        ● Show their name and calculated bonus amount.
//        Solution

package Encapsulation.Task15;
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
        Employee maxBonusEmp = employees[0];
        for(Employee e : employees) {
            if(e.calculateBonus() > maxBonusEmp.calculateBonus()) maxBonusEmp = e;
        }
        System.out.println("Employee with maximum bonus: " + maxBonusEmp.getName()
                + " | Bonus: " + maxBonusEmp.calculateBonus());
    }
}