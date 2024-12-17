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

        String sql = "Delete from student where sid = ?"; // simple sql query
        PreparedStatement statement = connection.prepareStatement(sql); // creating reference object for createStatement (a method of Connection interface)
        
        statement.setInt(1, sid);

        statement.execute();

        connection.close();
        System.out.println("connection closed");
    }
}
