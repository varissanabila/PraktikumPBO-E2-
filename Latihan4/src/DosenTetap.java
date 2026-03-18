import java.time.LocalDate;

public class DosenTetap extends Dosen{
    private String NIDN;
    private static final int BUP = 65;

    // konstruktor
    public DosenTetap(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok, String Fakultas, String NIDN){
        super(NIP, Nama, TL, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    // selektor
    public String getNIDN(){
        return NIDN;
    }
    
    // Mutator
    public void setNIDN(String NIDN ){
        this.NIDN=NIDN;
    }

    @Override
    public double getTunjangan(){
        int tahun = getMasaKerja().getYears();
        return 0.02 * tahun * getGajiPokok();
    }

    public LocalDate getTanggalPensiun(){
        return getTL().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        int tahun = getMasaKerja().getYears();

        System.out.println("NIDN : " + getNIDN());
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Masa Kerja : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Tunjangan : 2% x " + tahun + " x " + formatRupiah(getGajiPokok())
                + " = " + formatRupiah(getTunjangan()));
    }
}
