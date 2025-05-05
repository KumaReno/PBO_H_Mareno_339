public class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        if (getNama().equals("Omen")) {
            System.out.println(getNama() + " menyerang " + target.getNama() + "!");
            int kesehatanTarget = target.getKesehatan() - 60;
            target.setKesehatan(kesehatanTarget);
            System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
        } else {
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
            int kesehatanTarget = target.getKesehatan() - 65;
            target.setKesehatan(kesehatanTarget);
            System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
        }
    }

    public void nightfall(KarakterGame target) {
        System.out.println(getNama() + " menggunakan Nightfall!");
        System.out.println("Semua musuh terkena Marked by terror trails, Deafened, dan Decayed.");
    }

    public void fromTheShadows(KarakterGame target) {
        System.out.println(getNama() + " menggunakan From the Shadows dan membelakangi " + target.getNama() + "!");
    }
}