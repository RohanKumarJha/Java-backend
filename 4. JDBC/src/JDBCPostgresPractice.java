import java.sql.*;

public class JDBCPostgresPractice {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/StudentDatabase";
        String userName = "postgres";
        String password = "Rishabh@8448";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);

//            Using Statement
//            Statement statement = connection.createStatement();
//            String createTableQuery = "CREATE TABLE IF NOT EXISTS student (" +
//                    "id SERIAL PRIMARY KEY," +
//                    "name VARCHAR(30) NOT NULL," +
//                    "phone_Number VARCHAR(10))";
//            statement.executeUpdate(createTableQuery);
//
//            String createStudentQuery = "INSERT INTO student(name, phone_Number)" +
//                    "VALUES('Rishabh','807629****')";
//            statement.executeUpdate(createStudentQuery);
//
//            String updateStudentQuery = "UPDATE student " +
//                    "SET phone_Number = '1234567890' " +
//                    "WHERE id = 1;";
//            statement.executeUpdate(updateStudentQuery);
//
//            String deleteStudentQuery = "DELETE FROM student WHERE id = 1;";
//            statement.executeUpdate(deleteStudentQuery);



//            Using preparedStatement
            String insertQuery = "INSERT INTO student (name, phone_number) VALUES (?, ?)";
            try (PreparedStatement ps = connection.prepareStatement(insertQuery)) {
                ps.setString(1, "Rohan");
                ps.setString(2, "9876543210");
                int rows = ps.executeUpdate();
                System.out.println("✅ Inserted: " + rows + " row(s).");
            }

            // =========================
            // 2. READ (Select all students)
            // =========================
            String selectQuery = "SELECT * FROM student";
            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery(selectQuery)) {

                System.out.println("\n📖 Student Records:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String phone = rs.getString("phone_number");
                    System.out.println("ID: " + id + ", Name: " + name + ", Phone: " + phone);
                }
            }

            // =========================
            // 3. UPDATE (Update phone number)
            // =========================
            String updateQuery = "UPDATE student SET phone_number = ? WHERE id = ?";
            try (PreparedStatement ps = connection.prepareStatement(updateQuery)) {
                ps.setString(1, "1234567890"); // new phone
                ps.setInt(2, 1);               // update student with id=1
                int rows = ps.executeUpdate();
                System.out.println("✅ Updated: " + rows + " row(s).");
            }

            // =========================
            // 4. DELETE (Remove student)
            // =========================
            String deleteQuery = "DELETE FROM student WHERE id = ?";
            try (PreparedStatement ps = connection.prepareStatement(deleteQuery)) {
                ps.setInt(1, 1);  // delete student with id=1
                int rows = ps.executeUpdate();
                System.out.println("✅ Deleted: " + rows + " row(s).");
            }

        } catch (Exception e) {
            System.out.println("Exception occurs!!!");
        }
    }
}
