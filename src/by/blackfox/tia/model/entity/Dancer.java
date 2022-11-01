package by.blackfox.tia.model.entity;

public class Dancer extends Person implements Payer {

    public int age;
    public int level;
    public char sex;
    public int groupID;

    public Dancer() {

    }

    public Dancer(String name, int age, int level, char sex, int groupID) {
        super.name = name;
        this.age = age;
        this.level = level;
        this.sex = sex;
        this.groupID = groupID;
    }

    public Dancer(String name, int age, char sex) {
        super.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Dancer(String name, int age, int level, char sex) {
        super.name = name;
        this.age = age;
        this.level = level;
        this.sex = sex;
    }


    public String getInfo() {
        return name
                + ", age = " + age
                + ", level = " + level
                + ", sex = " + sex
                + ", groupID " + groupID;
    }

    @Override
    public double getMoney() {
        //платит тольkо за свои занятия, в зависимости от kоличества часов занятий
        // делает минус в своем баллансе
        return 0;
    }

    static int dance(int groupID) {
        //узнает сkольKо часов он занимается в своей группе по groupID(???)
        return 0;
    }
}
