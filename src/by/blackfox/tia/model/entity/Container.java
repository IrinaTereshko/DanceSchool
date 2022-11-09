package by.blackfox.tia.model.entity;

import by.blackfox.tia.view.InputOutput;

public class Container {

    public Person[] persons;

    public Container() {
        persons = new Person[0];
    }
    public int getListSize () {
        return persons.length;
    }

    public void add(Person person) {
        Person[] tempArray = new Person[persons.length + 1];
        for (int i = 0; i < persons.length; i++) {
            tempArray[i] = persons[i];
        }
        tempArray[persons.length] = person;

        persons = tempArray;
    }

// +нужно передвинуть пустую ячейKу в kонец и уменьшить массив на 1индеkс
//    public void del(String name) {
//        for (Person person : persons) {
//            if (name == person.getName()) {
//                person = null;
//            }
//        }
//    }
}
