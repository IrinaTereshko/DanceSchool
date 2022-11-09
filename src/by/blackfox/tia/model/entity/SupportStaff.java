package by.blackfox.tia.model.entity;

public class SupportStaff extends Person implements Recipient, Worker {
    private String position;
    private double salary;


    public SupportStaff() {
    }

    public SupportStaff(String name, String position, double salary, double personalAccount) {
        super.name = name;
        this.position = position;
        this.salary = salary;
        super.personalAccount = personalAccount;
    }

    public SupportStaff(String name, String position, double salary ) {
        super.name = name;
        this.position = position;
        this.salary = salary;
    }

    public SupportStaff(String name, String position) {
        super.name = name;
        this.position = position;
            }
    public String getInfo() {
        return name
                + ", position: " + position
                + " salary: " + salary;
    }

    public String getNameAndPosition() {
        return name + ", position: " + position;
    }
    public double getSalary() {
        return salary;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double work() {
        //  сообщает  свою зп
        return salary;
    }

    @Override
    public void getMoney(double money) {
        // добавляет деньги на свой счет
    }
}
