//Problem Statement
//Create a system to handle multiple students using an array of objects.
//Class Name: Student
//Private Fields:
//
//        ○ name (String)
//        ○ marks (double)
//Requirements
//        ● Calculate the number of students passed (marks>55).
//        ● In the main method, create an array to hold 3 Student objects.
//        ● Use a loop and Scanner to gather data for each student.
//        ● After input, display the names of students who passed and the total pass count.
package Encapsulation.Task03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];

        int passCount=0;
        double maxMarks=-1;
        Student topStudent=null;
        System.out.println("---Student Details---");

        for(int i=0; i<s.length; i++){
            s[i] = new Student();
            System.out.println("Enter Details of Student "+(i+1));
            System.out.print("Enter Name: ");
            s[i].setName(sc.nextLine());
            System.out.print("Enter Marks: ");
            s[i].setMarks(sc.nextDouble());
            sc.nextLine();

            //Logic For Counting Pass Students
            if(s[i].pass()) passCount++;

            //logic For finding top Student
            if(s[i].getMarks()>maxMarks){
                maxMarks=s[i].getMarks();
                topStudent=s[i];
            }

        }

        System.out.println("--- Pass Students ---");
        for(int i=0; i<s.length;i++){
            if(s[i].pass()){
                System.out.println("Name:" + s[i].getName() );
                System.out.println("Marks: "+ s[i].getMarks());
            }
            System.out.println();
        }

        System.out.println("Total Students Pass is :"+ passCount);
        if(topStudent!=null){
            System.out.println("--- Top Student ---");
            System.out.println("Name: "+ topStudent.getName());
            System.out.println("Marks: "+topStudent.getMarks());
        }


    }
}
