import java.time.LocalDate;

class Registrasi {
    private Pelatihan pelatihan;
    private LocalDate tglDaftar;
    private LocalDate tglBayar;
    private String metodeBayar;
    private Peserta peserta;

    public Registrasi(Pelatihan pelatihan, Peserta peserta,
                      LocalDate tglDaftar, LocalDate tglBayar,
                      String metodeBayar) {
        this.pelatihan = pelatihan;
        this.peserta = peserta;
        this.tglDaftar = tglDaftar;
        this.tglBayar = tglBayar;
        this.metodeBayar = metodeBayar;
    }

    public double getHargaAwal() {
        return pelatihan.getHarga();
    }

    public double getDiskon() {
        return peserta.getDiskon() * getHargaAwal();
    }

    public double getPajak() {
        return Pelatihan.getPajak() * getHargaAwal();
    }

    public double getHargaAkhir() {
        return getHargaAwal() - getDiskon() + getPajak();
    }

    public void printInfo() {
        System.out.println("Pelatihan\t= " + pelatihan.getNama());
        System.out.println("Harga Awal\t= " + getHargaAwal());
        System.out.println("Diskon\t= " + getDiskon());
        System.out.println("Pajak\t= " + getPajak());
        System.out.println("Harga Akhir\t= " + getHargaAkhir());
        System.out.println("Tanggal Bayar\t= " + tglBayar);
        System.out.println("Metode Bayar\t= " + metodeBayar);
    }
}
