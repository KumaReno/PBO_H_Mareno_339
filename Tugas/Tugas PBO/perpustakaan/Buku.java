package perpustakaan;

public abstract class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private Anggota peminjam;
    private int durasiPeminjaman;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
        this.peminjam = null;
        this.durasiPeminjaman = 0;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public Anggota getPeminjam() {
        return peminjam;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }

    public void setDurasiPeminjaman(int durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public abstract void displayInfo();
}