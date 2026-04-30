/* NIM  : 24060124140125
   Nama : Varissa Nabila Kifli
   Tgl  : 30 April 2026
*/
// --- Program Utama ---
public class MainSeminar {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19700101", "Pak Wowi");
        Dosen dosen2 = new Dosen("19850202", "Bu Melinda");

        Mahasiswa m1 = new Mahasiswa("24060101", "Abila");
        Mahasiswa m2 = new Mahasiswa("24060102", "Budi");
        Mahasiswa m3 = new Mahasiswa("24060103", "Citra");
        Mahasiswa m4 = new Mahasiswa("24060104", "Deni");
        Mahasiswa m5 = new Mahasiswa("24060105", "Eka");

        m1.setWali(dosen1);
        m2.setWali(dosen1);
        m3.setWali(dosen2);
        m4.setWali(dosen2);
        m5.setWali(dosen1);

        // Inisialisasi Seminar
        Seminar seminarPBO = new Seminar();

        seminarPBO.registrasi(dosen1);
        seminarPBO.registrasi(dosen2);
        seminarPBO.registrasi(m1);
        seminarPBO.registrasi(m2);
        seminarPBO.registrasi(m3);
        seminarPBO.registrasi(m4);
        seminarPBO.registrasi(m5);

        System.out.println("Jumlah Total Peserta: " + seminarPBO.countPeserta());
        System.out.println("------------------------------------");

        seminarPBO.tampilPeserta();
        System.out.println("------------------------------------");

        System.out.println("Jumlah Peserta Mahasiswa: " + seminarPBO.countMahasiswa());
        System.out.println("------------------------------------");

        System.out.println("Detail Data Mahasiswa Peserta:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}



