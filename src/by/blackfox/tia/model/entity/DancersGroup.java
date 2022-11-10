package by.blackfox.tia.model.entity;

import by.blackfox.tia.view.InputOutput;

public class DancersGroup extends Container implements Payer {

    private String groupID;
    private int groupHours;


    public DancersGroup(String groupID, int groupHours) {
        this.groupID = groupID;
        this.groupHours = groupHours;
        super.persons = new Dancer[0];
    }


    public void getInfo() {
        InputOutput.Output("Group ID: " + groupID
                + ", group hours: " + groupHours
                + ", quantity of dancers: " + persons.length + ".");
    }

    public String getGroupID() {
        return groupID;
    }

    public int getGroupHours() {
        return groupHours;
    }

    public Person[] getDancersArray() {
        return persons;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public void setGroupHours(int groupHours) {
        this.groupHours = groupHours;
    }

    @Override
    public double giveMoney() {
        //вся группа платит за занятия
        return 0;
    }
}



