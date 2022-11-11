package by.blackfox.tia.model.entity;

public class SupportStaff extends Person {
    private String position;
    private double salary;

    public SupportStaff() {
    }

    public SupportStaff(String name, String position, double salary) {
        setName(name);
        this.position = position;
        this.salary = salary;
    }

    public SupportStaff(String name, String position) {
        setName(name);
        this.position = position;
    }

    public String getInfo() {
        return getName()
                + ", position: " + position
                + " salary: " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public double work() {
        return salary;
    }

    @Override
    public void getMoney(double money) {
        setPersonalAccount(getPersonalAccount() + money);
    }
}
