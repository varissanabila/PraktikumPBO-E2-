package GenerikLarik;

import Anabul.*;

// Nama File    : Main.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 6 May 2026
public class MainLarik {
    public static void main(String[] args) {
        Data<Anabul> listAnabul = new Data<>();

        System.out.println("=== Aplikasi Larik Generik (Anabul) ===");

        listAnabul.setIsi(1, new Anggora("Chimmy", 4.5));
        listAnabul.setIsi(2, new Kembangtelon("Alek", 3.2));
        listAnabul.setIsi(3, new Kucing("Lily", 5.0));

        System.out.println("Jumlah elemen efektif saat ini: " + listAnabul.getSize());

        System.out.println("\n--- Menampilkan Isi Larik ---");
        
        // Mengambil data posisi 1 (Anggora)
        Anabul a1 = listAnabul.getIsi(1);
        if (a1 != null) {
            System.out.println("Posisi 1: " + a1.toString());
        }

        // Mengambil data posisi 2 (Kembangtelon)
        Anabul a2 = listAnabul.getIsi(2);
        if (a2 != null) {
            System.out.println("Posisi 2: " + a2.toString());
        }

        // Mengambil data posisi 3 (Kucing Biasa)
        Anabul a3 = listAnabul.getIsi(3);
        if (a3 != null) {
            System.out.println("Posisi 3 : " + a3.getNama());
        }
        
        // Cek posisi kosong
        System.out.println("Posisi 10: " + listAnabul.getIsi(10)); 
    }
}