class Hewan {
    String nama;
    String jenis;
    String suara;

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
    }
}

public class Modul_2_Codelab_1 {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        hewan1.nama = "Kucing";
        hewan1.jenis = "Mamalia";
        hewan1.suara = "Nyann~~";

        Hewan hewan2 = new Hewan();
        hewan2.nama = "Anjing";
        hewan2.jenis = "Mamalia";
        hewan2.suara = "Pinjem 10 juta dong, bulan depan kubalikin";

        hewan1.tampilkanInfo();
        System.out.print("\n");
        hewan2.tampilkanInfo();
    }
}