package by.blackfox.tia.model.entity;

public class SupportStaff extends Person {
    private String position;
    private double salary;

    public SupportStaff() {
        super();
    }

    public SupportStaff(String name, String position, double salary) {
        super(name);
        this.position = position;
        this.salary = salary;
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
        if (position != null)
        {this.position = position;}
    }

    public void setSalary(double salary) {
       if (salary >0){
        this.salary = salary;}
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
