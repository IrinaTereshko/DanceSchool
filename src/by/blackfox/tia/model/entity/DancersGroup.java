package by.blackfox.tia.model.entity;

import by.blackfox.tia.view.InputOutput;

public class DancersGroup extends Container {

    private final String groupID;
    private int groupHours;

    //сделать создание группы с ограниченнным kоличеством участниkов: add, del,constructor,
    // add variable:
    // private int quantityOfDancers;

    public DancersGroup() {
        groupID = " ";
        groupHours = 0;
        setPersons(new DancingStaff[0]);
    }

    public DancersGroup(String groupID, int groupHours) {
        this.groupID = groupID;
        this.groupHours = groupHours;
        setPersons(new DancingStaff[0]);
    }


    public void getInfo() {
        InputOutput.Output("Group ID: " + groupID
                + ", group hours: " + groupHours
                + ", current quantity of dancers: " + getPersons().length + ".");
    }

    public String getGroupID() {
        return groupID;
    }

    public int getGroupHours() {
        return groupHours;
    }

    public Person[] getDancersArray() {
        return getPersons();
    }

    public void changeGroupHours(int groupHours) {
        // меняет часы работы в самой группе и  всем участниkам группы
        for (Person person : getPersons()) {
            ((DancingStaff) person).setWorkHoursPerWeek(groupHours - this.groupHours);
        }
        this.groupHours = groupHours;
    }

    public void add(DancingStaff dancingStaff) {
        // добавляет танцора или педагога в группу, записывает ему id группы и добавляет часы занятий
        DancersGroup.super.add(dancingStaff);
        dancingStaff.addGroupID(groupID);
        dancingStaff.setWorkHoursPerWeek(groupHours);


    }

    public void del(DancingStaff dancingStaff) {
// удаляет танцора или педагога из группы, удаляет из его списKа id группы и уменьшает часы занятий
        DancersGroup.super.del(dancingStaff);
        dancingStaff.delGroupID(groupID);
        dancingStaff.setWorkHoursPerWeek(-groupHours);
    }
}




