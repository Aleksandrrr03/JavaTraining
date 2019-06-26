package by.epam.javatraining.kotkovets.maintask02.model.entity;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Album;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTest {

    @Test
    public void testDefaultData(){
        Album album = new Album();
        Album expected = new Album(0," ",0,0," ",0," "," "," ");
        assertEquals(expected.toString(), album.toString());
    }

    @Test
    public void testSetPhotoFormat(){
        Album album = new Album();
        album.setPhotoFormat("A4");
        String expected = "A4";
        assertEquals(expected,album.getPhotoFormat());
    }


    @Test
    public void testSetPaperDensity(){
        Album album = new Album();
        album.setPaperDensity("Average");
        String expected = "Average";
        assertEquals(expected,album.getPaperDensity());
    }

    @Test
    public void testEqualsTrue(){
        Album firstAlbum = new Album();
        Album secondAlbum = new Album();
        boolean expected = true;
        assertEquals(expected,firstAlbum.equals(secondAlbum));
    }

    @Test
    public void testEqualsFalse(){
        Album firstAlbum = new Album();
        Album secondAlbum = new Album();
        secondAlbum.setPhotoFormat("A5");
        boolean expected = false;
        assertEquals(expected,firstAlbum.equals(secondAlbum));
    }




}
