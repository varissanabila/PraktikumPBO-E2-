import java.time.LocalDate;
import java.time.Period;



public class DosenTamu extends Dosen{
    // atribut
    private String NIDK;
     private LocalDate tanggalAkhirKontrak;

    // Konstruktor
    public DosenTamu(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok, String Fakultas, String NIDK, LocalDate tanggalAkhirKontrak){
        super(NIP, Nama, TL, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // Selektor
    public String getNIDK(){
        return NIDK;
    }

    public LocalDate getTanggalAkhirKontrak(){ 
        return tanggalAkhirKontrak; 
    }

    //Mutator
    public void setNIDK(String NIDK){
        this.NIDK=NIDK;
    }

    public void setTanggalAkhirKontrak(LocalDate t){ 
        this.tanggalAkhirKontrak = t; 
    }

    @Override
    public double getTunjangan(){
        return 0.025 * getGajiPokok();
    }

    public String getSisaKontrak(){
        Period p = Period.between(LocalDate.now(), getTanggalAkhirKontrak());
        int totalBulan = p.getYears()*12 + p.getMonths();
        return totalBulan + " bulan";
    }

    @Override
    public void printInfo(){
        super.printInfo();

        System.out.println("NIDK : " + getNIDK());
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Sisa Kontrak : " + getSisaKontrak());
        System.out.println("Tunjangan : 2.5% x " + formatRupiah(getGajiPokok())
                + " = " + formatRupiah(getTunjangan()));
    }

    
}
