package by.blackfox.tia.model.entity;

import by.blackfox.tia.view.InputOutput;

public class Container {
    public Person[] persons;

    public Container() {
        persons = new Person[0];
    }

    public Container(Person[] persons){
        this.persons=persons;
    }

    public void setPersons(Person[] persons){
        this.persons=persons;
    }
    public void add(Person person) {
        Person[] tempArray = new Person[persons.length + 1];
        for (int i = 0; i < persons.length; i++) {
            tempArray[i] = persons[i];
        }
        tempArray[persons.length] = person;

        persons = tempArray;
    }

    public void del(int personalID) {
        Person[] tempArray = new Person[persons.length - 1];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getPersonalID() == personalID) {
                persons[i] = null;
                for (int j = i; j < persons.length - 1; j++) {
                    persons[j] = persons[j + 1];
                }
                i = persons.length;
            }
        }
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i]=persons[i];
        }
        persons=tempArray;
    }

}
