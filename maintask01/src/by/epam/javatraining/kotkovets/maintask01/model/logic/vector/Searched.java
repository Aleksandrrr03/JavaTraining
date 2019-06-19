package by.epam.javatraining.kotkovets.maintask01.model.logic.vector;

import by.epam.javatraining.kotkovets.maintask01.model.MyVector;
import org.apache.log4j.Logger;

/**
 * This class contains static methods for search MyVector.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 17.06.2019
 */

public class Searched {

    private static final Logger logger = Logger.getRootLogger();


    //This method finds the first position of key value in the vector.
    public static int searchLinearFirst(MyVector vector, double key) {
        if (checkNull(vector)) {
            for (int i = 0; i < vector.getSize(); i++) {
                if (vector.getValue(i) == key) {
                    return i;
                }
            }
        }
        return -1;
    }

    //This method finds the last position of key value in the vector.
    public static int searchLinearLast(MyVector vector, double key) {
        if (checkNull(vector)) {
            for (int i = vector.getSize() - 1; i >= 0; i--) {
                if (vector.getValue(i) == key) {
                    return i;
                }
            }
        }
        return -1;
    }

    // This method finds the first position of key value in the sorted vector.
    // If the vector is not sorted, the results is undefined.
    public static int searchBinaryFirst(MyVector vector, double key) {
        if (checkNull(vector)) {
            return searchBinary(vector, key, 0, vector.getSize() - 1, true);
        }
        return -1;
    }

    // This method finds the last position of key value in the sorted vector.
    // If the vector is not sorted, the results is undefined.
    public static int searchBinaryLast(MyVector vector, double key) {
        if (checkNull(vector)) {
            return searchBinary(vector, key, 0, vector.getSize() - 1, false);
        }
        return -1;
    }

    // This method recursively divides vector into subvectors and search key value by binary search.
    //  If the vector is not sorted, the results is undefined.
    private static int searchBinary(MyVector vector, double key, int left, int right, boolean order) {
        if (right < left) {
            return -1;
        }
        int middle = left + (right - left) / 2;
        if (vector.getValue(middle) == key && ((order && vector.getValue(middle - 1) != key)
                || (!order && vector.getValue(middle + 1) != key))) {
            return middle;
        }
        if (order && vector.getValue(middle) >= key) {
            return searchBinary(vector, key, left, middle - 1, order);
        }
        return searchBinary(vector, key, middle + 1, right, order);
    }

    //This method checks if the reference is null.
    private static boolean checkNull(MyVector vector) {
        if (vector == null) {
            logger.warn("Null Pointer!");
            return false;
        }
        return true;
    }
}