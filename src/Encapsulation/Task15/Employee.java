package Encapsulation.Task15;
class Employee {
    private String name;
    private double salary;
    private int experience;
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { if(salary >= 0) this.salary = salary; }

    public void setExperience(int experience) {
        if(experience >= 0) this.experience = experience;
    }
    public double calculateBonus() {
        return experience >= 5 ? salary * 0.2 : salary * 0.1;
    }
    public String getName() { return name; }
}
