package Anabul;
// Nama File    : Kucing.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 6 May 2026

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() { 
        return bobot; 
    }
}
