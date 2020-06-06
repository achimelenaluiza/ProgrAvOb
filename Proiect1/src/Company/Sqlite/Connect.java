package Company.Sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
    Am folosit SQLITE pentru formarea bazei de date si DB BROWSER for SQLITE pentru a vizualiza fisierul "luiza.db".
    Clasa Connect este folosita pentru crearea conexiunii cu baza de date.
    Clasele Delete/Insert/Read/Update(Line/Table) sunt folosite pentru manevrarea bazei de date.
    Functionalitatile implementate de aceste clase, cand sunt apelate, vor fi scrise si in fisierul "Audit.csv".
*/

public class Connect {
    public static Connection connect() {
        Connection conn = null;
        String url = "jdbc:sqlite:luiza.db";
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
