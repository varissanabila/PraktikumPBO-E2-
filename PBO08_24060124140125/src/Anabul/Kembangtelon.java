package Anabul;
// Nama File    : Kembangtelon.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 6 May 2026
public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) { 
        super(nama, bobot); 
    }

    @Override 
    public String toString() { 
        return "Kembangtelon: " + nama + " (" + bobot + " kg)"; 
    }
}
