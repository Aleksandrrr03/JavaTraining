package by.epam.javatraining.kotkovets.maintask02.model.logic;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Album;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Book;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Magazine;
import by.epam.javatraining.kotkovets.maintask01.model.exception.MaxValueCapacityException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NegativeArraySizeException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NullPointerException;
import by.epam.javatraining.kotkovets.maintask01.model.unity.Library;
import org.junit.Assert;
import org.junit.Test;

import static by.epam.javatraining.kotkovets.maintask01.model.logic.SortedEdition.sortBubbleDecrease;
import static by.epam.javatraining.kotkovets.maintask01.model.logic.SortedEdition.sortBubbleIncrease;

public class SortedEditionTest {

    @Test
    public void testSortBubleIncrease() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        Library expected = new Library();
        fillTheLibrary(library);
        fillTheLibrarySortedIncrease(expected);
        sortBubbleIncrease(library);
        Assert.assertEquals(expected,library);
    }

    @Test
    public void testSortBubleIncreaseByZero() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        Library expected = new Library();
        fillTheLibraryByZero(library);
        fillTheLibraryByZero(expected);
        sortBubbleIncrease(library);
        Assert.assertEquals(expected,library);
    }

    @Test
    public void testSortBubleIncreaseByNegative() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        Library expected = new Library();
        fillTheLibraryByNegative(library);
        fillTheLibraryByNegative(expected);
        sortBubbleIncrease(library);
        Assert.assertEquals(expected,library);
    }

    @Test
    public void testSortBubleDecrease() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        Library expected = new Library();
        fillTheLibrary(library);
        fillTheLibrarySortedDecrease(expected);
        sortBubbleDecrease(library);
        Assert.assertEquals(expected,library);
    }

    @Test
    public void testSortBubleDecreaseByZero() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        Library expected = new Library();
        fillTheLibraryByZero(library);
        fillTheLibraryByZero(expected);
        sortBubbleDecrease(library);
        Assert.assertEquals(expected,library);
    }

    @Test
    public void testSortBubleDecreaseByNegative() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        Library expected = new Library();
        fillTheLibraryByNegative(library);
        fillTheLibraryByNegative(expected);
        sortBubbleDecrease(library);
        Assert.assertEquals(expected,library);
    }


    public static void fillTheLibrary(Library library) {
        Album album = new Album(12, "sd",554, 1255, "aut", 53, "type", "pht", "paD");
        Book book = new Book(23, "tre", 2014, "wesa", 34, "typerffg", "casdf", "asdf");
        Magazine magazine = new Magazine(2322, "yt", 2010, "dfdf", "prt", "fsd", "sfsf",22);
        try {
            library.add(album, book, magazine);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (MaxValueCapacityException e) {
            e.printStackTrace();
        }
    }

    public static void fillTheLibraryByZero(Library library) {
        Album album = new Album();
        Book book = new Book();
        Magazine magazine = new Magazine();
        try {
            library.add(album, book, magazine);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (MaxValueCapacityException e) {
            e.printStackTrace();
        }
    }

    public static void fillTheLibraryByNegative(Library library) {
        Album album = new Album();
        Book book = new Book();
        Magazine magazine = new Magazine();
        album.setCountOfEdition(-1);
        book.setCountOfEdition(-2);
        magazine.setCountOfEdition(-3);
        try {
            library.add(album, book, magazine);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (MaxValueCapacityException e) {
            e.printStackTrace();
        }
    }

    public static void fillTheLibrarySortedIncrease(Library library) {
        Album album = new Album(12, "sd",554, 1255, "aut", 53, "type", "pht", "paD");
        Book book = new Book(23, "tre", 2014, "wesa", 34, "typerffg", "casdf", "asdf");
        Magazine magazine = new Magazine(2322, "yt", 2010, "dfdf", "prt", "fsd", "sfsf",22);
        try {
            library.add(album, book, magazine);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (MaxValueCapacityException e) {
            e.printStackTrace();
        }
    }

    public static void fillTheLibrarySortedDecrease(Library library) {
        Album album = new Album(12, "sd",554, 1255, "aut", 53, "type", "pht", "paD");
        Book book = new Book(23, "tre", 2014, "wesa", 34, "typerffg", "casdf", "asdf");
        Magazine magazine = new Magazine(2322, "yt", 2010, "dfdf", "prt", "fsd", "sfsf",22);
        try {
            library.add( magazine,book,album);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (MaxValueCapacityException e) {
            e.printStackTrace();
        }
    }
}
