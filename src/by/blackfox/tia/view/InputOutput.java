package by.blackfox.tia.view;

import by.blackfox.tia.model.entity.Person;

public class InputOutput {

    public static void Output (String msg){
        System.out.println( msg);
    }

    public static void Output (Person[] persons){
        for (Person person: persons) {
            System.out.println(person.getName());
                    }
    }
}
