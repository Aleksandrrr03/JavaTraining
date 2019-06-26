package by.epam.javatraining.kotkovets.maintask02.model.logic;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Album;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Book;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Magazine;
import by.epam.javatraining.kotkovets.maintask01.model.exception.MaxValueCapacityException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NullPointerException;
import by.epam.javatraining.kotkovets.maintask01.model.unity.Library;

import static org.junit.Assert.*;

import org.junit.Test;

import static by.epam.javatraining.kotkovets.maintask01.model.logic.CountedEdition.*;

public class CountedEditionTest {

    @Test
    public void testCountAllEdition() {
        Library library = new Library();
        fillTheLibrary(library);
        int expected = 2357;
        assertEquals(expected, countAllEdition(library));
    }

    @Test
    public void testCountAllEditionByZero() {
        Library library = new Library();
        fillTheLibraryByZero(library);
        int expected = 0;
        assertEquals(expected, countAllEdition(library));
    }

    @Test
    public void testCountAllEditionByNegative() {
        Library library = new Library();
        fillTheLibraryByNegative(library);
        int expected = 0;
        assertEquals(expected, countAllEdition(library));
    }

    @Test
    public void testCountBookOnly() {
        Library library = new Library();
        fillTheLibrary(library);
        int expected = 23;
        assertEquals(expected, countBookOnly(library));
    }

    @Test
    public void testCountBookOnlyByZero() {
        Library library = new Library();
        fillTheLibraryByZero(library);
        int expected = 0;
        assertEquals(expected, countBookOnly(library));
    }

    @Test
    public void testCountBookOnlyByNegative() {
        Library library = new Library();
        fillTheLibraryByNegative(library);
        int expected = 0;
        assertEquals(expected, countBookOnly(library));
    }


    @Test
    public void testCountAlbumOnly() {
        Library library = new Library();
        fillTheLibrary(library);
        int expected = 12;
        assertEquals(expected, countAlbumOnly(library));
    }

    @Test
    public void testCountAlbumOnlyByZero() {
        Library library = new Library();
        fillTheLibraryByZero(library);
        int expected = 0;
        assertEquals(expected, countAlbumOnly(library));
    }

    @Test
    public void testCountBookAlbumByNegative() {
        Library library = new Library();
        fillTheLibraryByNegative(library);
        int expected = 0;
        assertEquals(expected, countAlbumOnly(library));
    }


    @Test
    public void testCountMagazineOnly() {
        Library library = new Library();
        fillTheLibrary(library);
        int expected = 2322;
        assertEquals(expected, countMagazineOnly(library));
    }

    @Test
    public void testCountMagazineOnlyByZero() {
        Library library = new Library();
        fillTheLibraryByZero(library);
        int expected = 0;
        assertEquals(expected, countMagazineOnly(library));
    }

    @Test
    public void testCountBookMagazineByNegative() {
        Library library = new Library();
        fillTheLibraryByNegative(library);
        int expected = 0;
        assertEquals(expected, countMagazineOnly(library));
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
