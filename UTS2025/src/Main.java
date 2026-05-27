import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // =========================
        // 1. BUAT PELATIHAN
        // =========================
        PelatihanReguler pr = new PelatihanReguler(
                3, "Basic", "Kelompok",
                "R001", "Java Dasar", 20,
                "Pak Budi", 1000000
        );

        PelatihanInsidental pi = new PelatihanInsidental(
                LocalDate.of(2026, 5, 10), "Online",
                "I001", "Workshop AI", 30,
                "Bu Sari", 500000
        );


        // =========================
        // 2. BUAT PESERTA
        // =========================
        PesertaUmum p1 = new PesertaUmum(
                "3201", "Andi", "andi@email.com"
        );

        PesertaMember p2 = new PesertaMember(
                "3202", "Budi", "budi@email.com",
                "M001", LocalDate.of(2025, 1, 1)
        );


        // =========================
        // 3. BUAT REGISTRASI
        // =========================
        Registrasi r1 = new Registrasi(
                pr, p1,
                LocalDate.now(),
                LocalDate.now(),
                "Tunai"
        );

        Registrasi r2 = new Registrasi(
                pi, p2,
                LocalDate.now(),
                LocalDate.now(),
                "Non-Tunai"
        );


        // =========================
        // 4. TAMBAH KE PESERTA
        // =========================
        p1.tambahRegistrasi(r1);
        p2.tambahRegistrasi(r2);


        // =========================
        // 5. PRINT DATA
        // =========================
        System.out.println("===== DATA PESERTA UMUM =====");
        p1.printInfo();

        System.out.println("\n===== DATA PESERTA MEMBER =====");
        p2.printInfo();


        // =========================
        // 6. BONUS: TEST BATAS 3
        // =========================
        p1.tambahRegistrasi(r2);
        p1.tambahRegistrasi(r1);
        p1.tambahRegistrasi(r2); // harusnya ditolak
    }
}
