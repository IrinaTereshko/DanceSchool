package by.blackfox.tia.model.logic;

import by.blackfox.tia.model.entity.DataBase;
import by.blackfox.tia.model.entity.Person;
import by.blackfox.tia.model.entity.PricesAndDivisions;

public class Budget implements PricesAndDivisions {

    public static double calculateProfit() {
        double profit = 0;
        for (Person person : DataBase.getAllDancers()) {
            profit += person.work();
        }
        return profit;

    }

    public static double calculateStaffSalary() {
        double salary = 0;
        for (Person person : DataBase.getAllRecipients()) {
            salary += person.work();
        }
        return salary;
    }


    public static double calculateBudget() {

        return calculateProfit() - calculateStaffSalary();
    }
}
