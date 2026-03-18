import java.time.LocalDate;

public class Tendik extends Pegawai {
    //atribut
    private String Bidang;
    private static final int BUP = 55;

    //Konstruktor
    public Tendik(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok, String Bidang){
        super(NIP, Nama, TL, TMT, GajiPokok);
        this.Bidang = Bidang;

    }

    // Selektor
    public String getBidang(){
        return Bidang;
    }

    //Mutator
    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

        @Override
    public double getTunjangan(){
        int tahun = getMasaKerja().getYears();
        return 0.01 * tahun * getGajiPokok();
    }

    public LocalDate getTanggalPensiun(){
        return getTL().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        int tahun = getMasaKerja().getYears();

        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + getBidang());
        System.out.println("Masa Kerja : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Tunjangan : 1% x " + tahun + " x " + formatRupiah(getGajiPokok())
                + " = " + formatRupiah(getTunjangan()));
    }
    
}
