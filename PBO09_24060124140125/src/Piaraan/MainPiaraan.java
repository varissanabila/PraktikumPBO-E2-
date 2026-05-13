
// Nama File    : MainPiaraan.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 7 Mei

package Piaraan;

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan piaraan = new Piaraan();

        Kucing k1 = new Kucing("Chimmy", 4.2);
        Kucing k2 = new Kucing("Lily", 3.8);
        Anabul a1 = new Anabul("Alek", 6.5);
        Anabul a2 = new Anabul("Bobby", 1.2);

        System.out.println("getNama: " + k1.getNama());
        k1.setNama("Chimmy dekil");
        System.out.println("setNama: " + k1.getNama());
        k1.setNama("Alek rakus");

        System.out.println("getNbelm: " + piaraan.getNbelm());

        piaraan.enqueueAnabul(k1);
        piaraan.enqueueAnabul(k2);
        piaraan.enqueueAnabul(a1);
        piaraan.enqueueAnabul(a2);
        System.out.println("getNbelm setelah enqueue: " + piaraan.getNbelm());

        System.out.println("isMember Chimmy: " + piaraan.isMember(k1));

        System.out.println("getAnabul: " + piaraan.getanabul().getNama());

        System.out.println("showAnabul:");
        piaraan.showAnabul();

        System.out.println("countKucing: " + piaraan.countKucing());
        System.out.println("bobotKucing: " + piaraan.bobotKucing());

        System.out.println("showJenisAnabul:");
        piaraan.showJenisAnabul();

        System.out.println("dequeue: " + piaraan.dequeueAnabul().getNama());
        System.out.println("getNbelm setelah dequeue: " + piaraan.getNbelm());
    }
}