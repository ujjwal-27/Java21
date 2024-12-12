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

        String sql = "Select name from student where sid = 1"; // simple sql query
        Statement statement = connection.createStatement(); // creating reference object for createStatement (a method of Connection interface)
        ResultSet rs = statement.executeQuery(sql); // method executeQuery() returns data of type ResultSet
        rs.next(); // initially the pointer will be right above the data we are fetching. Using next() method will point to the exact data which we are trying to fetch.

        String name = rs.getString("name"); // fetching name column
        System.out.println("Name of the student is " + name);

        connection.close();
        System.out.println("connection closed");
    }
}
