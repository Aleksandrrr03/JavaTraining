package by.epam.javatraining.kotkovets.lesson06.task05.controller;

import by.epam.javatraining.kotkovets.lesson06.task05.model.logic.NumberLogic;
import by.epam.javatraining.kotkovets.lesson06.task05.view.View;

public class Task05 {
    public static void main(String[] args) {
        int number   = 11;
        View.print("It's simple number:"+ NumberLogic.isSimple(number));
    }
}
