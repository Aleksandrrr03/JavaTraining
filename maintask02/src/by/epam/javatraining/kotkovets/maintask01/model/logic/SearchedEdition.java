package by.epam.javatraining.kotkovets.maintask01.model.logic;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Album;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Edition;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Magazine;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NegativeArraySizeException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NullPointerException;
import by.epam.javatraining.kotkovets.maintask01.model.unity.Library;

/**
 * The class describes the methods for performing a search for a work by various parameters.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Edition
 * @since JDK1.0
 */


public class SearchedEdition {

    public static Edition findEditionByTitle(Library library, String title) {
        Edition edition = new Edition();
        try {
            if (check(library)) {
                for (int i = 0; i < library.getSize(); i++) {
                    if (library.getEdition(i).getTitleOfEdition().equals(title)) {
                        return library.getEdition(i);
                    }
                }
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return edition;
    }

    public static Edition findEditionByAuthor(Library library, String author) {
        Edition edition = new Edition();
        try {
            if (check(library)) {
                for (int i = 0; i < library.getSize(); i++) {
                    if (library.getEdition(i).getAuthor().equals(author)) {
                        return library.getEdition(i);
                    }
                }
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return edition;
    }


    public static Album findAlbumByPhotoFormat(Library library, String photoFormat) {

        Album album = new Album();
        try {
            if (check(library)) {
                for (int i = 0; i < library.getSize(); i++) {
                    if (library.getEdition(i).getClass() == Album.class) {
                        album = (Album) library.getEdition(i);
                        if (album.getPhotoFormat() == photoFormat) {
                            return album;
                        }
                    }
                }
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return album;
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
