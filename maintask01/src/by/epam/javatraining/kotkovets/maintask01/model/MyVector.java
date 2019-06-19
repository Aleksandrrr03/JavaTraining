package by.epam.javatraining.kotkovets.maintask01.model;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class allows to work with a growable array of double values.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 17.06.2019
 */

public class MyVector {

    private static final Logger logger = Logger.getRootLogger();

    private static final int DEАFAULT_CAPASITY = 10;
    private static final int MAX_CAPASITY = 1_000_000_000;

    private double[] vector;
    private int size;
    private int capasity;


    public MyVector() {
        capasity = DEАFAULT_CAPASITY;
        size = 0;
        vector = new double[capasity];
    }

    public MyVector(int capasity) {
        if (capasity < 0) {
            logger.warn("Negative array  size!");
            capasity = DEАFAULT_CAPASITY;
        } else if (capasity == 0) {
            logger.warn("Zero vector size!");
            capasity = DEАFAULT_CAPASITY;
        } else {
            this.capasity = capasity;
        }
        size = 0;
        vector = new double[capasity];

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        MyVector newVector = (MyVector) obj;
        if (newVector.size != size || newVector.capasity != capasity) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (newVector.getValue(i) != vector[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, capasity);
        result = 31 * result + Arrays.hashCode(vector);
        return result;
    }

    @Override
    public String toString() {
        return "MyVector{" +
                "vector=" + Arrays.toString(vector) +
                ", size=" + size +
                ", capasity=" + capasity +
                '}';
    }

    public int getSize() {
        return size;
    }

    public int getCapasity() {
        return capasity;
    }

    public boolean checkIndex(int index) {
        boolean result = true;
        if (index < 0 || index > size) {
            logger.warn("Vector index out of bounds!");
            result = false;
        }
        return result;
    }

    public void addValue(int index, double value) {
        if (checkIndex(index)) {
            vector[index] = value;
        }
    }

    private void increaseCapasity() {
        if (capasity > MAX_CAPASITY / 2) {
            logger.warn("Max value capacity!");
            return;
        }
        capasity *= 2;

        double[] newVector = new double[capasity];
        for (int i = 0; i < size; i++) {
            newVector[i] = vector[i];
        }
        vector = newVector;
    }

    public double getValue(int index) {
        double value = Double.NaN;
        if (checkIndex(index)) {
            value = vector[index];
        }
        return value;
    }

    public void add(double... values) {
        if (values.length == 0) {
            logger.warn("Null pointer!");
            return;
        }
        while (size + values.length > capasity && capasity < MAX_CAPASITY / 2) {
            increaseCapasity();
        }
        for (int i = size, j = 0; j < values.length && i < capasity; i++, j++) {
            vector[i] = values[j];
        }
        size += values.length;
    }

    public void swap(int fIndex, int sIndex) {
        if (checkIndex(fIndex) && checkIndex(sIndex)) {
            double tmp = vector[sIndex];
            vector[fIndex] = vector[sIndex];
            vector[sIndex] = tmp;
        }
    }
}
