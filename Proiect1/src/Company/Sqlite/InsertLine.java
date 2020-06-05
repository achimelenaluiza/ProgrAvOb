package Company.Sqlite;

import Company.AuditService.Audit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertLine {

    public void insertSupplier(String name, String offered, double paid, int months_of_contract) {
        String sql = "INSERT INTO supllier(name,offered,paid,months_of_contract) VALUES(?,?,?,?)";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, offered);
            pstmt.setDouble(3,paid);
            pstmt.setInt(4,months_of_contract);
            pstmt.executeUpdate();
            Audit.auditData("Inserted line in table supplier");
            System.out.println("Line inserted in table supllier");
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

    public void insertProperty(String description, String date_of_purchase, int net_worth, int investment) {
        String sql = "INSERT INTO property(description,date_of_purchase,net_worth,investment) VALUES(?,?,?,?)";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, description);
            pstmt.setString(2, date_of_purchase);
            pstmt.setInt(3, net_worth);
            pstmt.setInt(4, investment);
            pstmt.executeUpdate();
            Audit.auditData("Inserted line in table property");
            System.out.println("Line inserted in table property");
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
    public void insertDepartment(String title, int nr_of_employees) {
        String sql = "INSERT INTO department(title, nr_of_employees) VALUES(?,?)";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setInt(2, nr_of_employees);
            pstmt.executeUpdate();
            Audit.auditData("Inserted line in table department");
            System.out.println("Line inserted in table department");
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
    public void insertEmployee(String name, int age, int salary, String hire_date) {
        String sql = "INSERT INTO employee(name,age,salary,hire_date) VALUES(?,?,?,?)";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, salary);
            pstmt.setString(4, hire_date);
            pstmt.executeUpdate();
            Audit.auditData("Inserted line in table employee");
            System.out.println("Line inserted in table employee");
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
