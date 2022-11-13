package by.blackfox.tia.model.entity;

import by.blackfox.tia.view.InputOutput;

public class Container {
    private Person[] persons;

    public Container() {
        persons = new Person[0];
    }

    public Container(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public void add(Person person) {
        Person[] tempArray = new Person[persons.length + 1];
        for (int i = 0; i < persons.length; i++) {
            tempArray[i] = persons[i];
        }
        tempArray[persons.length] = person;

        persons = tempArray;
    }

    public void del(Person person) {
        int id = person.getPersonalID();
        Person[] tempArray = new Person[persons.length - 1];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getPersonalID() == id) {
                persons[i] = null;
                for (int j = i; j < persons.length - 1; j++) {
                    persons[j] = persons[j + 1];
                }
                i = persons.length;
            }
        }
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = persons[i];
        }
        persons = tempArray;
    }

}
