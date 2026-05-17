//Problem Statement
//        Create an Employee system that calculates bonuses based on experience and applies multiple filters to
//        generate a summary report.
//        Class Name: Employee
//        Private Fields:
//        ○ name (String)
//        ○ salary (double)
//        ○ experience (int)
//        Requirements
//        ● Input details for 5 employees (name, salary, experience).
//        ● calculateBonus(): experience >= 5 years = 20% of salary; otherwise = 10% of salary.
//        ● Display all employees whose bonus is >= 5000.
//        ● Display all employees with experience >= 3 years.


package Encapsulation.Task10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[5];

        System.out.println("--- Enter Employee Details---");
        for(int i=0;i< e.length;i++){
            e[i]= new Employee();
            System.out.println("Employee "+ (i+1));
            System.out.print("Name: ");
            e[i].setName(sc.nextLine());
            System.out.print("Salary: ");
            e[i].setSalary(sc.nextDouble());
            System.out.println("Year Of Experience: ");
            e[i].setYearsOfExperience(sc.nextInt());
            sc.nextLine();
            System.out.println();
        }
        System.out.println();
        System.out.println("Employee With Bonus Greater than 5000");
        for(Employee k:e){
            if(k.calculateBonus()>=5000){
                System.out.println("Name: "+ k.getName()+
                        "\nSalary: "+ k.getSalary()+
                "\n Year of Experience: "+k.getYearsOfExperience());
                System.out.println();
            }

        }
        System.out.println("Employee With Year of Experience Greater than 3");
        for(Employee k:e){
            if(k.getYearsOfExperience()>=3){
                System.out.println("Name: "+ k.getName()+
                        "\nSalary: "+ k.getSalary()+
                        "\n Year of Experience: "+k.getYearsOfExperience());
                System.out.println();
            }
        }
    }
}
