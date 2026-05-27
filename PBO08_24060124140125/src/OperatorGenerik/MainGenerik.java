package OperatorGenerik;

import Anabul.*; 

// Nama File    : Main.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 6 May 2026
public class MainGenerik {
    public static void main(String[] args) {
        OperatorGenerik op = new OperatorGenerik();

        // --- Tukar Sesama Integer ---
        Datum<Integer> intA = new Datum<>();
        intA.setIsi(3);
        Datum<Integer> intB = new Datum<>();
        intB.setIsi(6);
        
        System.out.println("Integer Awal: a=" + intA.getIsi() + ", b=" + intB.getIsi());
        op.Tukar(intA, intB);
        System.out.println("Integer Sesudah Tukar: a=" + intA.getIsi() + ", b=" + intB.getIsi());

        // --- Tukar Sesama String ---
        Datum<String> strA = new Datum<>();
        strA.setIsi("Kucing");
        Datum<String> strB = new Datum<>();
        strB.setIsi("Anjing");

        System.out.println("\nString Awal: a=" + strA.getIsi() + ", b=" + strB.getIsi());
        op.Tukar(strA, strB);
        System.out.println("String Sesudah Tukar: a=" + strA.getIsi() + ", b=" + strB.getIsi());

        // --- Tukar Sesama Keluarga Anabul ---
        Datum<Anabul> anabulA = new Datum<>();
        anabulA.setIsi(new Kucing("Chimmy", 4.0));
        Datum<Anabul> anabulB = new Datum<>();
        anabulB.setIsi(new Anggora("Alek", 5.2));

        System.out.println("\nAnabul Awal: a=" + anabulA.getIsi().getNama() + ", b=" + anabulB.getIsi().getNama());
        op.Tukar(anabulA, anabulB);
        System.out.println("Anabul Sesudah Tukar: a=" + anabulA.getIsi().getNama() + ", b=" + anabulB.getIsi().getNama());


        System.out.println("\n=== 3c. Aplikasi Fungsi Bobot2 ===");
        
        Kucing kucing1 = new Anggora("Lily", 4.0);
        Kucing kucing2 = new Kembangtelon("Bobby", 3.5);
        
        double total = op.Bobot2(kucing1, kucing2);
        System.out.println("Bobot " + kucing1.getNama() + " (" + kucing1.getBobot() + " kg) + " +
                           kucing2.getNama() + " (" + kucing2.getBobot() + " kg) = " + total + " kg");
    }
}