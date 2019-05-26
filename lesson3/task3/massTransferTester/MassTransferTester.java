package task3.massTransferTester;

import task3.massTransfer.MassTransfer;

public class MassTransferTester {

    public static void massTransferTesting() {

        int weight_kg = 12;

        System.out.println("\n***Conversion weight in kg to ton***");
        System.out.printf("Weight(kg)=%d  and weight(ton)=%f"+"\n",weight_kg, MassTransfer.conversionKgToTon(weight_kg));

        System.out.println("\n***Conversion weight in kg to gram***");
        System.out.printf("Weight(kg)=%d  and weight(gram)=%d"+"\n",weight_kg, MassTransfer.conversionKgToGram(weight_kg));

        System.out.println("\n***Conversion weight in kg to ton***");
        System.out.printf("Weight(kg)=%d  and weight(mgram)=%d"+"\n",weight_kg, MassTransfer.conversionKgToMGram(weight_kg));

    }
}
