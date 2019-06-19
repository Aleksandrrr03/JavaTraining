package by.epam.javatraining.kotkovets.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains unit-tests for check class MyVector.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 17.06.2019
 */

public class MyVectorTest {

    @Test
    public void testToString() {
        MyVector vector = new MyVector(7);
        vector.add(46, 48, 921, 15, 654, 987, 4);
        String expected = "MyVector{vector=[46.0, 48.0, 921.0, 15.0, 654.0, 987.0, 4.0], size=7, capasity=7}";
        assertEquals(expected, vector.toString());
    }

    @Test
    public void testEqualsOneRef() {
        MyVector vector = new MyVector(4);
        MyVector newVector = vector;
        boolean expected = true;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testEqualsNull() {
        MyVector vector = new MyVector(7);
        vector.add(46, 48, 921, 15, 654, 987, 4);
        MyVector newVector = null;
        boolean expected = false;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testEqualsClass() {
        MyVector vector = new MyVector(7);
        vector.add(46, 48, 921, 15, 654, 987, 4);
        String str = new String("Vector");
        boolean expected = false;
        assertEquals(expected, vector.equals(str));
    }

    @Test
    public void testEqualsCapacity() {
        MyVector vector = new MyVector(80);
        MyVector newVector = new MyVector(888);
        boolean expected = false;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testEqualsSize() {
        MyVector vector = new MyVector(3);
        vector.add(7, 9, 7);
        MyVector newVector = new MyVector(3);
        newVector.add(7, 9, 7, 9);
        boolean expected = false;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testEqualsValues() {
        MyVector vector = new MyVector(88);
        vector.add(7, 9, 7);
        MyVector newVector = new MyVector(88);
        newVector.add(7, 9, 7);
        boolean expected = true;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testGetSizeZero() {
        MyVector vector = new MyVector();
        int expected = 0;
        assertEquals(expected, vector.getSize());
    }

    @Test
    public void testGetSizeNegative() {
        MyVector vector = new MyVector(-888);
        int expected = 0;
        assertEquals(expected, vector.getSize());
    }

    @Test
    public void testGetSizePositive() {
        MyVector vector = new MyVector(500);
        int expected = 0;
        assertEquals(expected, vector.getSize());
    }

    @Test
    public void testGetSizePositiveAdd() {
        MyVector vector = new MyVector(3);
        vector.add(8, 11, 5, 165, 465, 4654, 64, 7, 89);
        vector.add(78, 845, 156, 47, 87, 64, 31, 2, 14, 654);
        vector.add(12, 12, 4);
        int expected = 22;
        assertEquals(expected, vector.getSize());
    }

    @Test
    public void testGetValuePositiveIndex() {
        MyVector vector = new MyVector();
        vector.add(78, 75, 45, 4, 42, 69, 222);
        int index = 3;
        double expected = 4;
        assertEquals(expected, vector.getValue(index), 0.1);
    }

    @Test
    public void testGetValueNegativeIndex() {
        MyVector vector = new MyVector();
        vector.add(78, 75, 45, 4, 42, 69, 222);
        int index = -5;
        double expected = Double.NaN;
        assertEquals(expected, vector.getValue(index), 0.1);
    }

    @Test
    public void testGetValueOutOfBounds() {
        MyVector vector = new MyVector(8);
        vector.add(78, 75, 45, 4, 42, 69, 222);
        int index = 51;
        double expected = Double.NaN;
        assertEquals(expected, vector.getValue(index), 0.1);
    }

    @Test
    public void testGetValueZeroIndex() {
        MyVector vector = new MyVector(8);
        vector.add(78, 75, 45, 4, 42, 69, 222);
        int index = 0;
        double expected = 78;
        assertEquals(expected, vector.getValue(index), 0.1);
    }

    @Test
    public void testAddValuePositiveIndex() {
        MyVector vector = new MyVector(8);
        vector.add(78, 75, 45, 4, 42, 69, 222);
        int index = 3;
        double newValue = 8744;
        vector.addValue(index, newValue);
        assertEquals(newValue, vector.getValue(index), 0.1);
    }

    @Test
    public void testSwapFirst() {
        MyVector vector = new MyVector(3);
        vector.add(4, 654, 64, 654, 65465, 4645, 4, 48, 4, 456, 8, 48, 45);
        int index1 = 4, index2 = 9;
        vector.swap(index1, index2);
        MyVector expected = new MyVector();
        expected.add(4, 654, 64, 654, 456, 4645, 4, 48, 4, 65465, 8, 48, 45);
        assertFalse(expected.equals(vector));
    }


    @Test
    public void testSwapOutOfBounds() {
        MyVector vector = new MyVector(5);
        vector.add(7,4,564,56,4,8,7,98,654,3,1564);
        int index1 = -54, index2 = 2;
        vector.swap(index1, index2);
        MyVector expected = new MyVector();
        vector.add(7,4,564,56,4,8,7,98,654,3,1564);
        assertFalse(expected.equals(vector));
    }
}
