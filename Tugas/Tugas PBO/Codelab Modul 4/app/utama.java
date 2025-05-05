package app;

import perpustakaan.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class utama {
    private static List<Buku> daftarBuku = new ArrayList<>();
    private static List<Anggota> daftarAnggota = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        daftarBuku.add(new Fiksi("Laut Bercerita", "Leila Salikha Chudori", "Novel"));
        daftarBuku.add(new Fiksi("The Fragrant Blooms With Dignity", "Saka Mikami", "Manga"));
        daftarBuku.add(new NonFiksi("Sains Modern", "Stephen Hawking", "Fisika"));
        daftarAnggota.add(new Anggota("Kaoruko Waguri", "A149"));
        daftarAnggota.add(new Anggota("Rintarou Tsmugi", "A190"));

        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\n--- Sistem Manajemen Perpustakaan ---");
            System.out.println("Buku yang tersedia dan dipinjam:");
            tampilkanDaftarBuku();
            System.out.println("\nOpsi:");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahAnggota();
                    break;
                case 2:
                    pinjamBuku();
                    break;
                case 3:
                    kembalikanBuku();
                    break;
                case 4:
                    berjalan = false;
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }

    private static void tampilkanDaftarBuku() {
        for (Buku buku : daftarBuku) {
            buku.displayInfo();
        }
    }

    private static void tambahAnggota() {
        System.out.println("\n--- Tambah Anggota ---");
        System.out.print("Masukkan nama anggota: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan ID anggota: ");
        String id = scanner.nextLine();
        daftarAnggota.add(new Anggota(nama, id));
        System.out.println("Anggota " + nama + " berhasil ditambahkan dengan ID " + id + ".");
    }

    private static void pinjamBuku() {
        System.out.println("\n--- Pinjam Buku ---");
        System.out.print("Masukkan nama peminjam: ");
        String namaPeminjam = scanner.nextLine();
        Anggota anggotaPeminjam = cariAnggota(namaPeminjam);
        if (anggotaPeminjam == null) {
            System.out.println("Anggota dengan nama " + namaPeminjam + " tidak ditemukan.");
            return;
        }
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String judulBuku = scanner.nextLine();
        Buku bukuDipinjam = cariBuku(judulBuku);
        if (bukuDipinjam == null) {
            System.out.println("Buku dengan judul " + judulBuku + " tidak ditemukan.");
            return;
        }
        if (!bukuDipinjam.isDipinjam()) {
            System.out.print("Masukkan durasi peminjaman (hari): ");
            int durasi = scanner.nextInt();
            scanner.nextLine();
            bukuDipinjam.setDipinjam(true);
            bukuDipinjam.setPeminjam(anggotaPeminjam);
            bukuDipinjam.setDurasiPeminjaman(durasi);
            anggotaPeminjam.pinjamBuku(judulBuku, durasi);
            System.out.println("Buku " + judulBuku + " berhasil dipinjam oleh " + namaPeminjam + " selama " + durasi + " hari.");
        } else {
            System.out.println("Buku " + judulBuku + " sedang dipinjam oleh " + bukuDipinjam.getPeminjam().getNama() + ".");
        }
    }

    private static void kembalikanBuku() {
        System.out.println("\n--- Kembalikan Buku ---");
        System.out.print("Masukkan nama pengembali: ");
        String namaPengembali = scanner.nextLine();
        Anggota anggotaPengembali = cariAnggota(namaPengembali);
        if (anggotaPengembali == null) {
            System.out.println("Anggota dengan nama " + namaPengembali + " tidak ditemukan.");
            return;
        }
        System.out.print("Masukkan judul buku yang dikembalikan: ");
        String judulBuku = scanner.nextLine();
        Buku bukuKembali = cariBuku(judulBuku);
        if (bukuKembali == null) {
            System.out.println("Buku dengan judul " + judulBuku + " tidak ditemukan.");
            return;
        }
        if (bukuKembali.isDipinjam() && bukuKembali.getPeminjam() == anggotaPengembali) {
            bukuKembali.setDipinjam(false);
            bukuKembali.setPeminjam(null);
            bukuKembali.setDurasiPeminjaman(0);
            anggotaPengembali.kembalikanBuku(judulBuku);
            System.out.println("Buku " + judulBuku + " berhasil dikembalikan oleh " + namaPengembali + ".");
        } else if (!bukuKembali.isDipinjam()) {
            System.out.println("Buku " + judulBuku + " sedang tidak dipinjam.");
        } else {
            System.out.println("Buku " + judulBuku + " dipinjam oleh anggota lain.");
        }
    }

    private static Anggota cariAnggota(String nama) {
        for (Anggota anggota : daftarAnggota) {
            if (anggota.getNama().equalsIgnoreCase(nama)) {
                return anggota;
            }
        }
        return null;
    }

    private static Buku cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }
}