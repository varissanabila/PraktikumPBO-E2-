import java.util.ArrayList;

abstract class Peserta {
    protected String nik;
    protected String nama;
    protected String email;
    protected ArrayList<Registrasi> daftarPelatihan;

    // konstruktor kosong
    public Peserta() {
        this.nik = "";
        this.nama = "";
        this.email = "";
        this.daftarPelatihan = new ArrayList<>();
    }

    // konstruktor berparameter
    public Peserta(String nik, String nama, String email) {
        this.nik = nik;
        this.nama = nama;
        this.email = email;
        this.daftarPelatihan = new ArrayList<>();
    }

    // getter
    public String getNik() { return nik; }
    public String getNama() { return nama; }
    public String getEmail() { return email; }

    // setter
    public void setNik(String nik) { this.nik = nik; }
    public void setNama(String nama) { this.nama = nama; }
    public void setEmail(String email) { this.email = email; }


    // method
    public boolean tambahRegistrasi(Registrasi r)
    {
        if (daftarPelatihan.size()<3){
            daftarPelatihan.add(r);
            return true;
        }else{
            System.out.println("Maksimal 3 pelatihan");
            return false;
        }
    }

    public abstract double getDiskon();

    public void printInfo(){
        System.out.println("NIK\t= " + getNik());
        System.out.println("Nama\t= " + getNama());
        System.out.println("Email\t= " + getEmail());

        System.out.println("=== Daftar Pelatihan ===");
        for (Registrasi r : daftarPelatihan) {
            r.printInfo();
            System.out.println("-------------------");
        }
    }




}
