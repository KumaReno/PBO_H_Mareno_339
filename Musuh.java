public class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");
        int kesehatanTarget = target.getKesehatan() - 90;
        target.setKesehatan(kesehatanTarget);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }

    public void dizzy() {
        System.out.println(getNama() + " menggunakan Dizzy!");
        System.out.println("Semua Pahlawan terkena flash!");
    }

    public void bladeStorm(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Blade Storm!");
        int kesehatanTarget = target.getKesehatan() - 150;
        target.setKesehatan(kesehatanTarget);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}