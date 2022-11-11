package by.blackfox.tia.model.entity;

import java.util.Arrays;

public class Dancer extends DancingStaff implements Payer, Worker, PricesAndDivisions {
    private int age;
    private boolean sex;
    private int level;

    public Dancer() {
    }

    public Dancer(String name, int age, int level, boolean sex, String groupID) {
        setName(name);
        this.age = age;
        this.level = level;
        this.sex = sex;
        setGroupIDs(new String[0]);
        addGroupID(groupID);
    }

    public Dancer(String name, int age, boolean sex, int level) {
        setName(name);
        this.age = age;
        this.sex = sex;
        this.level = level;
    }

    public Dancer(String name, int age, boolean sex) {
        setName(name);
        this.age = age;
        this.sex = sex;
    }

    public String getInfo() {
        String sexByLetters = sex ? "male" : "female";
        return getName()
                + ", age: " + age
                + ", level: " + level
                + ", sex: " + sexByLetters
                + ",\n groupsIDs: " + Arrays.toString(getGroupIDs());
    }

    public int getAge() {
        return age;
    }

    public boolean getSex() {
        return sex;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= MIN_LEVEL & level <= MAX_LEVEL)
            this.level = level;
    }


    @Override
    //считает плату за занятия за месяц ("посещает занятия")
    public double work() {
        return getWorkHoursPerWeek() * PRICE_FOR_ONE_HOUR * WEEKS_IN_MONTH;
    }

    @Override
    // "платит за занятия", отнимает деньги со своего счета
    public double giveMoney() {
        setPersonalAccount(getPersonalAccount() - work());
        return work();
    }
}
