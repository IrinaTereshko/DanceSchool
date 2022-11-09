package by.blackfox.tia.model.entity;

public class Staff extends Container {
      private int quantity;
    public Staff (){
    }

    public Staff (int quantity){
        this.quantity = quantity;
        super.persons = new Person [quantity];
    }




}
