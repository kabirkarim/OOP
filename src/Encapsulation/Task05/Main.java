//Problem Statement
//Create an employee record system to calculate bonuses based on experience.
//Class Name: Employee
//Private Fields:
//        ○ name (String)
//        ○ salary (double)
//        ○ yearsOfExperience (int)
//Requirements
//        ● Add a method calculateBonus():
//        ● If experience >= 5 years, bonus is 20% of salary.
//        ● Otherwise, bonus is 10% of salary.
//        ● Use Scanner to input details for 3 employees into an array.
//        ● Display a summary showing each employee's name and their calculated bonus.

package Encapsulation.Task05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee[] e=new Employee[3];

        System.out.println("--- Enter Employee Details");
        for(int i=0;i< e.length;i++){
            e[i]=new Employee();
            System.out.println("Employee "+ (i+1));
            System.out.print("Name: ");
            e[i].setName(sc.nextLine());
            System.out.print("Salary: ");
            e[i].setSalary(sc.nextDouble());
            System.out.println("Year Of Experience: ");
            e[i].setYearsOfExperience(sc.nextInt());
            sc.nextLine();
        }
        System.out.println();
        System.out.println("Bonus Details");
        for (Employee employee : e) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Bonus: " + employee.calculateBonus());
            System.out.println();
        }
    }
}
