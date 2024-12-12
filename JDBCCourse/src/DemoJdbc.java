import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args)  {
        /*
         * Import package
         * Load and register driver (jar file)
         * Create connection
         * Create statement
         * Execute statement
         * Process the result
         * Close connection
         */
        
        Class.forName("org.postgresql.Driver");

    }
}
