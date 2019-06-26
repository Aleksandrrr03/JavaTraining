package by.epam.javatraining.kotkovets.maintask01.model.logic;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Edition;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NegativeArraySizeException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NullPointerException;
import by.epam.javatraining.kotkovets.maintask01.model.unity.Library;

/**
 * The class describes the performance of various operations on the edition.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Edition
 * @since JDK1.0
 */

public class EditionLogic {

    public static Edition findOldEdition(Library library) throws NullPointerException, NegativeArraySizeException {
        Edition resultEdition = new Edition();
        if(check(library)){
            resultEdition = library.getEdition(0);
            for (int i = 1; i < library.getSize(); i++) {
                if(library.getEdition(i).getYearOfIssue() < resultEdition.getYearOfIssue()){
                    resultEdition = library.getEdition(i);
                }
            }
        }
        return resultEdition;
    }

    public static Edition findYoungEdition(Library library) throws NullPointerException, NegativeArraySizeException {
        Edition resultEdition = new Edition();
        if(check(library)){
            resultEdition = library.getEdition(0);
            for (int i = 1; i < library.getSize(); i++) {
                if(library.getEdition(i).getYearOfIssue() > resultEdition.getYearOfIssue()){
                    resultEdition = library.getEdition(i);
                }
            }
        }
        return resultEdition;
    }

    public static Edition findEditionWithMinCountOfPages(Library library) throws NullPointerException, NegativeArraySizeException {
        Edition resultEdition = new Edition();
        if(check(library)){
            resultEdition = library.getEdition(0);
            for (int i = 1; i < library.getSize(); i++) {
                if(library.getEdition(i).getCountOfPages() < resultEdition.getCountOfPages()){
                    resultEdition = library.getEdition(i);
                }
            }
        }
        return resultEdition;
    }

    public static Edition findEditionWithMaxCountOfPages(Library library) throws NullPointerException, NegativeArraySizeException {
        Edition resultEdition = new Edition();
        if(check(library)){
            resultEdition = library.getEdition(0);
            for (int i = 1; i < library.getSize(); i++) {
                if(library.getEdition(i).getCountOfPages() > resultEdition.getCountOfPages()){
                    resultEdition = library.getEdition(i);
                }
            }
        }
        return resultEdition;
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
