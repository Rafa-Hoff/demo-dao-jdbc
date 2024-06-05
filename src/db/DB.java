package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Manage database connection.
 */
public class DB {

    private static Connection conn = null;

    /**
     * Responsible to connect with database.
     * @return connection.
     */
    public static Connection getConection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    /**
     * Responsible to close connection with database.
     */
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    /**
     * Will read the contents of a "db.properties" file and store it in an object to be used by the program.
     * @return Object with properties.
     */
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        }
        catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    /**
     * Responsible to close the Statement Interface.
     * Obs.: Statement is an interface used for execute SQL instructions.
     * @param st Statement.
     */
    public static void closeStatment(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    /**
     * Responsible to close the ResultSet class.
     * Obs.: ResultSet is a class used for store a query SQL realized.
     * @param rs ResultSet.
     */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

}
