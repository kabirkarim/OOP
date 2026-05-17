//Problem Statement
//Create a Student class to demonstrate data hiding and validation.
//Class Name: Student
//Private Fields:
//        ○ name (String)
//        ○ marks (double)
//Requirements
//        ● Implement getter and setter methods for both fields.
//        ● Validation: Marks must be between 0 and 100.
//        ● Use a Scanner in the main method to allow user input for student name and marks.
//        ● If an invalid value is entered, print an error message and do not update the field.

package Encapsulation.Task01;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Student Name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter Student Marks: ");
        s.setMarks(sc.nextDouble());

        System.out.println("----Student Records----");
        System.out.println("Name: "+ s.getName());
        System.out.println("Marks: "+ s.getMarks());
    }
}
