package by.blackfox.tia.model.entity;

public class Teacher extends Person implements Recipient {

       private double salaryCoefficient;
       private int groupID;

    public Teacher(){
    }

    public Teacher (String name, double salaryCoefficient, int groupID){
        super.name = name;
        this.salaryCoefficient = salaryCoefficient;
        this.groupID = groupID;
    }

    public Teacher (String name, double salaryCoefficient){
        super.name = name;
        this.salaryCoefficient = salaryCoefficient;
    }




    public  double work() {
         // "проводит занятия" - узнает kоличество часов у своих групп через groupId
        //сообщает о своей зарплате
        return 0.0;
    }

    @Override
    public double getMoney() {
        // получает свою зарплату в зависимости от часов
        return 0;
    }
}
