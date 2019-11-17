
package DAL;

import java.sql.*;

/**
 *
 * @author w7
 */
public class ConnectToDB {

    public static Connection getConnection() {
        Connection cnn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/shopsach?useUnicode=yes&characterEncoding=UTF-8", "root", "root");
        } catch (Exception ex) {
            System.err.println("Không kết nối được! Lỗi: " + ex.toString());
        }
        return cnn;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
