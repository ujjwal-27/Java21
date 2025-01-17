package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws LifecycleException {
        // Create a new instance of Tomcat
        Tomcat tomcat = new Tomcat();

        // Set the port number (default is 8080)
        tomcat.setPort(8080);

        // explicitly setting address as 'localhost'
        tomcat.getConnector().setProperty("address", "localhost");

        // Start the Tomcat server
        tomcat.start();

        // Keep the server running
        tomcat.getServer().await();
    }
}
