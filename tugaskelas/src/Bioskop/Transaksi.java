/* Nama File : Transaksi.java
 * Deskripsi : Berisi atribut dan method untuk mengelola transaksi bioskop
 */


package Bioskop;


import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;


public class Transaksi {
    /* === ATRIBUT === */
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Kasir kasir;
    private ArrayList<Tiket> daftarTiket;
    private ArrayList<Produk> daftarProduk;
    private LocalDateTime waktuTransaksi;


    /* === METODE === */
    public Transaksi(String idTransaksi, Pelanggan pelanggan, Kasir kasir) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.kasir = kasir;
        this.daftarTiket = new ArrayList<>();
        this.daftarProduk = new ArrayList<>();
        this.waktuTransaksi = LocalDateTime.now();
       
        if (pelanggan != null) {
            pelanggan.tambahTransaksi(this);
        }
    }


    /* === SELEKTOR === */
    public String getIdTransaksi() { return idTransaksi; }
    public Pelanggan getPelanggan() { return pelanggan; }
    public Kasir getKasir() { return kasir; }
    public ArrayList<Tiket> getDaftarTiket() { return daftarTiket; }
    public ArrayList<Produk> getDaftarProduk() { return daftarProduk; }


    /* === OPERATOR === */
    public void tambahTiket(Tiket t) {
        if (t != null) {
            daftarTiket.add(t);
            t.setTransaksi(this);
        }
    }


    public void tambahProduk(Produk p, int jumlah) {
        if (p != null) {
            p.kurangiStok(jumlah);
            for(int i = 0; i < jumlah; i++) {
                daftarProduk.add(p);
            }
        }
    }


    public double hitungTotalBayar() {
        double total = 0;
        for (Tiket t : daftarTiket) {
            total += t.hitungTotalHarga();
        }
        for (Produk p : daftarProduk) {
            total += p.hitungHargaAfterPajak();
        }
        return total;
    }


    public void cetakStruk() {
        Locale indo = new Locale("id", "ID");
        NumberFormat Rp = NumberFormat.getCurrencyInstance(indo);


        System.out.println("********** NOTA PEMBAYARAN **********");
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Waktu        : " + waktuTransaksi);
        System.out.println("Kasir        : " + (kasir != null ? kasir.getNama() : "-"));
        System.out.println("Pelanggan    : " + (pelanggan != null ? pelanggan.getNama() : "Guest"));
        System.out.println("-------------------------------------");
       
        if (!daftarTiket.isEmpty()) {
            System.out.println("TIKET:");
            for (Tiket t : daftarTiket) {
                System.out.println("- " + t.getFilm().getJudul() + " (" + t.getKursi().getNomorKursi() + ") : " + Rp.format(t.hitungTotalHarga()));
            }
        }


        if (!daftarProduk.isEmpty()) {
            System.out.println("PRODUK:");
            for (Produk p : daftarProduk) {
                System.out.println("- " + p.getNama() + " (" + p.getUkuran() + ") : " + Rp.format(p.hitungHargaAfterPajak()));
            }
        }


        System.out.println("-------------------------------------");
        System.out.println("TOTAL BAYAR  : " + Rp.format(hitungTotalBayar()));
        System.out.println("*************************************\n");
    }
}

