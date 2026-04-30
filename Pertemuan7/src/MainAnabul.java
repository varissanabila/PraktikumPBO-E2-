// Main Program
/* NIM  : 24060124140125
   Nama : Varissa Nabila Kifli
   Tgl  : 30 April 2026
*/
public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] daftarAnabul = {new Kucing(), new Anjing(), new Burung()};

        System.out.println("=== Simulasi Bunyi dan Gerak Anabul ===");
        for (Anabul a : daftarAnabul) {
            a.suara();
            a.gerak();
            System.out.println("--------------------");
        }
    }
}
