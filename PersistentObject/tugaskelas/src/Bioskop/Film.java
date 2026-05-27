/* Nama File : Film.java
 * Deskripsi : Berisi atribut dan method dalam class Film
 * Tanggal   : 28 Maret 2026
 */

package Bioskop;

public class Film {
    // ATRIBUT
    private String idFilm;
    private String judul;
    private int durasi;
    private String genre;

    //KONSTRUKTOR TANPA PARAMETER
    public Film()
    {
        this.idFilm = "";
        this.judul = "";
        this.durasi = 0;
        this.genre = "";
    }

    // KONSTRUKTOR DENGAN PARAMETER
    public Film(String idFilm, String judul, int durasi, String genre)
    {
        setIdFilm(idFilm);
        setJudul(judul);
        setDurasi(durasi);
        setGenre(genre);
    }

    // SELEKTOR
    public String getIdFilm()
    {
        return idFilm;
    }
    public String getJudul()
    {
        return judul;
    }
    public int getDurasi()
    {
        return durasi;
    }
    public String getGenre()
    {
        return genre;
    }

    //MUTATOR
    public void setIdFilm(String idFilm)
    {
        if (idFilm == null || idFilm.isEmpty()){
            throw new IllegalArgumentException("Id Film tidak boleh kosong atau null");
        }
        this.idFilm = idFilm;
    }
    public void setJudul(String judul)
    {
        if (judul == null || judul.isEmpty()){
            throw new IllegalArgumentException("Judl tidak boleh kosong atau null");
        }
        this.judul = judul;
    }
    public void setDurasi(int durasi)
    {
        if (durasi<= 0){
            throw new IllegalArgumentException("Durasi harus lebih dari 0");
        }
        this.durasi = durasi;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    //METHOD
    public void printInfo()
    {
        System.out.println("== FILM ==");
        System.out.println("ID\t: " + idFilm);
        System.out.println("Judul\t: " + judul);
        System.out.println("Durasi\t: " + durasi + " menit");
        System.out.println("Genre\t: " + genre);
    }

    @Override
    public String toString()
    {
        return judul + " (" + durasi + " menit)";
    }
    
}
