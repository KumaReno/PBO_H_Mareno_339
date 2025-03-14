class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
    }

    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }
}

public class Modul_2_Codelab_2 {
    public static void main(String[] args) {
        RekeningBank Mareno = new RekeningBank();
        Mareno.nomorRekening = "202410370110339";
        Mareno.namaPemilik = "Mareno";
        Mareno.saldo = 700000.0;

        RekeningBank Kuma = new RekeningBank();
        Kuma.nomorRekening = "202410370110000";
        Kuma.namaPemilik = "Kuma";
        Kuma.saldo = 2000000.0;

        Mareno.tampilkanInfo();
        System.out.println();
        Kuma.tampilkanInfo();
        System.out.println();

        Mareno.setorUang(480000.0);
        Kuma.setorUang(570000.0);
        System.out.println();

        Mareno.tarikUang(1300000.0);
        Kuma.tarikUang(320000.0);
        System.out.println();

        Mareno.tampilkanInfo();
        System.out.println();
        Kuma.tampilkanInfo();
    }
}