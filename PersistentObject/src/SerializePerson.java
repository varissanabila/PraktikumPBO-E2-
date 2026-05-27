/*
File: SerializePerson.java
Deskripsi: Program untuk serialisasi objek Person
Nama: Varissa Nabila Kifli
NIM: 24060124140125
*/

import java.io.*;

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            // Membuat aliran file output
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            
            // Menulis objek ke dalam stream 
            s.writeObject(person);
            
            System.out.println("Selesai menulis objek person"); 
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}