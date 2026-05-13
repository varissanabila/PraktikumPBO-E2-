

/* Nama File : Produk.java
 * Deskripsi : Berisi atribut dan method dalam class Produk
 * Tanggal   : 28 Maret 2026
 */

package Bioskop;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Produk implements Pajak{
    /* ATRIBUT */
    protected String id;
    protected String nama;
    protected String ukuran;
    protected double harga;
    protected int stok;
    protected int jumlahTerjual;

    /* METHOD */
    // Konstruktor tanpa parameter
    protected Produk(){
        this.id = "";
        this.nama = "";
        this.ukuran = "";
        this.harga = 0.0;
        this.stok = 0;
    }

    // Konstruktor dengan parameter
    protected Produk(String id, String nama, String ukuran, double harga, int stok){
        this.id = id;
        this.nama = nama;
        this.ukuran = ukuran;
        this.harga = harga;
        this.stok = stok;
    }

    // Selektor
    public String getID(){
        return id;
    }

    public String getNama(){
        return nama;
    }

    public String getUkuran(){
        return ukuran;
    }

    public double getHarga(){
        return harga;
    }

    public int getStok(){
        return stok;
    }

    public int getJumlahTerjual(){
        return jumlahTerjual;
    }

    // Mutator
    // ID tidak perlu pakai setter, karena ID unik, tidak boleh berubah
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setUkuran(String ukuran){
        this.ukuran = ukuran;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    // Operator
    // Method abstract hitungPajak tergantung makanan atau minuman
    public abstract double hitungPajak();

    // Method hitungHargaAfterPajak tergantung pajak makanan atau minuman
    public double hitungHargaAfterPajak(){
        return harga + hitungPajak();
    }

    // Method untuk menambah stok
    public void tambahStok(int banyak){
        stok += banyak;
    }

    // Method untuk mengurangi stok
    public void kurangiStok(int banyak){
        if (banyak > stok) {
            throw new IllegalArgumentException("Stok tidak cukup");
        }
        stok -= banyak;
        jumlahTerjual += banyak;
    }

    // Method untuk print info
    public void printInfo(){
        Locale indo = new Locale("id", "ID");
        NumberFormat Rp = NumberFormat.getCurrencyInstance(indo);

        System.out.println("ID\t: " + getID());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Ukuran\t: " + getUkuran());
        System.out.println("Harga Dasar\t: " + Rp.format(getHarga()));
        System.out.println("Harga setelah kena pajak\t: " + Rp.format(hitungHargaAfterPajak()));
        System.out.println("Stok\t: " + getStok());
    }
}

