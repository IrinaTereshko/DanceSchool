package by.blackfox.tia.model.logic;

import by.blackfox.tia.model.entity.Dancer;
import by.blackfox.tia.model.entity.DancersGroup;


public class DancersGroupCreation {
//    public static final int DIVISION1_MIN_AGE = 3;
//    public static final int DIVISION1_MAX_AGE = 5;
//    public static final int DIVISION2_MIN_AGE = 6;
//    public static final int DIVISION2_MAX_AGE = 9;
//    public static final int DIVISION3_MIN_AGE = 10;
//    public static final int DIVISION3_MAX_AGE = 12;
//    public static final int DIVISION4_MIN_AGE = 13;
//    public static final int DIVISION4_MAX_AGE = 16;
//    public static final int DIVISION5_MIN_AGE = 17;
//
//    public static final int GROUP_HOURS_FOR_WEEK_DIVISION1 = 2;
//    public static final int GROUP_HOURS_FOR_WEEK_DIVISION2 = 4;
//    public static final int GROUP_HOURS_FOR_WEEK_DIVISION3 = 6;
//    public static final int GROUP_HOURS_FOR_WEEK_DIVISION4 = 6;
//    public static final int GROUP_HOURS_FOR_WEEK_DIVISION5 = 8;


    public DancersGroup createGroupByAge
            (Dancer[] allDancers, int minAge, int maxAge, int level, int groupID, int groupHours) {

                DancersGroup group = new DancersGroup(groupID, groupHours);
        for (Dancer dancer : allDancers) {
            if (dancer.getAge() >= minAge & dancer.getAge() <= maxAge) {
                group.add(dancer);
                dancer.setGroupID(groupID);
            }
        }
        return group;
    }

    public DancersGroup createGroupByAgeAndLevel
            (Dancer[] allDancers, int minAge, int maxAge, int level, int groupID, int groupHours ) {

        DancersGroup group = new DancersGroup(groupID, groupHours);
        for (Dancer dancer : allDancers) {
            if (dancer.getAge() >= minAge & dancer.getAge() <= maxAge & level == dancer.getLevel()) {
                group.add(dancer);
                dancer.setGroupID(groupID);
            }
        }
        return group;
    }

    public DancersGroup createGroupByLevel
            (Dancer[] allDancers, int level, int groupID, int groupHours ) {

        DancersGroup group = new DancersGroup(groupID, groupHours);
        for (Dancer dancer : allDancers) {
            if (level == dancer.getLevel()) {
                group.add(dancer);
                dancer.setGroupID(groupID);
            }
        }
        return group;
    }


    public DancersGroup createGroupBySex
            (Dancer[] allDancers, int groupID, int groupHours, boolean sex ) {

        DancersGroup group = new DancersGroup(groupID, groupHours);
        for (Dancer dancer : allDancers) {
            if (sex == dancer.getSex()) {
                group.add(dancer);
            }
        }
        return group;
    }
}
