package OperatorGenerik;

// Nama File    : Datum.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 6 May 2026

public class Datum<T> {
    private T isi;

    public void setIsi(T isibaru) { 
        this.isi = isibaru; 
    }

    public T getIsi() { 
        return this.isi; 
    }
}
