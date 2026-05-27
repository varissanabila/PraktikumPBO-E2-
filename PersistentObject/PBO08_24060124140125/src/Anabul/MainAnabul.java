package Anabul;

// Nama File    : Main.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 6 May 2026

public class MainAnabul {
    public static void main(String[] args) {
        // Ini BOLEH karena Anggora keturunan Kucing
        Datum<Anggora> d1 = new Datum<>();
        d1.setIsi(new Anggora("Snowy", 4.2));
        System.out.println(d1.getIsi().toString());

        // Ini BOLEH karena Kembangtelon keturunan Kucing
        Datum<Kembangtelon> d2 = new Datum<>();
        d2.setIsi(new Kembangtelon("Belang", 3.5));
        System.out.println(d2.getIsi().toString());

        /*
        Datum<Anabul> d3 = new Datum<>(); 
        */
    }
}
