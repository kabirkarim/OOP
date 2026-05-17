//Create a Student class with encapsulated fields and find the highest-scoring student from a group of
//five.
//Class Name: Student
//Private Fields:
//        ○ name (String)
//        ○ marks (double)
//Requirements
//        ● Take input for 5 s (name and marks).
//        ● Validate: marks must be between 0 and 100.
//        ● Find and display the student with the highest marks.
//        ● Include an isPass() method that returns true if marks &gt;= 50.
package Encapsulation.Task06;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];

        System.out.println("---Enter Students Details---");
        for(int i = 0; i<s.length; i++) {
            s[i] = new Student();
            System.out.print("Enter name: ");
            s[i].setName(sc.nextLine());
            System.out.print("Enter marks: ");
            s[i].setMarks(sc.nextDouble());
            sc.nextLine();
        }
        Student topStudent = s[0];
        for(Student s1 : s) {
            if(s1.getMarks() > topStudent.getMarks()) {
                topStudent = s1;
            }
        }
        System.out.println("Top student: " + topStudent.getName() + "  with marks " + topStudent.getMarks());
    }
}
