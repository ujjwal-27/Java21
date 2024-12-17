package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {
    public static void main(String[] args) throws Exception {
        // Here, java will first connect with jdbc. Then, jdbc will connect with the dbms i.e. postgresql. Finally, we'll have to mention the db name which is in the dbms.
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "postgres";

        Connection connection = DriverManager.getConnection(url, uname, pass); // creating connection
        System.out.println("connection established");

        int sid = 4;
        String name = "Payne";
        int marks = 77;

        String sql = "Update student set name = ?, marks = ? where sid = ?"; // simple sql query
        PreparedStatement statement = connection.prepareStatement(sql); // creating reference object for createStatement (a method of Connection interface)

        statement.setString(1, name);
        statement.setInt(2, marks);
        statement.setInt(3, sid);
//        statement.setInt(3, marks);

        statement.execute();

        connection.close();
        System.out.println("connection closed");
    }
}
