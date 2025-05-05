package perpustakaan;

public class NonFiksi extends Buku {
    private String topik;

    public NonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Buku Non-Fiksi ---");
        System.out.println("Judul: " + getJudul() + (isDipinjam() ? " (Sedang dipinjam oleh " + getPeminjam().getNama() + (getDurasiPeminjaman() > 0 ? " selama " + getDurasiPeminjaman() + " hari)" : ")") : " (Tersedia)"));
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Topik: " + topik);
    }
}