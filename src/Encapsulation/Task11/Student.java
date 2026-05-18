package Encapsulation.Task11;

public class Student {
    private String name;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        if(marks>=0 && marks<=100)    this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}
