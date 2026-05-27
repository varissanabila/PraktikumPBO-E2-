/**
 * File : PNS.java
 * deskripsi : Program untuk class PNS
 * nama : Varissa Nabila Kifli 24060124140125
 * tanggal : 25 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

//24060124140125
class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    private static final int A = 5; 

    public PNS(String nama, LocalDate tgl, String alamat, double pendapatan, String nip){
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // konstructor tanpa alamat
    public PNS(String nama, LocalDate tgl, double pendapatan, String nip){
        super(nama, tgl, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public double hitungPajak(){
        return 0.10 * pendapatan;
    }

    @Override
    public int hitungMasaKerja(){
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + A;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}