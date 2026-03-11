public class MataKuliah {

    private String idMatKul;
    private String nama;
    private int SKS;

    /* Konstruktor tanpa parameter */
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.SKS = 0;
    }

    /* Konstruktor dengan parameter */
    public MataKuliah(String idMatKul, String nama, int SKS) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.SKS = SKS;
    }

    /* SELEKTOR */
    public String getidMatKulMataKuliah() {
        return this.idMatKul;
    }

    public String getNamaMataKuliah() {
        return this.nama;
    }

    public int getSKSMahasiswa() {
        return this.SKS;
    }

    /* MUTATOR */
    public void setidMatKulMataKuliah(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNamaMataKuliah(String nama) {
        this.nama = nama;
    }

    public void setSKSMahasiswa(int SKS) {
        this.SKS = SKS;
    }
}