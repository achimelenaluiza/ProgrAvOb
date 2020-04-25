package Company.AuditService;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Table {
    protected static FileWriter enableTable (String FileName, boolean append) {
        try {
            return new FileWriter(FileName, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void saveData (FileWriter csvWriter) {
        try {
            csvWriter.append("\n" + this.toCsv());
            csvWriter.flush();
        } catch (IOException e) {
            System.out.println("Error while logging: " + this);
            e.printStackTrace();
        }
    }
    protected abstract String toCsv();
}
