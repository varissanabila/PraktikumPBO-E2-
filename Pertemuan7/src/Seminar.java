/* NIM  : 24060124140125
   Nama : Varissa Nabila Kifli
   Tgl  : 30 April 2026
*/

abstract class Civitasakademika {
    protected String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getNomor();
}

class Dosen extends Civitasakademika {
    private String nip;

    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}

class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenWali; 

    public Mahasiswa(String nim, String nama) {
        super(nama);
        this.nim = nim;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    public void tampilDataMahasiswa() {
        String namaWali = (dosenWali != null) ? dosenWali.getNama() : "Tidak ada";
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Dosen Wali: " + namaWali);
    }
}

class Seminar {
    private Civitasakademika[] pesertas; 
    private int banyakpeserta;

    public Seminar() {
        this.pesertas = new Civitasakademika[100];
        this.banyakpeserta = 0;
    }

    public void registrasi(Civitasakademika pesertaBaru) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = pesertaBaru; 
            banyakpeserta++;
        } else {
            System.out.println("Seminar sudah penuh!");
        }
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". Nomor: " + pesertas[i].getNomor() + " | Nama: " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
