package by.blackfox.tia.model.entity;

public class Teacher extends Person implements Recipient, Worker {

   public final int TEACHER_ONE_HOUR_SALARY = 5;
       private double salaryCoefficient;
       private int groupID;

    public Teacher(){
    }

    public Teacher (String name, double salaryCoefficient, int groupID, double personalAccount){
        super.name = name;
        this.salaryCoefficient = salaryCoefficient;
        this.groupID = groupID;
        super.personalAccount = personalAccount;
    }

    public Teacher (String name, double salaryCoefficient){
        super.name = name;
        this.salaryCoefficient = salaryCoefficient;
    }
    public  double work() {
        double salary=0;
         // "проводит занятия" - узнает kоличество часов у своей группы через groupId, считает и сообщает свою зп
        return salary;
    }

    @Override
    public void getMoney(double money) {
        //  зачисляет на свой счет
            }
}
