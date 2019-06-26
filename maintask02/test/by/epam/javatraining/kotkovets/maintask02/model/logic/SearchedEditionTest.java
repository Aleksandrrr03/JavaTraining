package by.epam.javatraining.kotkovets.maintask02.model.logic;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Album;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Book;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Edition;
import by.epam.javatraining.kotkovets.maintask01.model.entity.Magazine;
import by.epam.javatraining.kotkovets.maintask01.model.exception.MaxValueCapacityException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NullPointerException;
import by.epam.javatraining.kotkovets.maintask01.model.unity.Library;
import org.junit.Assert;
import org.junit.Test;

import static by.epam.javatraining.kotkovets.maintask01.model.logic.SearchedEdition.findAlbumByPhotoFormat;
import static by.epam.javatraining.kotkovets.maintask01.model.logic.SearchedEdition.findEditionByAuthor;
import static by.epam.javatraining.kotkovets.maintask01.model.logic.SearchedEdition.findEditionByTitle;

public class SearchedEditionTest {

    @Test
    public void testFindEditionByTitle(){
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = library.getEdition(2);
        Assert.assertEquals(expected,findEditionByTitle(library,"yt"));
    }

    @Test
    public void testFindEditionByTitleNot(){
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = new Edition();
        Assert.assertEquals(expected,findEditionByTitle(library,"dfdfdfdfdqer"));
    }

    @Test
    public void testFindEditionByTitleByZero(){
        Library library = new Library();
        fillTheLibraryByZero(library);
        Edition expected = new Edition();
        Assert.assertEquals(expected,findEditionByTitle(library,"yt"));
    }

    @Test
    public void testFindEditionByTitleByNegative(){
        Library library = new Library();
        fillTheLibraryByNegative(library);
        Edition expected = new Edition();
        Assert.assertEquals(expected,findEditionByTitle(library,"yt"));
    }

    @Test
    public void testFindEditionByAuthor(){
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = library.getEdition(2);
        Assert.assertEquals(expected,findEditionByAuthor(library,"dfdf"));
    }

    @Test
    public void testFindEditionByAuthorNot(){
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = new Edition();
        Assert.assertEquals(expected,findEditionByAuthor(library,"sddsfaew"));
    }

    @Test
    public void testFindEditionByAuthorByZero(){
        Library library = new Library();
        fillTheLibraryByZero(library);
        Edition expected = new Edition();
        Assert.assertEquals(expected,findEditionByAuthor(library,"dfdf"));
    }

    @Test
    public void testFindEditionByAuthorByNegative(){
        Library library = new Library();
        fillTheLibraryByNegative(library);
        Edition expected = new Edition();
        Assert.assertEquals(expected,findEditionByAuthor(library,"dfdf"));
    }

    @Test
    public void testFindAlbumByPhotoFormat(){
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findAlbumByPhotoFormat(library,"pht"));
    }

    @Test
    public void testFindAlbumByPhotoFormatNot(){
        Library library = new Library();
        fillTheLibrary(library);
        Edition expected = library.getEdition(0);
        Assert.assertEquals(expected,findAlbumByPhotoFormat(library,"sdsdsd"));
    }

    @Test
    public void testFindAlbumByPhotoFormatByZero(){
        Library library = new Library();
        fillTheLibraryByZero(library);
        Album expected = new Album();
        Assert.assertEquals(expected,findAlbumByPhotoFormat(library,"pht"));
    }

    @Test
    public void testFindAlbumPhotoFormatByNegative(){
        Library library = new Library();
        fillTheLibraryByNegative(library);
        Album expected = new Album();
        Assert.assertEquals(expected,findAlbumByPhotoFormat(library,"pht"));
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
