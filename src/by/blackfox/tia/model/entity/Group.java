package by.blackfox.tia.model.entity;

public class Group extends Container implements Payer {

    private int idGroup;
    private int quantityOfDancers;
    private int groupHours;

    @Override
    public double getMoney() {
        return 0;
    }


}



