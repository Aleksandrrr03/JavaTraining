package by.epam.javatraining.kotkovets.lesson06.task04.controller;

import by.epam.javatraining.kotkovets.lesson06.task04.model.logic.NumberLogic;
import by.epam.javatraining.kotkovets.lesson06.task04.view.View;

public class Task04 {
    public static void main(String[] args) {
        int number = 222;
        View.print("It's even parity :"+NumberLogic.isEvenParity(number));
    }
}
