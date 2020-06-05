package Company.Sqlite;

import Company.AuditService.Audit;
import java.sql.*;

public class ReadTable {

    public void readSupplier() {
        String sql = "SELECT name,offered,paid,months_of_contract FROM supllier";

        try (Connection conn = Connect.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql))
        {
            Audit.auditData("Read from table supplier");
            System.out.println("Table supllier: ");
            while (rs.next()) {
                System.out.println(rs.getString("name") + "\t" +
                        rs.getString("offered") + "\t" +
                        rs.getDouble("paid") + "\t" +
                        rs.getInt("months_of_contract"));
            }
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection to SQlite terminated");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void readProperty() {
        String sql = "SELECT description,date_of_purchase,net_worth,investment FROM property";

        try (Connection conn = Connect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql))
        {
            Audit.auditData("Read from table property");
            System.out.println("Table property: ");
            while (rs.next()) {
                System.out.println(rs.getString("description") + "\t" +
                        rs.getString("date_of_purchase") + "\t" +
                        rs.getDouble("net_worth") + "\t" +
                        rs.getInt("investment"));
            }
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection to SQlite terminated");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void readDepartment() {
        String sql = "SELECT title,nr_of_employees FROM department";

        try (Connection conn = Connect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql))
        {
            Audit.auditData("Read from table department");
            System.out.println("Table department: ");
            while (rs.next()) {
                System.out.println(rs.getString("title") + "\t" +
                        rs.getInt("nr_of_employees"));
            }
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection to SQlite terminated");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void readEmployee() {
        String sql = "SELECT name,age,salary,hire_date FROM employee";

        try (Connection conn = Connect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql))
        {
            Audit.auditData("Read from table employee");
            System.out.println("Table employee: ");
            while (rs.next()) {
                System.out.println(rs.getString("name") + "\t" +
                        rs.getInt("age") + "\t" +
                        rs.getDouble("salary") + "\t" +
                        rs.getString("hire_date"));
            }
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection to SQlite terminated");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
