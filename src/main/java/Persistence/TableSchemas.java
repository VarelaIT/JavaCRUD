package Persistence;

import java.sql.Connection;
import java.sql.Statement;

public class TableSchemas {
    public static void createDepartmentTable(Connection conn) {
        String creationQuery =
                "CREATE TABLE"
                        + " IF NOT EXISTS"
                        + " departments"
                        + "("
                        + " id SERIAL PRIMARY KEY,"
                        + " name VARCHAR(64) UNIQUE NOT NULL,"
                        + " description VARCHAR(128)"
                        + ")";

        try {
            Statement st = conn.createStatement();
            st.executeUpdate(creationQuery);
            st.close();
        } catch (Exception e){
            System.out.println("The Department Persistence log.\n\t" + e.getMessage());
        }
    }

    public static void createTestDepartmentTable(Connection conn) {
        String creationQuery =
            "CREATE TABLE"
            + " IF NOT EXISTS"
                + " test_departments"
            + "("
                + " id SERIAL PRIMARY KEY,"
                + " name VARCHAR(64) UNIQUE NOT NULL,"
                + " description VARCHAR(128)"
            + ")";

        try {
            Statement st = conn.createStatement();
            st.executeUpdate(creationQuery);
            st.close();
        } catch (Exception e){
            System.out.println("The Department Persistence log.\n\t" + e.getMessage());
        }
    }
}
