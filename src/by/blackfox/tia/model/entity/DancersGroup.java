package by.blackfox.tia.model.entity;

import by.blackfox.tia.view.InputOutput;

public class DancersGroup extends Container implements Payer {

    private int groupID;
    private int groupHours;


    public DancersGroup (int groupID, int groupHours) {
        this.groupID = groupID;
        this.groupHours = groupHours;
        super.persons = new Dancer [0];
    }

    public void getInfo() {
        InputOutput.Output("Group ID: " + groupID
                + ", group hours: " + groupHours
                + ", quantity of dancers: " + persons.length + ".");
    }


    @Override
    public double giveMoney() {
        //вся группа платит за занятия
        return 0;
    }
}



