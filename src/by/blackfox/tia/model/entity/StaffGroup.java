package by.blackfox.tia.model.entity;

public class StaffGroup extends Container implements Worker, Recipient {

    @Override
    public double work() {
        int allStaffGroupSalary = 0;
        for (Person person : persons) {
            allStaffGroupSalary += person.work();
        }
        return allStaffGroupSalary;
    }

    @Override
    public void getMoney(double money) {
        for (Person person : persons) {
            person.changePersonalAccount(person.work());
        }
    }
}
