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

        // Loading and registering driver. This step is optional. It throws ClassNotFoundException which must be handled through try/catch. Since this is just demo, we'll duck exception.
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, uname, pass); // creating connection
        System.out.println("connection established");

        Statement statement = connection.createStatement();
    }
}
