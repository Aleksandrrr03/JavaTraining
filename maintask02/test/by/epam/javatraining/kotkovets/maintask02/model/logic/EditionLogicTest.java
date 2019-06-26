package by.epam.javatraining.kotkovets.maintask02.model.logic;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Album;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Book;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Edition;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Magazine;
import by.epam.javatraining.kotkovets.maintask01.model.exception.MaxValueCapacityException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NegativeArraySizeException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NullPointerException;
import by.epam.javatraining.kotkovets.maintask01.model.unity.Library;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;

import static by.epam.javatraining.kotkovets.maintask01.model.logic.EditionLogic.*;

public class EditionLogicTest {

    @Test
    public void testFindOldEdition() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findOldEdition(library));
    }

    @Test
    public void testFindOldEditionByZero() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibraryByZero(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findOldEdition(library));
    }

    @Test
    public void testFindOldEditionByNegative() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibraryByNegative(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findOldEdition(library));
    }


    @Test
    public void testFindYoungEdition() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = library.getEdition(1);
        Assert.assertEquals(expected,findYoungEdition(library));
    }

    @Test
    public void testFindYoungEditionByZero() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibraryByZero(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findYoungEdition(library));
    }

    @Test
    public void testFindYoungEditionByNegative() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibraryByNegative(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findYoungEdition(library));
    }

    @Test
    public void testFindEditionWithMinCountOfPages() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = library.getEdition(2);
        Assert.assertEquals(expected,findEditionWithMinCountOfPages(library));
    }

    @Test
    public void testFindEditionWithMinCountOfPagesByZero() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibraryByZero(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findEditionWithMinCountOfPages(library));
    }

    @Test
    public void testFindEditionWithMinCountOfPagesByNegative() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibraryByNegative(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findEditionWithMinCountOfPages(library));
    }


    @Test
    public void testFindEditionWithMaxCountOfPages() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findEditionWithMaxCountOfPages(library));
    }

    @Test
    public void testFindEditionWithMaxCountOfPagesByZero() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibraryByZero(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findEditionWithMaxCountOfPages(library));
    }

    @Test
    public void testFindEditionWithMaxCountOfPagesByNegative() throws NullPointerException, NegativeArraySizeException {
        Library library = new Library();
        fillTheLibraryByNegative(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findEditionWithMaxCountOfPages(library));
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
}
