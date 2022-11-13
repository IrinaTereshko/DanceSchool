package by.blackfox.tia.model.entity;

import by.blackfox.tia.view.InputOutput;

public class DancersGroup extends Container {

    private String groupID;
    private int groupHours;

    //сделать создание группы с ограниченнным kоличеством участниkов: add, del,constructor,
    // add variable:
    // private int quantityOfDancers;

    public DancersGroup() {
        groupID = null;
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

// если менять часы, нужно, чтобы они изменились у всех танцоров группы!!!

//    public void setGroupHours(int groupHours) {
//        this.groupHours = groupHours;
//
//    }

    public void add(DancingStaff dancingStaff) {
        // добавляет танцора или педагога в группу, записывает ему id группы и добавляет часы занятий
       int length = getPersons().length;
        Person[] tempArray = new Person[length + 1];
        for (int i = 0; i < length; i++) {
            tempArray[i] = getPersons()[i];
        }
        tempArray[length] = dancingStaff;

        setPersons(tempArray);

        dancingStaff.addGroupID(groupID);
        dancingStaff.setWorkHoursPerWeek(groupHours);


    }

    public void del(DancingStaff dancingStaff) {
// удаляет танцора или педагога из группы, удаляет из его списKа id группы и уменьшает часы занятий
        int length = getPersons().length;
        Person[] tempPersons = getPersons();
        Person[] tempArray = new Person[length - 1];
        int id = dancingStaff.getPersonalID();
        for (int i = 0; i < length; i++) {
            if (tempPersons[i].getPersonalID() == id ) {
                tempPersons[i] = null;
                for (int j = i; j < length - 1; j++) {
                    tempPersons[j] = tempPersons[j + 1];
                }
                i = length;
            }
        }
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i]=tempPersons[i];
        }
        setPersons(tempArray);

        dancingStaff.delGroupID(groupID);
        dancingStaff.setWorkHoursPerWeek(-groupHours);
    }

}



