package by.blackfox.tia.model.entity;

public class StaffGroup extends Container implements Worker {

    @Override
    public double work() {
        int allStaffGroupSalary = 0;
        for (Person person : persons) {
            allStaffGroupSalary += person.work();
        }
        return allStaffGroupSalary;
    }
}
