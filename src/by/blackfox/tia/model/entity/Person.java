package by.blackfox.tia.model.entity;

import java.util.concurrent.atomic.AtomicInteger;

public class Person {
    private static  AtomicInteger counterPersonalID = new AtomicInteger(0);
    private String name;
    private int  personalID;
    private double personalAccount;

    public Person() {
        name= null;
        personalID = counterPersonalID.incrementAndGet();
        personalAccount = 0;
    }


        public String getName() {
        return name;
    }
    public int getPersonalID(){return personalID;}
    public double getPersonalAccount() { return personalAccount;}

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonalAccount (double money){
        personalAccount=money;
    }


}
