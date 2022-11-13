package by.blackfox.tia.model.entity;

import java.util.concurrent.atomic.AtomicInteger;

public class Person implements Worker, Recipient, PricesAndDivisions {
    private static final AtomicInteger counterPersonalID = new AtomicInteger(0);
    private String name;
    private final int  personalID;
    private double personalAccount;

    public Person() {
        name= " ";
        personalID = counterPersonalID.incrementAndGet();
        personalAccount = 0;
    }

    public Person(String name) {
        this.name = name;
        personalID = counterPersonalID.incrementAndGet();
        personalAccount = 0;
    }

    public String getName() {
        return name;
    }
    public int getPersonalID(){return personalID;}
    public double getPersonalAccount() { return personalAccount;}

    public void setName(String name) {
        if (name != null)
                this.name = name;
    }

    public void setPersonalAccount (double money){
        personalAccount=money;
    }
// деньги могут быть и с + и с -, потом через знаk они увеличивают или уменьшают personalAccount

    @Override
    public double work() {
        return 0;
    }

    @Override
    public void getMoney(double money) {
        setPersonalAccount(getPersonalAccount()+money);
    }
}
