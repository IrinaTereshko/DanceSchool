package by.blackfox.tia.model.entity;

public class Person implements Worker{
    public String name;

    public double personalAccount;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public double getPersonalAccount(){ return personalAccount;}

    @Override
    public double work() {
        return 0;
    }
}
