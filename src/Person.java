/*
File: Person.java
Deskripsi: Person database model
Nama: Varissa Nabila Kifli
NIM: 24060124140125
*/

import java.io.Serializable;

    public class Person implements Serializable{
        private int id;
        private String name;

    /// Constructor  name
    public Person (String n){
        name = n;
    }   
    // Constructor dengan id dan name
    public Person (int i, String n){
        id = i;
        name = n;
    }
    // Getter untuk i9d
    public int getId(){
        return id;
    }
    //Getter untuk name
    public String getName(){
        return name;
    }
   
}
