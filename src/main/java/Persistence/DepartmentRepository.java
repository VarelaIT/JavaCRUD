package Persistence;

import Entities.IDepartment;
import Entities.IPersistedDepartment;
import Entities.PersistedDepartment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DepartmentRepository  implements IDepartmentRepository{
    public  IPersistedDepartment save(Connection conn, IDepartment newDepartment) {
        String insertionQuery =
                "INSERT INTO departments"
                    + " ("
                        + " name,"
                        + " description"
                    + ")"
                    + " VALUES"
                    + " ("
                        + " ?,"
                        + " ?"
                    + ")";

        try {
            PreparedStatement st = conn.prepareStatement(insertionQuery);
            st.setString(1, newDepartment.getName());
            st.setString(2, newDepartment.getDescription());
            st.executeUpdate();
            st.close();
        } catch (Exception e){
            System.out.println("The Department Persistence log.\n\t" + e.getMessage());
        }

        return new PersistedDepartment(0, newDepartment.getName(), newDepartment.getDescription());

    }

    public IDepartment get(Connection conn, int id) {
        return null;
    }
}
