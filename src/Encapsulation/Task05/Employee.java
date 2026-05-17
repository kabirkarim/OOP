package Encapsulation.Task05;

public class Employee {
    private String name;
    private double salary;
    private int yearsOfExperience;

    public double calculateBonus(){
        if(yearsOfExperience>=5)    return 0.2*salary;
        else    return 0.1*salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary>=0)this.salary = salary;
        else System.out.println("Invalid Input, Salary Must Be In Positive Numbers.");
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if(yearsOfExperience>=0)    this.yearsOfExperience = yearsOfExperience;
        else System.out.println("Invalid Input, Years Must Be In Positive Numbers.");
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
