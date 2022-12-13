package pacoteClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Connect {

    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbcmysql://localhost:3306/LoginhaDeEletronicos", "root", "root");
        } catch (SQLException e) {
            Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }
}
