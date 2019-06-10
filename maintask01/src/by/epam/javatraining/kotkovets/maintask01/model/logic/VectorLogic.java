package by.epam.javatraining.kotkovets.maintask01.model.logic;

/**
 * This class contains different static methods for working with array.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0.0
 */

public class VectorLogic {

    //This method finds the maximum value of the vector
    public static double findMaxValue(double[] vector) {
        double maxValue = vector[0];
        for (double i : vector) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    //This method finds the minimum value of the vector
    public static double findMinValue(double[] vector) {
            double minValue = vector[0];
            for (double i : vector) {
                if (minValue > i) {
                    minValue = i;
                }
            }
            return minValue;
    }

    //This method find the geometric average of vector values
    public static double findGeometricAverage(double[] vector) {
        double multiply = 0;
        if (vector.length != 0) {
            multiply = vector[0];
            for (int i = 0; i < vector.length; i++) {
                multiply *= vector[i];
            }
            multiply = Math.pow(multiply, 1.0 / vector.length);
        }
        return multiply;
    }

    //This method find the arithmetic  average of vector values
    public static double findArithmeticAverage(double[] vector) {
        double sum = 0;
        if (vector.length != 0) {
            sum = vector[0];
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i];
            }
            sum /= vector.length;
        }

        return sum;
    }

    //This method checks that vector values are in increasing order
    public static boolean isSortedIncreasing(double[] vector) {
        if (vector.length == 0) {
            return false;
        } else {
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }


    //This method checks that vector values are in decreasing order
    public static boolean isSortedDecreasing(double[] vector) {
        if (vector.length == 0) {
            return false;
        } else {
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] < vector[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }


    //This method checks that vector values are in an ordered form
    public static boolean isOrdered(double[] vector) {
        return (isSortedDecreasing(vector) || isSortedIncreasing(vector));
    }

    //This method finds position of the local minimum of vector values
    public static int findLocalMinPosition(double[] vector) {
        if (vector.length != 0) {
            for (int i = 1; i < vector.length - 1; i++) {
                if (vector[i - 1] > vector[i] && vector[i + 1] > vector[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    //This method finds position of the local maximum of vector values
    public static int findLocalMaxPosition(double[] vector) {
        if (vector.length != 0) {
            for (int i = 1; i < vector.length - 1; i++) {
                if (vector[i - 1] < vector[i] && vector[i + 1] < vector[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    //This method finds the first position of key value in the vector
    public static int searchLinearFirstPosition(double[] vector, double key) {
        if (vector.length != 0) {
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == key) {
                    return i;
                }
            }
        }
        return -1;
    }

    //This method finds the last position of key value in the vector
    public static int searchLinearLastPosition(double[] vector, double key) {
        if (vector.length != 0) {
            for (int i = vector.length - 1; i >= 0; i--) {
                if (vector[i] == key) {
                    return i;
                }
            }
        }
        return -1;
    }

    // This method finds the first position of key value in the sorted vector
    public static int searchBinaryFirst(double[] vector, double key) {
        return searchBinary(vector, key, 0, vector.length - 1, true);
    }

    // This method finds the last position of key value in the sorted vector
    public static int searchBinaryLast(double[] vector, double key) {
        return searchBinary(vector, key, 0, vector.length - 1, false);
    }

    // This method recursively divides vector into subvectors and search key value by binary search.
    // If the array is not sorted, the results is undefined.
    private static int searchBinary(double[] vector, double key, int left, int right, boolean order) {
        if (right < left) {
            return -1;
        }
        int middle = left + (right - left) / 2;
        if (vector[middle] == key && ((order && vector[middle - 1] != key)
                || (!order && vector[middle + 1] != key))) {
            return middle;
        }
        if (order && vector[middle] >= key) {
            return searchBinary(vector, key, left, middle - 1, order);
        }
        return searchBinary(vector, key, middle + 1, right, order);
    }

    //This method reverse all vector values
    public static double[] reverseVector(double[] vector) {
        if (vector.length != 0) {
            for (int i = 0; i < vector.length / 2; i++) {
                swaping(vector,i,vector.length - 1 - i);
            }
            return vector;
        }
        return null;
    }

    //This method sorts all vector values in increasing order by bubble sort
    public static void sortBubbleIncrease(double[] vector) {
        for (int i = 1; i < vector.length; ++i) {
            for (int j = 0; j < vector.length - i; ++j) {
                if (vector[j] > vector[j + 1]) {
                    swaping(vector,j,j+1);
                }
            }
        }
    }

    //This method sorts all vector values in Decreasing order by bubble sort
    public static void sortBubbleDecrease(double[] vector) {
        for (int i = 1; i < vector.length; ++i) {
            for (int j = 0; j < vector.length - i; ++j) {
                if (vector[j] < vector[j + 1]) {
                    swaping(vector,j,j+1);
                }
            }
        }
    }


    // This method sorts all vector values in increasing order by insertion sort
    public static void sortInsertionIncrease(double[] vector) {
        for (int i = 1; i < vector.length; ++i) {
            double tmp = vector[i];
            int j = i - 1;
            while (j >= 0 && tmp < vector[j]) {
                vector[j + 1] = vector[j];
                --j;
            }
            vector[j + 1] = tmp;
        }
    }

    // This method sorts all vector values in decreasing order by insertion sort
    public static void sortInsertionDecrease(double[] vector) {
        for (int i = 1; i < vector.length; ++i) {
            double tmp = vector[i];
            int j = i - 1;
            while (j >= 0 && tmp > vector[j]) {
                vector[j + 1] = vector[j];
                --j;
            }
            vector[j + 1] = tmp;
        }
    }

    //  This method sorts all vector values in increasing order by selection sort
    public static void sortSelectionIncrease(double[] vector) {
        for (int i = 0; i < vector.length - 1; ++i) {
            int k = i;
            for (int j = i + 1; j < vector.length; ++j) {
                if (vector[k] > vector[j]) {
                    k = j;
                }
            }
            swaping(vector,k,i);
        }
    }


    // This method sorts all vector values in increasing order by merge sort
    public static void sortMergeIncrease(double[] vector) {
        sortMerge(vector, 0, vector.length - 1, true);
    }

    // This method sorts all vector values in decreasing order by merge sort
    public static void sortMergeDecrease(double[] vector) {
        sortMerge(vector, 0, vector.length - 1, false);
    }

    private static void sortMerge(double[] vector, int left, int right, boolean order) {
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
        sortQuick(vector, 0, vector.length - 1, true);
    }


    // This method sorts all vector values in decreasing order by quick sort.
    public static void sortQuickDecrease(double[] vector) {
        sortQuick(vector, 0, vector.length - 1, false);
    }


    // This method recursively divides array into subarrays and sort them by quick sort.
    private static void sortQuick(double[] vector, int left, int right, boolean order) {
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
                swaping(vector, i, j);
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

    private static void swaping(double[] array, int firstIndex, int secondIndex) {
        double tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
}
