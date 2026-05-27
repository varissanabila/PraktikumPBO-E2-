package jdbc.utilities;

import java.sql.*;

/**
 * File: MysqlUtility.java
 * Deskripsi: Utility untuk koneksi ke MariaDB
 * Nama: Varissa Nabila Kifli
 * NIM: 24060124140125
 */
public class MysqlUtility {
    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mariadb://127.0.0.1:3306/jdbc_mhs",
                "root",
                "Palembang19"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}