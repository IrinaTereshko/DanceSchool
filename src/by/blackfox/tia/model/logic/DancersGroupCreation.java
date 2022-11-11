package by.blackfox.tia.model.logic;

import by.blackfox.tia.model.entity.Dancer;
import by.blackfox.tia.model.entity.DancersGroup;


public class DancersGroupCreation {


    public DancersGroup createGroupByAge
            (Dancer[] allDancers, int minAge, int maxAge, String groupID, int groupHours) {

        DancersGroup group = new DancersGroup(groupID, groupHours);
        for (Dancer dancer : allDancers) {
            if (dancer.getAge() >= minAge & dancer.getAge() <= maxAge) {
                group.add(dancer);
                dancer.addGroupID(groupID);
            }
        }
        return group;
    }

    public DancersGroup createGroupByAgeAndLevel
            (Dancer[] allDancers, int minAge, int maxAge, int level, String groupID, int groupHours) {

        DancersGroup group = new DancersGroup(groupID, groupHours);
        for (Dancer dancer : allDancers) {
            if (dancer.getAge() >= minAge & dancer.getAge() <= maxAge & level == dancer.getLevel()) {
                group.add(dancer);
                dancer.setGroupID(groupID);
                dancer.setClassesHours(groupHours);
            }
        }
        return group;
    }

    public DancersGroup createGroupByLevel
            (Dancer[] allDancers, int level, String groupID, int groupHours) {

        DancersGroup group = new DancersGroup(groupID, groupHours);
        for (Dancer dancer : allDancers) {
            if (level == dancer.getLevel()) {
                group.add(dancer);
                dancer.setGroupID(groupID);
                dancer.setClassesHours(groupHours);
            }
        }
        return group;
    }


    public DancersGroup createGroupBySex
            (Dancer[] allDancers, String groupID, int groupHours, boolean sex) {

        DancersGroup group = new DancersGroup(groupID, groupHours);
        for (Dancer dancer : allDancers) {
            if (sex == dancer.getSex()) {
                group.add(dancer);
                dancer.setGroupID(groupID);
                dancer.setClassesHours(groupHours);
            }
        }
        return group;
    }
}
