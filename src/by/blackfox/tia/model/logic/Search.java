package by.blackfox.tia.model.logic;

import by.blackfox.tia.model.entity.Container;
import by.blackfox.tia.model.entity.Dancer;
import by.blackfox.tia.model.entity.DataBase;
import by.blackfox.tia.model.entity.Person;

public class Search {

    public Person searchByPersonID(int id) {
        for (Person person : DataBase.getAllStaff()) {
            if (person.getPersonalID() == id) {
                return person;
            }
        }
        return null;
    }

    public Person[]  searchDancersByAge (int age) {
        Container resultSearch = new Container();
        for (Person person: DataBase.getAllDancers()) {
            if (((Dancer)person).getAge()==age){
                resultSearch.add(person);
            }
        }
        return resultSearch.getPersons();
    }

}
