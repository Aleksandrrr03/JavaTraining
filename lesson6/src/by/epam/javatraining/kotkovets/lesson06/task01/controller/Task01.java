package by.epam.javatraining.kotkovets.lesson06.task01.controller;

import static by.epam.javatraining.kotkovets.lesson06.task01.model.logic.HeadOrTail.cheakHeadsOrTails;
import static by.epam.javatraining.kotkovets.lesson06.task01.view.View.print;

public class Task01 {
    public static void main(String[] args) {
        int steps = 12;
        print(cheakHeadsOrTails(steps));
    }
}
