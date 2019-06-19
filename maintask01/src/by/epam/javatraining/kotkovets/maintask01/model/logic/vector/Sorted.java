package by.epam.javatraining.kotkovets.maintask01.model.logic.vector;

import by.epam.javatraining.kotkovets.maintask01.model.MyVector;
import org.apache.log4j.Logger;

/**
 * This class contains static methods for sort MyVector.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 17.06.2019
 */

public class Sorted {

    private static final Logger logger = Logger.getRootLogger();

    //This method sorts all vector values in increasing order by bubble sort.
    public static void sortBubbleIncrease(MyVector vector) {
        if (!checkNull(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            for (int j = 0; j < vector.getSize() - i; j++) {
                if (vector.getValue(j) > vector.getValue(j + 1)) {
                    vector.swap(j, j + 1);
                }
            }
        }
    }

    //This method sorts all vector values in decreasing order by bubble sort.
    public static void sortBubbleDecrease(MyVector vector) {
        if (!checkNull(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            for (int j = 0; j < vector.getSize() - i; j++) {
                if (vector.getValue(j) < vector.getValue(j + 1)) {
                    vector.swap(j, j + 1);
                }
            }
        }
    }

    //This method Sorts all vector values in increasing order by insertion sort.
    public static void sortInsertionIncrease(MyVector vector) {
        if (!checkNull(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            double buf = vector.getValue(i);
            int j = i - 1;
            while (j >= 0 && buf < vector.getValue(j)) {
                vector.addValue(j + 1, vector.getValue(j));
                --j;
            }
            vector.addValue(j + 1, buf);
        }
    }

    //This method sorts all vector values in decreasing order by insertion sort.
    public static void sortInsertionDecrease(MyVector vector) {
        if (!checkNull(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            double buf = vector.getValue(i);
            int j = i - 1;
            while (j >= 0 && buf > vector.getValue(j)) {
                vector.addValue(j + 1, vector.getValue(j));
                --j;
            }
            vector.addValue(j + 1, buf);
        }
    }

    //This method sorts all vector values in decreasing order by selection sort.
    public static void sortSelectionDecrease(MyVector vector) {
        if (!checkNull(vector)) {
            return;
        }
        for (int i = 0; i < vector.getSize() - 1; i++) {
            int k = i;
            for (int j = i + 1; j < vector.getSize(); j++) {
                if (vector.getValue(k) < vector.getValue(j)) {
                    k = j;
                }
            }
            vector.swap(k, i);
        }
    }

    //This method sorts all vector values in increasing order by selection sort.
    public static void sortSelectionIncrease(MyVector vector) {
        if (!checkNull(vector)) {
            return;
        }
        for (int i = 0; i < vector.getSize() - 1; i++) {
            int k = i;
            for (int j = i + 1; j < vector.getSize(); j++) {
                if (vector.getValue(k) > vector.getValue(j)) {
                    k = j;
                }
            }
            vector.swap(k, i);
        }
    }

    //This method sorts all vector values in increasing order by merge sort.
    public static void sortMergeIncrease(MyVector vector) {
        if (checkNull(vector)) {
            sortMerge(vector, 0, vector.getSize() - 1, true);
        }
    }

    //This method sorts all vector values in decreasing order by merge sort.
    public static void sortMergeDecrease(MyVector vector) {
        if (checkNull(vector)) {
            sortMerge(vector, 0, vector.getSize() - 1, false);
        }
    }

    //This method  recursively divides vector into subvectors and sort them by merge sort.
    private static void sortMerge(MyVector vector, int left, int right, boolean order) {
        if (right <= left) {
            return;
        }
        int middle = left + (right - left) / 2;
        sortMerge(vector, left, middle, order);
        sortMerge(vector, middle + 1, right, order);

        MyVector tmp = new MyVector(vector.getSize());

        for (int k = left; k <= right; k++) {
            tmp.add(vector.getValue(k));
        }
        for (int i = left, j = middle + 1, k = left; k <= right; k++) {
            if (i > middle) {
                vector.addValue(k, tmp.getValue(j++ - left));
            } else if (j > right) {
                vector.addValue(k, tmp.getValue(i++ - left));
            } else if ((order && tmp.getValue(j - left) < tmp.getValue(i - left))
                    || (!order && tmp.getValue(j - left) > tmp.getValue(i - left))) {
                vector.addValue(k, tmp.getValue(j++ - left));
            } else {
                vector.addValue(k, tmp.getValue(i++ - left));
            }
        }
    }


    // This method sorts all vector values in increasing order by quick sort.
    public static void sortQuickIncrease(MyVector vector) {
        if (checkNull(vector)) {
            sortQuick(vector, 0, vector.getSize() - 1, true);
        }
    }


    // This method Sorts all vector values in decreasing order by quick sort.
    public static void sortQuickDecrease(MyVector vector) {
        if (checkNull(vector)) {
            sortQuick(vector, 0, vector.getSize() - 1, false);
        }
    }

     //This method recursively divides vector into subvectors and sort them by quick sort.
    private static void sortQuick(MyVector vector, int left, int right, boolean order) {
        if (left >= right) {
            return;
        }
        int i = left, j = right;
        int average = i - (i - j) / 2;
        while (i < j) {
            while (i < average && ((order && vector.getValue(i) <= vector.getValue(average))
                    || (!order && vector.getValue(i) >= vector.getValue(average)))) {
                i++;
            }
            while (j > average && ((order && vector.getValue(j) >= vector.getValue(average))
                    || (!order && vector.getValue(j) <= vector.getValue(average)))) {
                j--;
            }
            if (i < j) {
                vector.swap(i, j);
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

    // This method checks if the reference is null.
    private static boolean checkNull(MyVector vector) {
        if (vector == null) {
            logger.warn("NullPointer");
            return false;
        }
        return true;
    }
}
