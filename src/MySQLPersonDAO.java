import java.sql.*;
/*
File : MySQLPersonDAO.java
Deskripsi: implementasi PersonDAO untuk MySQL
Nama: Varissa Nabila Kifli
NIM: 24060124140125
*/
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
        // Ganti driver ke MariaDB
        Class.forName("org.mariadb.jdbc.Driver");
        
        // Ganti URL ke mariadb
        String url = "jdbc:mariadb://127.0.0.1:3306/pbo";
        
        Connection con = DriverManager.getConnection(url, "root", "Palembang19");
        String query = "INSERT INTO person (name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        s.close();
        con.close();
    }
}
