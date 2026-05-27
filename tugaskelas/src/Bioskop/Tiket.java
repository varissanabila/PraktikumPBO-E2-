/* Nama File : Tiket.java
 * Deskripsi : berisi atribut dan method dalam class Tiket
 */

package Bioskop;

public class Tiket {
    // Atribut
    private String idTiket;
    private Film film;
    private Jadwal jadwal;
    private Pelanggan pelanggan;
    private String nomorKursi;
    private double harga;

    // Konstruktor
    public Tiket() {
        this.idTiket = "";
        this.film = null;
        this.jadwal = null;
        this.pelanggan = null;
        this.nomorKursi = "";
        this.harga = 0.0;
    }

    // Konstruktor dengan parameter
    public Tiket(String idTiket, Film film, Jadwal jadwal,
                 Pelanggan pelanggan, String nomorKursi, double harga) {
        this.idTiket = idTiket;
        this.film = film;
        this.jadwal = jadwal;
        this.pelanggan = pelanggan;
        this.nomorKursi = nomorKursi;
        this.harga = harga;

        // otomatis masuk ke jadwal
        if (jadwal != null) {
            jadwal.tambahTiket(this);
        }
    }

    // Getter
    public String getIdTiket() {
        return idTiket;
    }

    public Film getFilm() {
        return film;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public double getHarga() {
        return harga;
    }

    // Setter
    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk menampilkan info
    public void printInfo() {
        System.out.println("ID Tiket: " + this.idTiket);
        System.out.println("Film: " + this.film.getJudul());
        System.out.println("Jadwal: " + this.jadwal.getTanggal() + " " +
                           this.jadwal.getWaktuTayang());
        System.out.println("Kursi: " + this.nomorKursi);
        System.out.println("Pelanggan: " + 
            (this.pelanggan != null ? this.pelanggan.getNama() : "-"));
        System.out.println("Harga: " + this.harga);
    }
}

