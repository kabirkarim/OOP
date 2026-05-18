//Problem Statement
//Build a student records system that allows searching for a student by name and updating their marks,
//then displays all records.
//Class Name: Student
//Private Fields:
//        ○ name (String)
//        ○ marks (double) — valid range: 0 to 100
//Requirements
//        ● Take input for 5 students (name and marks).
//        ● Ask the user to enter a student name to update marks.
//        ● If the student is found, prompt for new marks and update the record.
//        ● If not found, display "Student not found."
//        ● Display all student names and marks after the update.

package Encapsulation.Task11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s=new Student[5];

        System.out.println("---Enter Student Details---");
        for(int i=0; i<s.length; i++){
            s[i]=new Student();
            System.out.print("Name: ");
            s[i].setName(sc.nextLine());
            System.out.print("Marks: ");
            s[i].setMarks(sc.nextDouble());
            sc.nextLine();
            System.out.println();
        }

        System.out.println("Enter Student Name To Update His/Her Marks");
        String name= sc.nextLine();
        boolean found=false;
        for(Student k:s){
            if(name.equalsIgnoreCase(k.getName())){
                System.out.println("Enter Updated Marks: ");
                k.setMarks(sc.nextDouble());
                found=true;
                break;
            }
        }
        if(!found) System.out.println("Student Not Found.");

        System.out.println("----Records After Updating----");
        for (Student k:s){
            System.out.println("Name: "+k.getName()+" | Marks: "+ k.getMarks() );
        }
    }
}
