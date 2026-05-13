// Nama File    : MainTeman.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 7 Mei
 
public class MainTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();

        System.out.println("getNbelm: " + teman.getNbelm());

        teman.addNama("Var");
        teman.addNama("Rafa");
        teman.addNama("Melinda");
        teman.addNama("Bintang");
        teman.addNama("Var");
        System.out.println("getNbelm setelah add: " + teman.getNbelm());

        teman.showTeman();

        System.out.println("getNama(0): " + teman.getNama(0));
        System.out.println("getNama(2): " + teman.getNama(2));

        teman.setNama(1, "Rafael");
        System.out.println("setNama(1, Rafael): " + teman.getNama(1));

        System.out.println("isMember Var: " + teman.isMember("Var"));
        System.out.println("isMember Eko: " + teman.isMember("Eko"));

        System.out.println("gantiNama Melinda->Mel: " + teman.gantiNama("Melinda", "Mel"));
        System.out.println("gantiNama Eko->Ekko: " + teman.gantiNama("Eko", "Ekko"));

        System.out.println("countNama Var: " + teman.countNama("Var"));

        teman.delNama("Bintang");
        System.out.println("getNbelm setelah delNama: " + teman.getNbelm());

        teman.showTeman();
    }
}