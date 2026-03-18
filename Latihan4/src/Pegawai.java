import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class Pegawai {
    /* ATRIBUT */
    protected String NIP;
    protected String Nama;
    protected LocalDate TL;
    protected LocalDate TMT;
    protected double GajiPokok;

    /* KONSTRUKTOR DENGAN PARAMETER */
    public Pegawai(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TL = TL;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    /* SELEKTOR */
    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public LocalDate getTL(){
        return TL;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public double getGajiPokok(){
        return GajiPokok;
    }

    /* MUTATOR */
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setTL(LocalDate TL){
        this.TL = TL;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    public double getTunjangan(){
        return 0;
    }

    public void printInfo(){
        System.out.println("NIP : " + getNIP());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + formatTanggal(getTL()));
        System.out.println("TMT : " + formatTanggal(getTMT()));
        System.out.println("Gaji Pokok : " + formatRupiah(getGajiPokok()));
    }

    // Format
    protected String formatTanggal(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
        return date.format(formatter);
    }

    protected String formatRupiah(double uang){
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        return nf.format(uang);
    }

    // Masa kerja
    public Period getMasaKerja(){
        return Period.between(TMT, LocalDate.now());
    }

    public String formatMasaKerja(){
        Period p = getMasaKerja();
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }


    




}
