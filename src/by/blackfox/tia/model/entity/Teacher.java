package by.blackfox.tia.model.entity;

import java.util.Arrays;

public class Teacher extends DancingStaff {


    private double salaryCoefficient;

    public Teacher() {
    }

    public Teacher(String name, double salaryCoefficient, String groupID) {
        setName(name);
        this.salaryCoefficient = salaryCoefficient;
        setGroupIDs(new String[0]);
        addGroupID(groupID);
    }

    public String getInfo() {
        return getName() + ",\n group IDs: " + Arrays.toString(getGroupIDs())
                + ",\n work hours per week: " + getWorkHoursPerWeek()
                + ", \n salary coefficient: " + salaryCoefficient;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

     public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double work() {
        //  считает и сообщает свою зп за месяц ("проводит занятия")
        return getWorkHoursPerWeek() * WEEKS_IN_MONTH * TEACHER_ONE_HOUR_SALARY * salaryCoefficient;
    }

    @Override
    // зачисляет зп на свой счет
    public void getMoney(double money) {
        setPersonalAccount(getPersonalAccount()+money);
    }
}
