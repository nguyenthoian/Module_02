package Utils;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InputWriterClient {
    public static String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\CaseStudy\\Case_Study\\src\\Data\\DataClient.csv";


    public static void writeDataClients(String[] data) {
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH, true));
            csvWriter.writeNext(data);
            csvWriter.close();
            System.out.println("Succesfully");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
