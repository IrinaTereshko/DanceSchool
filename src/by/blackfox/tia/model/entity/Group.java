package by.blackfox.tia.model.entity;

public class Group extends Container implements Payer {

    private int idGroup;
    private int quantityOfDancers;
    private int groupHours;

    public Group (){
    }

    public Group (int idGroup,  int groupHours, int quantityOfDancers){
        this.idGroup = idGroup;
        this.groupHours = groupHours;
        this.quantityOfDancers = quantityOfDancers;
        super.persons = new Dancer [quantityOfDancers];
    }


    @Override
    public double giveMoney() {
        //вся группа платит за занятия
        return 0;
    }
}



