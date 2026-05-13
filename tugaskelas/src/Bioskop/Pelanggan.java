/* Nama File : Pelanggan.java
 * Deskripsi : Berisi atribut dan method dalam class Pelanggan
 * Tanggal   : 28 Maret 2026
 */

package Bioskop;
import java.util.ArrayList;


public class Pelanggan {
    // ATRIBUT
    private String idPelanggan;
    private String nama;
    private String noHP;
    private ArrayList<Transaksi> daftarTransaksi; 

    // KONSTRUKTOR
    public Pelanggan()
    {
        this.idPelanggan = "";
        this.nama = "";
        this.noHP = "";
        this.daftarTransaksi = new ArrayList<>();
    }

    public Pelanggan(String id, String nama, String noHP) {
        setIdPelanggan(id);
        setNama(nama);
        setNoHP(noHP);
        this.daftarTransaksi = new ArrayList<>();
    }

    // overloading
    public Pelanggan(String id, String nama) {
        this(id, nama, "-");
    }

    // SELEKTOR
    public String getIdPelanggan() 
    { 
        return idPelanggan; 
    }
    public String getNama() 
    {
         return nama;
    }
    public String getNoHP() 
    { 
        return noHP; 
    }
    public ArrayList<Transaksi> getDaftarTransaksi() 
    { 
        return daftarTransaksi; 
    }

    // MUTATOR
    public void setIdPelanggan(String id) 
    {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID tidak boleh kosong");
        }
        this.idPelanggan = id;
    }
    public void setNama(String nama)
     {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.nama = nama;
    }
    public void setNoHP(String noHP) 
    {
        if (noHP == null || !noHP.matches("\\d+")) {
            throw new IllegalArgumentException("No HP harus angka");
        }
        this.noHP = noHP;
    }

    // METHOD
    // pelanggan menambah transaksi
    public void tambahTransaksi(Transaksi t)
    {
        if (t==null){
            throw new IllegalArgumentException("Transaksi tidak boleh kosong");
        }
        daftarTransaksi.add(t);
    }
    // banyak transaksi pada pelanggan
    public int getJumlahTransaksi()
    {
        return daftarTransaksi.size();
    }
    // printinfo
     public void printInfo() {
        System.out.println("=== PELANGGAN ===");
        System.out.println("ID\t: " + idPelanggan);
        System.out.println("Nama\t: " + nama);
        System.out.println("No HP\t: " + noHP);
        System.out.println("Jumlah Transaksi\t: " + getJumlahTransaksi());
    }
    // print daftar transaksi yang sudah dilakukan pembeli
    public void printDaftarTransaksi()
    {
        System.out.println("=== TRANSAKSI PELANGGAN ===");
        System.out.println("ID\t: " + idPelanggan);
        System.out.println("Nama\t: " + nama);
        for (Transaksi t: daftarTransaksi){
            System.out.println("- " + t.getIdTransaksi());
        }
    }

    @Override
    public String toString() {
        return nama + " (" + idPelanggan + ")";
    }
}
