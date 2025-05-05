package perpustakaan;

public class Fiksi extends Buku {
    private String genre;

    public Fiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Buku Fiksi ---");
        System.out.println("Judul: " + getJudul() + (isDipinjam() ? " (Sedang dipinjam oleh " + getPeminjam().getNama() + (getDurasiPeminjaman() > 0 ? " selama " + getDurasiPeminjaman() + " hari)" : ")") : " (Tersedia)"));
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Genre: " + genre);
    }
}