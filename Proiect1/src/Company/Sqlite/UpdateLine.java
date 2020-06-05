package Company.Sqlite;

import Company.AuditService.Audit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateLine {

    public void updateSupplier(String name, String offered, double paid, int months_of_contract) {
        //update by name

        String sql = "UPDATE supllier SET offered = ?, paid = ?, months_of_contract = ? WHERE name = ?";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(4, name);
            pstmt.setString(1, offered);
            pstmt.setDouble(2,paid);
            pstmt.setInt(3,months_of_contract);
            pstmt.executeUpdate();
            System.out.println("Line updated in table supllier");
            Audit.auditData("Updated line in table supplier");
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

    public void updateProperty(String description, String date_of_purchase, int net_worth, int investment) {
        //update by description

        String sql = "UPDATE property SET date_of_purchase = ?, net_worth = ?, investment = ? WHERE description = ?";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(4, description);
            pstmt.setString(1, date_of_purchase);
            pstmt.setInt(2, net_worth);
            pstmt.setInt(3, investment);
            pstmt.executeUpdate();
            Audit.auditData("Updated line in table property");
            System.out.println("Line updated in table property");
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
    public void updateDepartment(String title, int nr_of_employees) {
        //update by title

        String sql = "UPDATE department SET nr_of_employees = ? WHERE title = ?";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(2, title);
            pstmt.setInt(1, nr_of_employees);
            pstmt.executeUpdate();
            Audit.auditData("Updated line in table department");
            System.out.println("Line updated in table department");
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
    public void updateEmployee(String name, int age, int salary, String hire_date) {
        //update by name

        String sql = "UPDATE employee SET age = ?, salary = ?, hire_date = ? WHERE name = ?";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(4, name);
            pstmt.setInt(1, age);
            pstmt.setInt(2, salary);
            pstmt.setString(3, hire_date);
            pstmt.executeUpdate();
            Audit.auditData("Updated line in table employee");
            System.out.println("Line updated in table employee");
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
