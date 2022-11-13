package by.blackfox.tia.model.entity;

public class DancingStaff extends Person {

    private String[] groupIDs;
    // list of group IDs teach/dance with
    private int workHoursPerWeek;

    public DancingStaff() {
        groupIDs = new String[0];
        workHoursPerWeek = 0;
    }


    public String[] getGroupIDs() {
        return groupIDs;
    }

    public int getWorkHoursPerWeek() {
        return workHoursPerWeek;
    }

    public void setGroupIDs(String[] groupIDs) {
        if (groupIDs != null) {
            this.groupIDs = groupIDs;
        }
    }

    public void setWorkHoursPerWeek(int workHoursPerWeek) {
        this.workHoursPerWeek += workHoursPerWeek;
    }

    public void addGroupID(String groupID) {
        if (groupID != null) {
            String[] tempArray = new String[groupIDs.length + 1];
            for (int i = 0; i < groupIDs.length; i++) {
                tempArray[i] = groupIDs[i];
            }
            tempArray[groupIDs.length] = groupID;

            groupIDs = tempArray;
        }
    }

    public void delGroupID(String groupID) {
        if (groupID != null & groupIDs.length > 0) {

            String[] tempArray = new String[groupIDs.length - 1];

            for (int i = 0; i < groupIDs.length; i++) {
                if (groupIDs[i].equals(groupID)) {
                    groupIDs[i] = null;
                    for (int j = i; j < groupIDs.length - 1; j++) {
                        groupIDs[j] = groupIDs[j + 1];
                    }
                    i = groupIDs.length;
                }
            }

            for (int i = 0; i < tempArray.length; i++) {
                tempArray[i] = groupIDs[i];
            }

            groupIDs = tempArray;
        }
    }
}
