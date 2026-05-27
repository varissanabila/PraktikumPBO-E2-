package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.*;

/**
 * File: MysqlMahasiswaService.java
 * Deskripsi: Service untuk operasi CRUD mahasiswa
 * Nama: Varissa Nabila Kifli
 * NIM: 24060124140125
 */

 
public class MysqlMahasiswaService {
    private Connection connection;
 
    // Constructor: buat koneksi ke database
    public MysqlMahasiswaService() {
        try {
            connection = MysqlUtility.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /** Membuat objek Mahasiswa baru (tanpa id) */
    public Mahasiswa makeMhsObject(String nama) {
        return new Mahasiswa(nama);
    }
 
    /** CREATE — Menambahkan data mahasiswa baru */
    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa(nama) VALUES ('"
                    + mhs.getNama() + "')";
            Statement s = connection.createStatement();
            s.executeUpdate(query);
            System.out.println("Mahasiswa ditambahkan: " + mhs.getNama());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /** READ — Ambil semua mahasiswa dari tabel */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM mahasiswa";
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                list.add(new Mahasiswa(id, nama));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
 
    /** READ — Ambil mahasiswa berdasarkan ID */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id = " + id;
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mhs;
    }
 
    /** UPDATE — Ubah data mahasiswa */
    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama = '"
                    + mhs.getNama() + "' WHERE id = " + mhs.getId();
            Statement s = connection.createStatement();
            s.executeUpdate(query);
            System.out.println("Mahasiswa diupdate: id=" + mhs.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /** DELETE — Hapus mahasiswa berdasarkan ID */
    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id = " + id;
            Statement s = connection.createStatement();
            s.executeUpdate(query);
            System.out.println("Mahasiswa dihapus: id=" + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /** Reset auto increment index tabel mahasiswa ke 1 */
    public void indexReset() {
        try {
            String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
            Statement s = connection.createStatement();
            s.executeUpdate(query);
            System.out.println("Index di-reset");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /** Cek apakah tabel mahasiswa kosong */
    public boolean isEmpty() {
        boolean empty = true;
        try {
            String query = "SELECT COUNT(*) AS total FROM mahasiswa";
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                empty = (rs.getInt("total") == 0);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return empty;
    }
 
    /** Tutup koneksi ke database */
    public void closeConnection() {
        try {
            MysqlUtility.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
