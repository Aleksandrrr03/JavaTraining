package by.epam.javatraining.kotkovets.maintask01.model.logic.vector;

import by.epam.javatraining.kotkovets.maintask01.model.MyVector;
import org.apache.log4j.Logger;

/**
 * This class contains static methods for work with class MyVector.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 17.06.2019
 */

public class VectorLogic {

    private static final Logger logger = Logger.getRootLogger();

    //This method finds the maximum value of the vector
    public static double findMaxValue(MyVector vector) {
        double maxValue = Double.MIN_VALUE;
        if (checkNull(vector)) {
            for (int i = 0; i < vector.getSize(); i++) {
                if (maxValue < vector.getValue(i)) {
                    maxValue = vector.getValue(i);
                }
            }
        }
        return maxValue;
    }

    //This method finds the minimum value of the vector
    public static double findMinValue(MyVector vector) {
        double minValue = Double.MAX_VALUE;
        if (checkNull(vector)) {
            for (int i = 0; i < vector.getSize(); i++) {
                if (minValue > vector.getValue(i)) {
                    minValue = vector.getValue(i);
                }
            }
        }
        return minValue;
    }


    // This method calculates the arithmetic average of vector values.
    public static double findArithmeticAverage(MyVector vector) {
        double sum = Double.NaN;
        if (checkNull(vector)) {
            if (vector.getSize() > 0) {
                sum = vector.getValue(0);
                for (int i = 1; i < vector.getSize(); i++) {
                    sum += vector.getValue(i);
                }
                sum /= vector.getSize();
            }
        }
        return sum;
    }

    //This method find the geometric average of vector values
    public static double findGeometricAverage(MyVector vector) {
        double multiply = Double.NaN;
        if (checkNull(vector)) {
            if (vector.getSize() > 0) {
                multiply = vector.getValue(0);
                for (int i = 1; i < vector.getSize(); i++) {
                    multiply *= vector.getValue(i);
                }
                multiply = Math.pow(multiply, 1.0 / vector.getSize());
            }
        }
        return multiply;
    }


    // This method checks that vector values are in decreasing order.
    public static boolean isDecreasing(MyVector vector) {
        if (!checkNull(vector) || vector.getSize() == 0) {
            return false;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            if (vector.getValue(i - 1) < vector.getValue(i)) {
                return false;
            }
        }
        return true;
    }

    // This method checks that vector values are in increasing order.
    public static boolean isIncreasing(MyVector vector) {
        if (!checkNull(vector) || vector.getSize() == 0) {
            return false;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            if (vector.getValue(i - 1) > vector.getValue(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOrdered(MyVector vector) {
        return checkNull(vector) && vector.getSize() != 0 && (isDecreasing(vector) || isIncreasing(vector));
    }


    //This method finds position of the first local minimum of vector values.
    public static int findFirstLocalMinPosition(MyVector vector) {
        if (checkNull(vector)) {
            for (int i = 1; i < vector.getSize() - 1; i++) {
                if (vector.getValue(i) < vector.getValue(i - 1)
                        && vector.getValue(i) < vector.getValue(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }


    //This method finds position of the last local minimum of vector values.
    public static int findLastLocalMinPosition(MyVector vector) {
        if (checkNull(vector)) {
            for (int i = vector.getSize() - 1; i > 0; i--) {
                if (vector.getValue(i) < vector.getValue(i - 1)
                        && vector.getValue(i) < vector.getValue(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }

    //This method  finds position of the first local maximum of vector values.
    public static int findFirstLocalMaxPosition(MyVector vector) {
        if (checkNull(vector)) {
            for (int i = 1; i < vector.getSize() - 1; i++) {
                if (vector.getValue(i) > vector.getValue(i - 1)
                        && vector.getValue(i) > vector.getValue(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }


    //This method finds position of the last local maximum of vector values.

    public static int findLastLocalMaxPosition(MyVector vector) {
        if (checkNull(vector)) {
            for (int i = vector.getSize() - 1; i > 0; i--) {
                if (vector.getValue(i) > vector.getValue(i - 1)
                            && vector.getValue(i) > vector.getValue(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }



    //This method  reverses all vector values.
    public static void reverse(MyVector vector) {
        if (checkNull(vector)) {
            for (int i = 0, j = vector.getSize() - 1; i < j; i++, j--) {
                vector.swap(j, i);
            }
        }
    }

    private static boolean checkNull(MyVector vector) {
        if (vector == null) {
            logger.warn("NullPointer");
            return false;
        }
        return true;
    }

}
