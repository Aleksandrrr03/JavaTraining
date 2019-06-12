package by.epam.javatraining.kotkovets.lesson06.task02.controller;

import by.epam.javatraining.kotkovets.lesson06.task01.view.View;
import by.epam.javatraining.kotkovets.lesson06.task02.model.logic.NumberLogic;

public class Task02 {
    public static void main(String[] args) {
        int firstNumber =  4321;
        View.print("Is a decreasing sequence:"+NumberLogic.isDecreasingSequence(firstNumber)+'\n');
        int secondNumber =  12345;
        View.print("Is a decreasing sequence:"+NumberLogic.isIncreasingSequence(secondNumber)+'\n');
    }
}
