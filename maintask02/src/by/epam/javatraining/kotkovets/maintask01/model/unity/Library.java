package by.epam.javatraining.kotkovets.maintask01.model.unity;


import by.epam.javatraining.kotkovets.maintask01.model.entity.Edition;
import by.epam.javatraining.kotkovets.maintask01.model.exception.MaxValueCapacityException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NegativeArraySizeException;
import by.epam.javatraining.kotkovets.maintask01.model.exception.NullPointerException;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class describes the essence(entity) of "Library".
 * The class describes the work with an array of editions.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @since JDK1.0
 */


public class Library {

    private static final Logger logger = Logger.getRootLogger();

    private static final int DEFAULT_CAPASITY = 10;
    private static final int MAX_CAPASITY = 1_000_000_000;

    private Edition[] editions;
    private int size;
    private int capasity = DEFAULT_CAPASITY;

    public Library() {
        editions = new Edition[capasity];
    }

    public Library(int capasity) throws NegativeArraySizeException {
        if (capasity < 0) {
            logger.error("NegativeArraySizeException!");
            throw new NegativeArraySizeException();
        } else {
            this.capasity = capasity;
        }
        editions = new Edition[this.capasity];
    }

    public Edition[] getEditions() {
        return editions;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    private boolean checkIndex(int index) {
        boolean result = true;
        try {
            if (index < 0 || index >= size) {
                result = false;
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("ArrayIndexOutOfBoundsException!");
        }
        return result;
    }

    private void increaseCapacity() throws MaxValueCapacityException {
        if (capasity > MAX_CAPASITY / 2) {
            throw new MaxValueCapacityException();
        }
        capasity *= 2;
        Edition[] newLibrary = new Edition[capasity];
        for (int i = 0; i < size; i++) {
            newLibrary[i] = editions[i];
        }
        editions = newLibrary;
    }

    public void addElement(int index, Edition edition) {
        if (checkIndex(index)) {
            editions[index] = edition;
        }
    }

    public Edition getEdition(int index) {
        Edition edition = new Edition();
        if (checkIndex(index)) {
            edition = editions[index];
        }
        return edition;
    }


    public void add(Edition... editions) throws NullPointerException, MaxValueCapacityException {
        if (editions == null) {
            throw new NullPointerException();
        }
        while (size + editions.length > capasity && capasity < MAX_CAPASITY / 2) {
            increaseCapacity();
        }
        for (int i = size, j = 0; j < editions.length && i < capasity; i++, j++) {
           this.editions[i] = editions[j];
        }
        size += editions.length;
    }


    public void swap(int index1, int index2) {
        if (checkIndex(index1) && checkIndex(index2)) {
            Edition tmp = editions[index1];
            editions[index1] = editions[index2];
            editions[index2] = tmp;
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "editions=" + Arrays.toString(editions) +
                ", size=" + size +
                ", capasity=" + capasity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return size == library.size &&
                capasity == library.capasity &&
                Arrays.equals(editions, library.editions);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(size, capasity);
        result = 31 * result + Arrays.hashCode(editions);
        return result;
    }


}
