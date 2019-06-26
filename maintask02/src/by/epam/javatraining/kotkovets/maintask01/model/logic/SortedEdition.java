package by.epam.javatraining.kotkovets.maintask01.model.logic;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Edition;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NegativeArraySizeException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NullPointerException;
import by.epam.javatraining.kotkovets.maintask01.model.unity.Library;

/**
 * The class describes the methods for performing a sorting for a work by various parameters.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Edition
 * @since JDK1.0
 */

public class SortedEdition {

    public static void sortBubbleIncrease(Library library) throws NullPointerException, NegativeArraySizeException {
        if (!check(library)) {
            return;
        }
        for (int i = 1; i < library.getSize(); i++) {
            for (int j = 0; j < library.getSize() - i; j++) {
                if (library.getEdition(j).getCountOfEdition() > library.getEdition(j + 1).getCountOfEdition()) {
                    library.swap(j, j + 1);
                }
            }
        }
    }

    public static void sortBubbleDecrease(Library library) throws NullPointerException, NegativeArraySizeException {
        if (!check(library)) {
            return;
        }
        for (int i = 1; i < library.getSize(); i++) {
            for (int j = 0; j < library.getSize() - i; j++) {
                if (library.getEdition(j).getCountOfEdition() < library.getEdition(j + 1).getCountOfEdition()) {
                    library.swap(j, j + 1);
                }
            }
        }
    }

    private static boolean check(Library library) throws NegativeArraySizeException, NullPointerException {
        boolean result = true;
        if (library.getSize() < 0) {
            throw new NegativeArraySizeException();
        } else if (library.getSize() == 0) {
            throw new NullPointerException();
        } else return result;
    }

}
