/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Desktop;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author I.I.IZANI
 */
public class koneksi {
    private static Connection m_connection;

    public koneksi() {

    }
    public static Connection bukakoneksi()throws SQLException {
        Connection con = null;

        String loginUser = "root";
        String loginPwd = "";
        String loginUrl = "jdbc:mysql://localhost/pkmui";

        try {
            return bukakoneksi("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/pkmui", "root", "");
        } catch (SQLException se) {
            System.err.println("Connection Failed");
            return null;
        } catch (Exception e) {
            System.err.println("Could not exception");
            return null;
        }
    }

    public static Connection bukakoneksi(String driverName, String url, String userName, String password) throws Exception {
        try {
            if (m_connection == null) {
                Class.forName(driverName);
                m_connection = DriverManager.getConnection(url, userName, password);
            }
        }catch(Exception e) {
            throw e;
        }
        return m_connection;
    }

}
