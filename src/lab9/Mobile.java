package lab9;

import java.sql.*;
import java.util.ArrayList;

public class Mobile {
    public static void main(String[] args) {
        //step1 : load driver
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Load driver successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //step2 : Create Connection
        ArrayList<Employee> myEMP = new ArrayList<Employee>();
        String SQCONN = "jdbc:sqlite:SqliteStudio.sqlite";
        try {
            Connection conn = null;
            if (conn == null) {
                System.out.println("Could not connect to database.");
            } else {
                System.out.println("Connected to database.");
            }

            //step3 : Create Statement
            Statement stmt = null;
            try {
                stmt = conn.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String sql = "select * from Mobile";
            try {
                ResultSet rs = stmt.executeQuery(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            //step4 display data from database
            System.out.println("Empoiyee Informmation");
        }
    }
}
