package by.blackfox.tia.model.entity;

public class Dancer extends Person implements Payer {
    public static final int MIN_LEVEL = 0;
    public static final int MAX_LEVEL = 3;

    private int age;
    private int level;
    private boolean sex;
    private int groupID;

    public Dancer() {
    }

    public Dancer(String name, int age, int level, boolean sex, int groupID, double personalAccount) {
        super.name = name;
        this.age = age;
        this.level = level;
        this.sex = sex;
        this.groupID = groupID;
        super.personalAccount = personalAccount;
    }

    public Dancer(String name, int age, int level, boolean sex, int groupID) {
        super.name = name;
        this.age = age;
        this.level = level;
        this.sex = sex;
        this.groupID = groupID;
    }
    public Dancer(String name, int age, int level, boolean sex) {
        super.name = name;
        this.age = age;
        this.level = level;
        this.sex = sex;
    }
    public Dancer(String name, int age, boolean sex) {
        super.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getInfo() {
       String sexByLetters= sex?"male":"female";
        return name
                + ", age: " + age
                + ", level: " + level
                + ", sex: " + sexByLetters
                + ", groupID: " + groupID;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public  boolean getSex(){
        return sex;
    }
    public int getLevel(){
        return level;
    }
    public  int getGroupID(){
        return groupID;
    }
    public void setLevel(int level) {
        if (level>=MIN_LEVEL & level<=MAX_LEVEL)
        this.level = level;
    }
    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    @Override
    public double giveMoney() {
        //платит  за свои занятия, в зависимости от kоличества часов занятий в группе
        // делает минус в своем баллансе
        return 0;
    }

    public int dance(int groupID) {
        //узнает сkольKо часов он занимается в своей группе по groupID(???)
        return 0;
    }
}
