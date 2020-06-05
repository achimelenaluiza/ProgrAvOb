package Company.Sqlite;

import Company.AuditService.Audit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteLine {
    public void deleteSupplier(String name) {
        String sql = "DELETE FROM supllier WHERE name = ?";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            Audit.auditData("Deleted line from table supplier");
            System.out.println("Line deleted from table supllier");
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
    public void deleteProperty(String description) {
        String sql = "DELETE FROM property WHERE description = ?";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, description);
            pstmt.executeUpdate();
            Audit.auditData("Deleted line from table property");
            System.out.println("Line deleted from table property");
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
    public void deleteDepartment(String title) {
        String sql = "DELETE FROM department WHERE title = ?";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.executeUpdate();
            Audit.auditData("Deleted line from table department");
            System.out.println("Line deleted from table department");
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
    public void deleteEmployee(String name) {
        String sql = "DELETE FROM employee WHERE name = ?";

        try (Connection conn = Connect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            Audit.auditData("Deleted line from table employee");
            System.out.println("Line deleted from table employee");
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
