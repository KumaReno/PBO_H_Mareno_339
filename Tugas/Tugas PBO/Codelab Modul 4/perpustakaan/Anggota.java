package perpustakaan;

import java.util.ArrayList;
import java.util.List;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;
    private List<String> bukuDipinjam;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.bukuDipinjam = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public List<String> getBukuDipinjam() {
        return bukuDipinjam;
    }

    @Override
    public void pinjamBuku(String judulBuku) {
        if (!bukuDipinjam.contains(judulBuku)) {
            bukuDipinjam.add(judulBuku);
            System.out.println(nama + " (ID: " + idAnggota + ") meminjam buku berjudul: " + judulBuku);
        } else {
            System.out.println(nama + " (ID: " + idAnggota + ") sudah meminjam buku berjudul: " + judulBuku);
        }
    }

    public void pinjamBuku(String judulBuku, int durasiPeminjaman) {
        if (!bukuDipinjam.contains(judulBuku)) {
            bukuDipinjam.add(judulBuku);
            System.out.println(nama + " (ID: " + idAnggota + ") meminjam buku berjudul: " + judulBuku + " selama " + durasiPeminjaman + " hari.");
        } else {
            System.out.println(nama + " (ID: " + idAnggota + ") sudah meminjam buku berjudul: " + judulBuku);
        }
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        if (bukuDipinjam.contains(judulBuku)) {
            bukuDipinjam.remove(judulBuku);
            System.out.println(nama + " (ID: " + idAnggota + ") mengembalikan buku berjudul: " + judulBuku);
        } else {
            System.out.println(nama + " (ID: " + idAnggota + ") tidak sedang meminjam buku berjudul: " + judulBuku);
        }
    }
}