package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // This message is displayed in console everytime the web page loaded/refreshed
        System.out.println("In service");

        // Renders html tags in client
        resp.setContentType("text/html");

        // Initialize variable 'out' with getWriter method
        PrintWriter out = resp.getWriter();

        // Display message/string in client
        out.println("<h2>Hello World!</h2>");
    }
}
