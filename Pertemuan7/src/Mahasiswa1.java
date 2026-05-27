/* NIM  : 24060124140125
   Nama : Varissa Nabila Kifli
   Tgl  : 30 April 2026
*/
public class Mahasiswa1 {
    private String nim, nama, programStudi;

    // 2c. Konstruktor tanpa parameter
    public Mahasiswa1() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // 2d. Konstruktor dengan 3 parameter
    public Mahasiswa1(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = prodi;
    }

    // 2e. Konstruktor Kloning 
    public Mahasiswa1(Mahasiswa1 m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // 2. Overloading Method setProgramStudi
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa1 m) {
        this.programStudi = m.programStudi;
    }

    public void tampilData() {
        System.out.println(nim + " | " + nama + " | " + programStudi);
    }
}
