package by.epam.javatraining.kotkovets.lesson5.task03.controller;

import by.epam.javatraining.kotkovets.lesson5.task01.view.View;
import by.epam.javatraining.kotkovets.lesson5.task03.model.logic.MoodSensor;

public class Starter {
    public static void main(String[] args) {

        String mood = MoodSensor.makeRandomMood();
        View.print(mood+'\n');
    }
}
