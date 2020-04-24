package Company.AuditService;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Audit {
    private static Audit audit = new Audit("Audit.csv");
    private FileWriter csvWriter;

    private Audit(){}

    private Audit(String FileName) {
        try {
            csvWriter = new FileWriter(FileName, false);
            //false so it can overwrite the csv file when we run the program
        } catch (IOException e) {
            // FileNotFoundException: no problem (it will be created)
            e.printStackTrace();
        }
    }

    public static void auditData (String data) {
        try {
            audit.csvWriter.append(data + "," + (new Timestamp(System.currentTimeMillis())).toString());
            audit.csvWriter.append("\n");
            audit.csvWriter.flush();

        } catch (IOException e) {
            System.out.println("Error : " + data);
            e.printStackTrace();
        }
    }

}
