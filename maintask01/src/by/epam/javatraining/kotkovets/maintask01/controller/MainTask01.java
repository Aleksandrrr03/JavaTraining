package by.epam.javatraining.kotkovets.maintask01.controller;

import static by.epam.javatraining.kotkovets.maintask01.model.logic.VectorLogic.*;
import static by.epam.javatraining.kotkovets.maintask01.view.View.*;

public class MainTask01 {
    public static void main(String[] args) {
        double[] vector = new double[]{1.1, 1.2, 2.8, 0.1, 2.8, 0.9, 0.8};
        printMSG("Maximum value of vector = " + findMaxValue(vector) + '\n');
        printMSG("Minimum value of vector = " + findMinValue(vector) + '\n');
        printMSG("Geometric Average = " + findGeometricAverage(vector) + '\n');
        printMSG("Arithmetic Average = " + findArithmeticAverage(vector) + '\n');
        printMSG("Is sorted decreasing: " + isSortedDecreasing(vector) + '\n');
        printMSG("Is sorted increasing: " + isSortedIncreasing(vector) + '\n');
        printMSG("Local min position: " + findLocalMinPosition(vector) + '\n');
        printMSG("Local max position: " + findLocalMaxPosition(vector) + '\n');
        printMSG("Value = 2.8;" + " Linear search First Position: [" + searchLinearFirstPosition(vector, 2.8) + ']' + '\n');
        printMSG("Value = 2.8;" + " Linear search Last Position: [" + searchLinearLastPosition(vector, 2.8) + ']' + '\n');

        printMSG("Sorted vector: ");
        sortBubbleDecrease(vector);
        printVector(vector);

        printMSG("Sorted vector: ");
        sortBubbleIncrease(vector);
        printVector(vector);

        printMSG('\n'+"Value = 2.8;" + " Binary search First Position: [" + searchBinaryFirst(vector, 2.8) + ']' + '\n');
        reverseVector(vector);

        printMSG("Reversed vector: ");
        printVector(vector);

    }
}
