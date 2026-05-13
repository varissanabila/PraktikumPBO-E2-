class PesertaUmum extends Peserta {

    public PesertaUmum(String nik, String nama, String email) {
        super(nik, nama, email);
    }

    @Override
    public double getDiskon() {
        return 0;
    }
}