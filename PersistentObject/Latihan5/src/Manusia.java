/**
 * File : Manusia.java
 * deskripsi : Class Abstract Manusia
 * nama : Varissa Nabila Kifli 24060124140125
 * tanggal : 25 Maret 2026
 */

import java.time.LocalDate;

abstract class Manusia {
    // Atribut
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Konstruktor
    public Manusia(String nama, LocalDate tgl, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selektor
    public String getnama(){
        return nama;
    }
    public LocalDate gettgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }
    public String getalamat(){
        return alamat;
    }
    public double getpendapatan(){
        return pendapatan;
    }
    public static int getCounterMns(){
        return counterMns;
    }

    //Mutator
    public void setnama(String nama){
        this.nama=nama;
    }
    public void settgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja=tgl_mulai_kerja;
    }
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
    public void setpendapatan(double pendapatan){
        this.pendapatan=pendapatan;
    }

    //cetakInfo
    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    //hitung masa kerja
    public abstract int hitungMasaKerja();
    }


