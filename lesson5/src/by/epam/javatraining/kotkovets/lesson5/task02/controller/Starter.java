package by.epam.javatraining.kotkovets.lesson5.task02.controller;

import by.epam.javatraining.kotkovets.lesson5.task01.view.View;
import by.epam.javatraining.kotkovets.lesson5.task02.model.logic.CharacterChecker;

public class Starter {

    public static void main(String[] args) {

        char character = 'y';

        /**
         * First way */
        // boolean isVowel = CharacterChecker.isVowelOne(character);

        /**
         * Second way */
        //boolean isVowel = CharacterChecker.isVowelTwo(character);

        /**
         * Third way */
        //boolean isVowel = CharacterChecker.isVowelOne(character);

        /**
         * Fourth  way */
        boolean isVowel = CharacterChecker.isVowelOne(character);

        View.print("Character:" + "'" + character + "'" + '\n'
                + "Is vowel: " + isVowel + '\n');
    }
}
