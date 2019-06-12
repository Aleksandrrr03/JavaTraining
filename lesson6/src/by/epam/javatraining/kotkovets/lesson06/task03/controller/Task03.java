package by.epam.javatraining.kotkovets.lesson06.task03.controller;

import by.epam.javatraining.kotkovets.lesson06.task03.model.logic.NumberLogic;
import by.epam.javatraining.kotkovets.lesson06.task03.view.View;

public class Task03 {
    public static void main(String[] args) {
        int number = 5;
        View.print("5!= "+NumberLogic.findFactorial(number));
    }
}
