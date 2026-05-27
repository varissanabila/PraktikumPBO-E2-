/*
File: MainDAO.java
Deskripsi: Main program untuk akses DAO
Nama: Varissa Nabila Kifli
NIM: 24060124140125
*/
public class MainDAO {

    public static void main(String args[]) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
            System.out.println("Data person berhasil disimpan ke database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
