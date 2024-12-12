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
        
        // Loading and registering driver. This step is optional. It throws ClassNotFoundException which must be handled through try/catch. Since this is just demo, we'll duck exception.
        Class.forName("org.postgresql.Driver");

    }
}
