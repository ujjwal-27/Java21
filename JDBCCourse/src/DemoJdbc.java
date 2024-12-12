import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        /*
         * Import package
         * Load and register driver (jar file)
         * Create connection
         * Create statement
         * Execute statement
         * Process the result
         * Close connection
         */

        // Here, java will first connect with jdbc. Then, jdbc will connect with the dbms i.e. postgresql. Finally, we'll have to mention the db name which is in the dbms.
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "postgres";

        Connection connection = DriverManager.getConnection(url, uname, pass); // creating connection
        System.out.println("connection established");

        String sql = "Select * from student"; // simple sql query
        Statement statement = connection.createStatement(); // creating reference object for createStatement (a method of Connection interface)
        ResultSet rs = statement.executeQuery(sql); // method executeQuery() returns data of type ResultSet

        /*
         * Basically, rs.next() gives us next row or checks if there is next row available or not. Likewise, it points to the next row.
         * Based on type of data that the column holds, 'get' method is used
         */
        while (rs.next()) {
            System.out.print(rs.getInt("sid") + " - ");
            System.out.print(rs.getString("name") + " - ");
            System.out.println(rs.getInt("marks"));
        }

        connection.close();
        System.out.println("connection closed");
    }
}
