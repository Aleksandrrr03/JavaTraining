package by.epam.javatraining.kotkovets.lesson5.task01.controller;

import by.epam.javatraining.kotkovets.lesson5.task01.view.View;

import static by.epam.javatraining.kotkovets.lesson5.task01.model.logic.DragonLogic.*;

public class Starter {

    public static void main(String[] args) {

        int age = 12;

        int numberOfHeads = countHeads(age);
        int numberOfEyes = countEyes(age);

        View.print("\n" + "Dragon age is " + age + "\n"
                + "His number of heads is " + numberOfHeads + "\n"
                + "His number of eyes is " + numberOfEyes + "\n");
    }
}
