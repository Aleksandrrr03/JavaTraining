package by.epam.javatraining.kotkovets.lesson5.task02.model.logic;

public class CharacterChecker {

    private static final char[] ARRAY_OF_VOWEL_CHARACTERS
            = {'a', 'e', 'i', 'o', 'u', 'y'};

    private static final String VOWEL_OF_CHARACTERS = "aeiouy";

    public static boolean isVowelOne(char character) {
        for (int i = 0; i < ARRAY_OF_VOWEL_CHARACTERS.length; ++i) {
            if (ARRAY_OF_VOWEL_CHARACTERS[i] == character) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowelTwo(char character) {
        return VOWEL_OF_CHARACTERS.contains(
                Character.toString(character));
    }

    public static boolean isVowelThree(char character) {
        return VOWEL_OF_CHARACTERS.indexOf(character) != -1;
    }

    public static boolean isVowelFour(char character) {
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
        }
        return false;
    }

}
