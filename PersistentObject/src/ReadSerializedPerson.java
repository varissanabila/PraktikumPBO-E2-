/*
File: ReadSerializedPerson.java
Deskripsi: Program untuk deserialisasi objek Person
Nama: Varissa Nabila Kifli
NIM: 24060124140125
*/
import java.io.*;

public class ReadSerializedPerson {

    public static void main(String[] args) {
        Person person = null;
        try {
            // Membuka file
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);

            // Membaca bita dan melakukan casting ke tipe Person
            person = (Person) s.readObject();
            s.close();

            // Menampilkan data objek yang berhasil dipulihkan 
            System.out.println("serialized person name: " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
