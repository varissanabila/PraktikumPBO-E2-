import java.time.LocalDate;

public class MainLatihan {
        public static void main(String[] args) {
        // dosen tetap
        DosenTetap dt = new DosenTetap(
                "9545647548",
                "Andi",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5000000,
                "Fakultas Sains dan Matematika",
                "78647324"
        );

        System.out.println("DATA DOSEN TETAP");
        dt.printInfo();

        System.out.println("\n---------------------------\n");

        // dosen tamu
        DosenTamu dtt = new DosenTamu(
                "123456789",
                "Owi",
                LocalDate.of(1985, 3, 10),
                LocalDate.of(2020, 1, 1),
                4000000,
                "Fakultas Hukum",
                "998877",
                LocalDate.of(2026, 12, 1)
        );

        System.out.println("===== DATA DOSEN TAMU =====");
        dtt.printInfo();

        System.out.println("\n---------------------------\n");

        // tendik
        Tendik t = new Tendik(
                "777888999",
                "Jeffrey",
                LocalDate.of(1992, 7, 20),
                LocalDate.of(2018, 3, 1),
                3000000,
                "Bisnis"
        );

        System.out.println("DATA TENDIK");
        t.printInfo();
    }
    
}
