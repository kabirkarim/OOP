package Encapsulation.Task06;
public class Student {
    private String name;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        if(marks>=0 && marks<=100) this.marks = marks;
        else System.out.println("Invalid Input. Marks Must Be Between 0 to 100.");
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

}
