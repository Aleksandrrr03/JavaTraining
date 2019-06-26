package by.epam.javatraining.kotkovets.maintask01.model.logic;

import by.epam.javatraining.kotkovets.maintask01.model.entity.*;

import by.epam.javatraining.kotkovets.maintask01.model.exception.NegativeArraySizeException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NullPointerException;
import by.epam.javatraining.kotkovets.maintask01.model.unity.Library;

/**
 * This class describes the calculation of values according to certain parameters.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Edition
 * @since JDK1.0
 */

public class CountedEdition {

    public static int countAllEdition(Library library) {
        int count = -1;
        try {
            if (check(library)) {
                for (int i = 0; i < library.getSize(); i++) {
                    count += library.getEdition(i).getCountOfEdition();
                }
                count += 1;
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int countBookOnly(Library library) {
        int count = -1;
        try {
            if (check(library)) {
                for (int i = 0; i < library.getSize(); i++) {
                    if (library.getEdition(i).getClass() == Book.class) {
                        if (library.getEdition(i).getCountOfEdition() < 0) {
                            count = -1;
                            return count;
                        }
                        count+=library.getEdition(i).getCountOfEdition();
                    }
                }
                count += 1;
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int countAlbumOnly(Library library) {
        int count = -1;
        try {
            if (check(library)) {
                for (int i = 0; i < library.getSize(); i++) {
                    if (library.getEdition(i).getClass() == Album.class) {
                        if (library.getEdition(i).getCountOfEdition() < 0) {
                            count = -1;
                            return count;
                        }
                        count+=library.getEdition(i).getCountOfEdition();
                    }
                }
                count += 1;
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int countMagazineOnly(Library library) {
        int count = -1;
        try {
            if (check(library)) {
                for (int i = 0; i < library.getSize(); i++) {
                    if (library.getEdition(i).getClass() == Magazine.class) {
                        if (library.getEdition(i).getCountOfEdition() < 0) {
                            count = -1;
                            return count;
                        }
                        count+=library.getEdition(i).getCountOfEdition();
                    }
                }
                count += 1;
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return count;
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
