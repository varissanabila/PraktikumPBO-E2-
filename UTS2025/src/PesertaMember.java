import java.time.LocalDate;

class PesertaMember extends Peserta {
    private String noMember;
    private LocalDate tanggalGabung;
    private static double diskon = 0.1; // 10%

    public PesertaMember(String nik, String nama, String email,
                         String noMember, LocalDate tanggalGabung) {
        super(nik, nama, email);
        this.noMember = noMember;
        this.tanggalGabung = tanggalGabung;
    }

    public static void setDiskon(double d) {
        diskon = d;
    }

    public static double getDiskonMember() {
        return diskon;
    }

    @Override
    public double getDiskon() {
        return diskon;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("No Member\t= " + noMember);
        System.out.println("Tanggal Gabung\t= " + tanggalGabung);
    }
}
