package by.blackfox.tia.model.entity;

public class StaffGroup extends Container implements Worker {
    String staffID;

    public StaffGroup(String staffID){
              this.staffID = staffID;
    }

    @Override
    public double work() {
        // возвращает зп всехсотрудниKов из списKа
        return 0;
    }
}
