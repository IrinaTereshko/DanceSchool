package by.blackfox.tia.model.entity;

public class SupportStaff extends Person implements Recipient {

    private String position;
    private double salary;


    public SupportStaff() {
    }

    public SupportStaff(String name, String position, double salary) {
        super.name = name;
        this.position = position;
        this.salary = salary;
    }

    public SupportStaff(String name, String position) {
        super.name = name;
        this.position = position;
    }

    @Override
    public double getMoney() {
        // добавляет зп на свой счет
        return 0;
    }
}
