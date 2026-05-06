package Anabul;

// Nama File    : Datum.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 6 May 2026

// T extends Kucing artinya T hanya boleh Kucing atau anak-anaknya
public class Datum<T extends Kucing> {
    private T isi;

    public void setIsi(T isibaru) { 
        this.isi = isibaru; 
    }

    public T getIsi() { 
        return this.isi; 
    }
}