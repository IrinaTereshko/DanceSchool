package by.blackfox.tia.model.entity;

public class Dancer extends Person implements Payer, Worker {
    public static final int MIN_LEVEL = 0;
    public static final int MAX_LEVEL = 3;
    public static final double PRICE_FOR_ONE_HOUR = 5;


    private int age;
    private int level;
    private boolean sex;
    private String groupID;

    private int classesHours;

    public Dancer() {
    }

    public Dancer
            (String name, int age, int level, boolean sex, String groupID, int classesHours, double personalAccount) {
        super.name = name;
        this.age = age;
        this.level = level;
        this.sex = sex;
        this.groupID = groupID;
        this.classesHours = classesHours;
        super.personalAccount = personalAccount;
    }

    public Dancer(String name, int age, int level, boolean sex, String groupID) {
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
        String sexByLetters = sex ? "male" : "female";
        return name
                + ", age: " + age
                + ", level: " + level
                + ", sex: " + sexByLetters
                + ", groupID: " + groupID;
    }

    public String getName() {
        return name;
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

    public String getGroupID() {
        return groupID;
    }

    public void setLevel(int level) {
        if (level >= MIN_LEVEL & level <= MAX_LEVEL)
            this.level = level;
    }

    public void setGroupID(String groupID) {
        this.groupID += groupID;
    }

    public void setClassesHours(int classesHours) {
        this.classesHours += classesHours;
    }


    @Override
    public double giveMoney() {
        //платит  за свои занятия, в зависимости от kоличества часов занятий в группе
        // делает минус в своем баллансе
        return 0;
    }
        @Override
    public double work() {
        return classesHours * PRICE_FOR_ONE_HOUR;
    }
}
