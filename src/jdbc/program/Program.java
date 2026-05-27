package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;

/**
 * File: Program.java
 * Deskripsi: Program utama simulasi CRUD
 * Nama: Varissa Nabila Kifli
 * NIM: 24060124140125
 */

public class Program {
    public static void main(String[] args) {
        MysqlMahasiswaService service = new MysqlMahasiswaService();
 
        // === CREATE: Tambahkan Nina ===
        System.out.println("=== CREATE ===");
        service.add(new Mahasiswa("Nina"));
 
        // === READ: Tampilkan semua ===
        System.out.println("=== READ ===");
        List<Mahasiswa> list = service.getAll();
        for (Mahasiswa m : list) {
            System.out.println(m.getId() + " | " + m.getNama());
        }
 
        // === UPDATE: Ganti nama Nina jadi Agus ===
        System.out.println("=== UPDATE ===");
        // Ambil mahasiswa dengan id 1
        Mahasiswa mhs = service.getById(1);
        if (mhs != null) {
            mhs.setNama("Agus");
            service.update(mhs);
        }
 
        // === DELETE: Hapus berdasarkan id ===
        System.out.println("=== DELETE ===");
        service.delete(1);
 
        // Tampilkan kondisi akhir
        System.out.println("=== KONDISI AKHIR ===");
        list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("Tabel kosong.");
        } else {
            for (Mahasiswa m : list) {
                System.out.println(m.getId() + " | " + m.getNama());
            }
        }
 
        service.closeConnection();
    }
}
