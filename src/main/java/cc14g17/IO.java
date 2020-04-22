/*
* @ description
* IO Helper class for Reading and writing in code defects
 */
package cc14g17;

import java.io.*;
import java.sql.*;
import java.util.logging.Logger;


public class IO {

    //Constants to be able to connect to a database if required
    private static String dbUrl = "";
    private static String dbUsername = "";
    private static String dbPassword = "";

    //Constructor
    public static final Logger logger = Logger.getLogger("CWE_Testcases");

    // Methods
    // Static methods are methods we want toe expose to other classes
    // without making an instance, usually used for utility methods such as below
    public static void printString(String string) {
        System.out.println(string);
    }

    public static void printLine(String line) {
        System.out.println(line);
    }

    public static void printInt(int intIn) {
        printLine(String.format("%02d", intIn));
    }

    public static void printDouble(double doubleIn) {
        printLine(String.format("%02f", doubleIn));
    }

    // Method used for getting a database connection for use in e.g. SQL injection
    public static Connection getDBConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }
}
