package Company;
import Company.Sqlite.*;

import java.io.IOException;
import java.nio.CharBuffer;
/*
La rulare va scrie in continuarea fisierului Audit.csv deja existent
 */
public class JDBCmain {
    public static void main(String[] args) {
        /*
        Functie main corespunzatoare Partii3 din proiect.
        Testarea functionalitatilor oferite prin conectarea la baza de date luiza.db
        */
        InsertLine insertLine = new InsertLine();
        insertLine.insertSupplier("nou3","nou",0,0);
        insertLine.insertProperty("Golf4","25/03/2019",9000,7500);
        insertLine.insertDepartment("nou",0);
        insertLine.insertEmployee("nou",0,0,"nou");

        DeleteLine deleteLine = new DeleteLine();
        deleteLine.deleteSupplier("nou");
        deleteLine.deleteProperty("Golf4");
        deleteLine.deleteDepartment("nou");
        deleteLine.deleteEmployee("nou");

        UpdateLine updateLine = new UpdateLine();
        updateLine.updateSupplier("nou2","ceva",15,16);
        updateLine.updateProperty("Audi 2014 blue","14/03/2020",11500,12500);
        updateLine.updateDepartment("hr",3);
        updateLine.updateEmployee("Maria P",38,3600,"01/04/2012");

        ReadTable readTable = new ReadTable();
        readTable.readSupplier();
        readTable.readProperty();
        readTable.readDepartment();
        readTable.readEmployee();
    }
}
