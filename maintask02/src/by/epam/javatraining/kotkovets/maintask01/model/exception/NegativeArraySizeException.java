package by.epam.javatraining.kotkovets.maintask01.model.exception;

import org.apache.log4j.Logger;

/**
 * This class describes the NegativeArraySizeException.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Exception
 * @since JDK1.0
 */


public class NegativeArraySizeException extends Exception {
    private static final Logger logger = Logger.getRootLogger();

    public NegativeArraySizeException() {
        super("NegativeArraySizeException!");
        logger.error("NegativeArraySizeException!");
    }
}
