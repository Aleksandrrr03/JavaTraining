package by.epam.javatraining.kotkovets.maintask01.model.logic;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * This class contains different static methods for working with array.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0.0  10 Jun 2019
 */

public class VectorLogic {

    // Logger initialization
    private static final Logger logger = Logger.getRootLogger();

    //This method adds a new value to the vector
    public static double[] addValue(double[] vector, double value) {
        logger.info("Method: addValue()");
        double[] newVector = null;
        if (vector.length != 0) {
            newVector = new double[vector.length + 1];
            for (int i = 0; i < vector.length; i++) {
                newVector[i] = vector[i];
            }
            newVector[newVector.length - 1] = value;
            logger.info("Value has been added. Value:" + value);
        } else {
            logger.warn("Zero length array.");
        }
        return newVector;
    }

    //This method finds the maximum value of the vector
    public static double findMaxValue(double[] vector) {
        logger.info("Method: findMaxValue()");
        double maxValue = Double.MIN_VALUE;
        if (vector.length != 0) {
            for (double i : vector) {
                if (maxValue < i) {
                    maxValue = i;
                }
            }
            logger.info("Max value:" + maxValue);
        } else {
            logger.warn("Zero length array.");
        }
        return maxValue;
    }

    //This method finds the minimum value of the vector
    public static double findMinValue(double[] vector) {
        logger.info("Method: findMinValue()");
        double minValue = Double.MAX_VALUE;
        if (vector.length != 0) {
            for (double i : vector) {
                if (minValue > i) {
                    minValue = i;
                }
            }
            logger.info("Min value:" + minValue);
        } else {
            logger.warn("Zero length array.");
        }
        return minValue;
    }

    //This method find the geometric average of vector values
    public static double findGeometricAverage(double[] vector) {
        logger.info("Method: findGeometricAverage()");
        double multiply = 0;
        if (vector.length != 0) {
            multiply = vector[0];
            for (int i = 0; i < vector.length; i++) {
                multiply *= vector[i];
            }
            multiply = Math.pow(multiply, 1.0 / vector.length);
            logger.info("Geometric Average:" + multiply);
        } else {
            logger.warn("Zero length array.");
        }
        return multiply;
    }

    //This method find the arithmetic  average of vector values
    public static double findArithmeticAverage(double[] vector) {
        logger.info("Method: findArithmeticAverage()");
        double sum = 0;
        if (vector.length != 0) {
            sum = vector[0];
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i];
            }
            sum /= vector.length;
            logger.info("Arithmetic Average:" + sum);
        } else {
            logger.warn("Zero length array.");
        }

        return sum;
    }

    //This method checks that vector values are in increasing order
    public static boolean isSortedIncreasing(double[] vector) {
        logger.info("Method: isSortedIncreasing()");
        if (vector.length == 0) {
            logger.warn("Zero length array.");
            return false;
        } else {
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    logger.info("Vector values are not sorted increasing. Vector: " + Arrays.toString(vector));
                    return false;
                }
            }
        }
        logger.info("Vector values are sorted increasing. Vector:" + Arrays.toString(vector));
        return true;
    }

    //This method checks that vector values are in decreasing order
    public static boolean isSortedDecreasing(double[] vector) {
        logger.info("Method: isSortedDecreasing()");

        if (vector.length == 0) {
            logger.warn("Zero length array.");
            return false;
        } else {
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] < vector[i + 1]) {
                    logger.info("Vector values are not sorted decreasing. Vector: " + Arrays.toString(vector));
                    return false;
                }
            }
        }
        logger.info("Vector values are sorted decreasing. Vector:" + Arrays.toString(vector));
        return true;
    }

    //This method checks that vector values are in an ordered form
    public static boolean isOrdered(double[] vector) {
        logger.info("Method: isOrdered()");

        return (isSortedDecreasing(vector) || isSortedIncreasing(vector));
    }

    //This method finds position of the local minimum of vector values
    public static int findLocalMinPosition(double[] vector) {
        logger.info("Method: findLocalMinPosition()");

        if (vector.length != 0) {
            for (int i = 1; i < vector.length - 1; i++) {
                if (vector[i - 1] > vector[i] && vector[i + 1] > vector[i]) {
                    logger.info("Local minimum position: " + i);
                    return i;
                }
            }
        } else {
            logger.warn("Zero length array.");
        }
        logger.info("No local minimum.");
        return -1;
    }

    //This method finds position of the local maximum of vector values
    public static int findLocalMaxPosition(double[] vector) {
        logger.info("Method: findLocalMaxPosition()");

        if (vector.length != 0) {
            for (int i = 1; i < vector.length - 1; i++) {
                if (vector[i - 1] < vector[i] && vector[i + 1] < vector[i]) {
                    logger.info("Local max position: " + i);
                    return i;
                }
            }
        } else {
            logger.warn("Zero length array.");
        }
        logger.info("No local max.");
        return -1;
    }

    //This method finds the first position of key value in the vector
    public static int searchLinearFirstPosition(double[] vector, double key) {
        logger.info("Method: searchLinearFirstPosition()");

        if (vector.length != 0) {
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == key) {
                    logger.info("Value:" + key + " ;Position:[" + i + ']');
                    return i;
                }
            }
        } else {
            logger.warn("Zero length array.");
        }
        logger.info("No value in vector.");
        return -1;
    }

    //This method finds the last position of key value in the vector
    public static int searchLinearLastPosition(double[] vector, double key) {
        logger.info("Method: searchLinearLastPosition()");

        if (vector.length != 0) {
            for (int i = vector.length - 1; i >= 0; i--) {
                if (vector[i] == key) {
                    logger.info("Value:" + key + " ;Position:[" + i + ']');
                    return i;
                }
            }
        } else {
            logger.warn("Zero length array.");
        }
        logger.info("No value in vector.");
        return -1;
    }

    // This method finds the first position of key value in the sorted vector
    public static int searchBinaryFirst(double[] vector, double key) {
        logger.info("Method: searchBinaryFirst()");
        if (vector.length != 0) {
            return searchBinary(vector, key, 0, vector.length - 1, true);
        } else {
            logger.warn("Zero length array.");
            return -1;
        }
    }

    // This method finds the last position of key value in the sorted vector
    public static int searchBinaryLast(double[] vector, double key) {
        logger.info("Method: searchBinaryLast()");

        if (vector.length != 0) {
            return searchBinary(vector, key, 0, vector.length - 1, false);
        } else {
            logger.warn("Zero length array.");
            return -1;
        }
    }

    // This method recursively divides vector into subvectors and search key value by binary search.
    // If the array is not sorted, the results is undefined.
    private static int searchBinary(double[] vector, double key, int left, int right, boolean order) {
        logger.info("Method: searchBinary()");

        if (right < left) {
            logger.warn("Invalid values.");
            return -1;
        }
        int middle = left + (right - left) / 2;
        if (vector[middle] == key && ((order && vector[middle - 1] != key) || (!order && vector[middle + 1] != key))) {
            return middle;
        }
        if (order && vector[middle] >= key) {
            return searchBinary(vector, key, left, middle - 1, order);
        }
        return searchBinary(vector, key, middle + 1, right, order);
    }

    // This method search key value by binary search.
    public static int searchBinarySecond(double[] vector, double key) {
        logger.info("Method: searchBinarySecond()");

        int result = -1;

        if (vector.length != 0) {

            int firstIndex = 0;
            int secondIndex = vector.length;

            if (isSortedIncreasing(vector)) {
                while (firstIndex < secondIndex && firstIndex >= 0 && secondIndex <= vector.length) {
                    int middle = firstIndex + (secondIndex - firstIndex) / 2;
                    if (vector[middle] == key) {
                        result = middle;
                        logger.info("Index key:[" + result + ']');
                        break;
                    }
                    if (vector[middle] > key) {
                        secondIndex = middle;
                    } else
                        firstIndex = middle + 1;
                }
            } else {
                logger.warn("Vector not sorted.");
            }
        } else {
            logger.warn("Zero length array.");
        }
        return result;
    }

    //This method reverse all vector values
    public static boolean reverseVector(double[] vector) {
        logger.info("Method: reverseVector()");

        boolean result = false;
        if (vector.length != 0) {
            for (int i = 0; i < vector.length / 2; i++) {
                swap(vector, i, vector.length - 1 - i);
            }
            logger.info("Reversal successful.");
            result = true;
        } else {
            logger.warn("Zero length array.");
        }
        return result;
    }

    //This method sorts all vector values in increasing order by bubble sort
    public static boolean sortBubbleIncrease(double[] vector) {
        logger.info("Method: sortBubbleIncrease()");

        boolean result = false;
        if (vector.length != 0) {
            for (int i = 1; i < vector.length; ++i) {
                for (int j = 0; j < vector.length - i; ++j) {
                    if (vector[j] > vector[j + 1]) {
                        swap(vector, j, j + 1);
                    }
                }
            }
            logger.info("Sort successful.");
            result = true;
        } else {
            logger.warn("Zero length array.");
        }
        return result;
    }

    //This method sorts all vector values in Decreasing order by bubble sort
    public static boolean sortBubbleDecrease(double[] vector) {
        logger.info("Method: sortBubbleDecrease()");

        boolean result = false;
        if (vector.length != 0) {
            for (int i = 1; i < vector.length; ++i) {
                for (int j = 0; j < vector.length - i; ++j) {
                    if (vector[j] < vector[j + 1]) {
                        swap(vector, j, j + 1);
                    }
                }
            }
            logger.info("Sort successful.");
            result = true;
        } else {
            logger.warn("Zero length array.");
        }
        return result;
    }

    // This method sorts all vector values in increasing order by insertion sort
    public static boolean sortInsertionIncrease(double[] vector) {
        logger.info("Method: sortInsertionIncrease()");

        boolean result = false;
        if (vector.length != 0) {
            for (int i = 1; i < vector.length; ++i) {
                double tmp = vector[i];
                int j = i - 1;
                while (j >= 0 && tmp < vector[j]) {
                    vector[j + 1] = vector[j];
                    --j;
                }
                vector[j + 1] = tmp;
            }
            logger.info("Sort successful.");
            result = true;
        } else {
            logger.warn("Zero length array.");
        }
        return result;
    }

    // This method sorts all vector values in decreasing order by insertion sort
    public static void sortInsertionDecrease(double[] vector) {
        logger.info("Method: sortInsertionDecrease()");

        if (vector.length != 0) {
            for (int i = 1; i < vector.length; ++i) {
                double tmp = vector[i];
                int j = i - 1;
                while (j >= 0 && tmp > vector[j]) {
                    vector[j + 1] = vector[j];
                    --j;
                }
                vector[j + 1] = tmp;
            }
            logger.info("Sort successful.");
        } else {
            logger.warn("Zero length array.");
        }
    }

    //  This method sorts all vector values in increasing order by selection sort
    public static void sortSelectionIncrease(double[] vector) {
        logger.info("Method: sortSelectionIncrease()");

        if (vector.length != 0) {
            for (int i = 0; i < vector.length - 1; ++i) {
                int k = i;
                for (int j = i + 1; j < vector.length; ++j) {
                    if (vector[k] > vector[j]) {
                        k = j;
                    }
                }
                swap(vector, k, i);
            }
            logger.info("Sort successful.");
        } else {
            logger.warn("Zero length array.");
        }
    }

    // This method sorts all vector values in increasing order by merge sort
    public static void sortMergeIncrease(double[] vector) {
        logger.info("Method: sortMergeIncrease()");

        if (vector.length != 0) {
            sortMerge(vector, 0, vector.length - 1, true);
        } else {
            logger.warn("Zero length array.");
        }
    }

    // This method sorts all vector values in decreasing order by merge sort
    public static void sortMergeDecrease(double[] vector) {
        logger.info("Method: sortMergeDecrease()");

        if (vector.length != 0) {
            sortMerge(vector, 0, vector.length - 1, false);
        } else {
            logger.warn("Zero length array.");
        }
    }

    private static void sortMerge(double[] vector, int left, int right, boolean order) {
        logger.info("Method: sortMerge()");

        if (right <= left) {
            return;
        }
        int middle = left + (right - left) / 2;
        sortMerge(vector, left, middle, order);
        sortMerge(vector, middle + 1, right, order);

        double[] tmp = new double[vector.length];

        for (int k = left; k <= right; ++k) {
            tmp[k] = vector[k];
        }
        for (int i = left, j = middle + 1, k = left; k <= right; k++) {
            if (i > middle) {
                vector[k] = tmp[j++];
            } else if (j > right) {
                vector[k] = tmp[i++];
            } else if ((order && tmp[j] < tmp[i]) || (!order && tmp[j] > tmp[i])) {
                vector[k] = tmp[j++];
            } else {
                vector[k] = tmp[i++];
            }
        }
    }

    // This method sorts all vector values in increasing order by quick sort.
    public static void sortQuickIncrease(double[] vector) {
        logger.info("Method: sortQuickIncrease()");

        if (vector.length != 0) {
            sortQuick(vector, 0, vector.length - 1, true);
        } else {
            logger.warn("Zero length array.");
        }
    }

    // This method sorts all vector values in decreasing order by quick sort.
    public static void sortQuickDecrease(double[] vector) {
        logger.info("Method: sortQuickDecrease()");

        if (vector.length != 0) {
            sortQuick(vector, 0, vector.length - 1, false);
        } else {
            logger.warn("Zero length array.");
        }
    }

    // This method recursively divides array into subarrays and sort them by quick sort.
    private static void sortQuick(double[] vector, int left, int right, boolean order) {
        logger.info("Method: sortQuick()");

        if (left >= right) {
            return;
        }
        int i = left, j = right;
        int average = i - (i - j) / 2;
        while (i < j) {
            while (i < average && ((order && vector[i] <= vector[average]) || (!order && vector[i] >= vector[average]))) {
                i++;
            }
            while (j > average && ((order && vector[j] >= vector[average]) || (!order && vector[j] <= vector[average]))) {
                j--;
            }
            if (i < j) {
                swap(vector, i, j);
                if (i == average) {
                    average = j;
                } else if (j == average) {
                    average = i;
                }
                sortQuick(vector, left, average, order);
                sortQuick(vector, average + 1, right, order);
            }
        }
    }

    public static void swap(double[] array, int firstIndex, int secondIndex) {
        logger.info("Method: swap()");

        double tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
}
