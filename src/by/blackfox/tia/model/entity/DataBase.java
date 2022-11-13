package by.blackfox.tia.model.entity;

public class DataBase {

    private static final Container AllStaff = new Container(new Person[0]);

//   private static AllGroups[]
//    здесь хранить все созданные группы, описать геттеры и добавления и изменения

    public static Person[] getAllStaff() {
        return AllStaff.getPersons();
    }

    public static Person[] getAllDancers() {
        Container allDancers = new Container(new Dancer[0]);
        for (Person person : AllStaff.getPersons()) {
            if (person instanceof Dancer) {
                allDancers.add(person);
            }
        }
        return allDancers.getPersons();
    }

    public static Person[] getAllTeachers() {
        Container allTeachers = new Container(new Teacher[0]);
        for (Person person : AllStaff.getPersons()) {
            if (person instanceof Teacher) {
                allTeachers.add(person);
            }
        }
        return allTeachers.getPersons();
    }

    public static Person[] getAllSupportStaff() {
        Container allSupportStaff = new Container(new SupportStaff[0]);
        for (Person person : AllStaff.getPersons()) {
            if (person instanceof SupportStaff) {
                allSupportStaff.add(person);
            }
        }
        return allSupportStaff.getPersons();
    }

    public static Person[] getAllRecipients() {
        Container allRecipients = new Container();
        for (Person person : AllStaff.getPersons()) {
            if (person instanceof SupportStaff || person instanceof Teacher) {
                allRecipients.add(person);
            }
        }
        return allRecipients.getPersons();
    }

    public void registerPerson(Person person) {
        AllStaff.add(person);
    }

    public static void delPerson(Person person) {
                AllStaff.del(person);
    }


}


