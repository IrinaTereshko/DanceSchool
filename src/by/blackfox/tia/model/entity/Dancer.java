package by.blackfox.tia.model.entity;

import java.util.Arrays;

public class Dancer extends DancingStaff implements Payer {
    private int age;
    private boolean sex;
    private int level;

    public Dancer() {
        super();
    }

    public Dancer(String name, int age, int level, boolean sex) {

        super(name);
        if (age >= DIVISION1_MIN_AGE & age <= DIVISION5_MAX_AGE) {
            this.age = age;
        }
        if (level >= MIN_LEVEL & level <= MAX_LEVEL) {
            this.level = level;
        }
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
