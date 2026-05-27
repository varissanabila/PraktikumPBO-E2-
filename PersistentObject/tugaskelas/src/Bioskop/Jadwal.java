/* Nama File : Jadwal.java
 * Deskripsi : berisi atribut dan method dalam class Jadwal
 */

package Bioskop;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Jadwal {
    /* === ATRIBUT === */
    private String idJadwal;
    private Film film;
    private Studio studio;
    private LocalDate tanggal;
    private LocalTime waktuTayang;
    private ArrayList<Tiket> daftarTiket;

    /* === METHOD === */
    // Konstruktor
    public Jadwal() {
        this.idJadwal = "";
        this.film = null;
        this.studio = null;
        this.tanggal = LocalDate.now();
        this.waktuTayang = LocalTime.now();
        this.daftarTiket = new ArrayList<>();
    }

    public Jadwal(String idJadwal, Film film, Studio studio, LocalDate tanggal, LocalTime waktuTayang) {
        setIdJadwal(idJadwal);
        setFilm(film);
        setStudio(studio);
        setTanggal(tanggal);
        setWaktuTayang(waktuTayang);
        this.daftarTiket = new ArrayList<>();
    }

    /* === SELEKTOR === */
    public String getIdJadwal() {
        return idJadwal;
    }

    public Film getFilm() {
        return film;
    }

    public Studio getStudio() {
        return studio;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public LocalTime getWaktuTayang() {
        return waktuTayang;
    }

    public ArrayList<Tiket> getDaftarTiket() {
        return daftarTiket;
    }

    // tambahan: sisa kursi
    public int getSisaKursi() {
        return studio.getKapasitas() - daftarTiket.size();
    }

    /* === MUTATOR === */
    public void setIdJadwal(String idJadwal) {
        this.idJadwal = idJadwal;
    }

    public void setFilm(Film film) {
        if (film == null) {
            throw new IllegalArgumentException("Film tidak boleh null");
        }
        this.film = film;
    }

    public void setStudio(Studio studio) {
        if (studio == null) {
            throw new IllegalArgumentException("Studio tidak boleh null");
        }
        this.studio = studio;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public void setWaktuTayang(LocalTime waktuTayang) {
        this.waktuTayang = waktuTayang;
    }

    /* === OPERATOR === */
    public void tambahTiket(Tiket t) {
        if (t == null) {
            throw new IllegalArgumentException("Tiket tidak valid");
        }

        // cek kursi penuh
        if (getSisaKursi() <= 0) {
            throw new IllegalStateException("Kursi sudah penuh");
        }

        // cek kursi sudah dipakai
        for (Tiket tiket : daftarTiket) {
            if (tiket.getKursi().getNomorKursi()
                    .equals(t.getKursi().getNomorKursi())) {
                throw new IllegalArgumentException("Kursi sudah dipesan");
            }
        }

        daftarTiket.add(t);
    }

    public void printInfo() {
        System.out.println("ID Jadwal\t: " + idJadwal);
        System.out.println("Film\t\t: " + film.getJudul());
        System.out.println("Studio\t\t: " + studio.getIdStudio());
        System.out.println("Tanggal\t\t: " + tanggal);
        System.out.println("Waktu\t\t: " + waktuTayang);
        System.out.println("Jumlah Tiket\t: " + daftarTiket.size());
        System.out.println("Sisa Kursi\t: " + getSisaKursi());
    }

    public void printInfo(boolean detail) {
        printInfo();
        if (detail) {
            System.out.println("===== LIST TIKET =====");
            for (Tiket t : daftarTiket) {
                System.out.println("- " + t.getIdTiket());
            }
        }
    }
}
