package by.epam.javatraining.kotkovets.maintask01.model.logic;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Edition;
import by.epam.javatraining.kotkovets.maintask01.model.unity.Library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The class describes the methods of working with files.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Edition
 * @since JDK1.0
 */


public class WorkWithFile {
    public static void writeEditionsInFile(Library library) {

        File file = new File("E:/FileWriter.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            for (int i = 0; i < library.getSize(); i++) {
                fr.write(library.getEdition(i).toString() );
                fr.write("\r\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
