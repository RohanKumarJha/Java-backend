import java.sql.*;

public class DemoavaPostgreConnection {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/StudentInfo";
        String userName = "postgres";
        String userPassword = "Rishabh@8448";
        Connection connection = DriverManager.getConnection(url,userName,userPassword);
        System.out.println("Connection established");


        //        Statement method to insert - risky method
        Statement statement = connection.createStatement();
        String createTableSQL = "CREATE TABLE IF NOT EXISTS student (" +
                "studentid INT PRIMARY KEY, " +
                "name VARCHAR(100), " +
                "phoneno VARCHAR(15))";

        // Execute the query
        statement.executeUpdate(createTableSQL);
        System.out.println("✅ Table 'student' created successfully");


//        String insert = "insert into student values(7,'Ajay','986789536')";
//        statement.execute(insert);
//
//        String insert2 = "insert into student values(6,'Vijay','986789536')";
//        statement.execute(insert2);
//
//        String insert3 = "insert into student values(5,'Atul','986789536')";
//        statement.execute(insert3);

//        String update = "UPDATE student SET name = 'Rohan', phoneno = '9999999999' WHERE studentid = 2";
//        statement.execute(update);
//        System.out.println("✅ Row updated successfully");

//        String delete = "delete from student where studentId = 1";
//        statement.execute(delete);

//        connection.close();
//        System.out.println("Connection Close");

//        insert
        String insert = "insert into student values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setInt(1,8);
        preparedStatement.setString(2,"Neha");
        preparedStatement.setString(3,"876543211");
        preparedStatement.executeUpdate();
    }
}
