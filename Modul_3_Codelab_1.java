public class Modul_3_Codelab_1 {
    public static void main(String[] args) {
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 125);
        Musuh jett = new Musuh("Jett", 150);
        Pahlawan omen = new Pahlawan("Omen", 150);
        Pahlawan fade = new Pahlawan("Fade", 125);
        Musuh gekko = new Musuh("Gekko", 150);

        System.out.println("Kesehatan awal Brimstone: " + brimstone.getKesehatan());
        System.out.println("Kesehatan awal Viper: " + viper.getKesehatan());
        System.out.println("Kesehatan awal Jett: " + jett.getKesehatan());
        System.out.println("Kesehatan awal Omen: " + omen.getKesehatan());
        System.out.println("Kesehatan awal Fade: " + fade.getKesehatan());
        System.out.println("Kesehatan awal Gekko: " + gekko.getKesehatan());

        brimstone.serang(viper);
        viper.serang(fade);
        gekko.dizzy();
        fade.nightfall(omen);
        omen.fromTheShadows(viper);
        omen.serang(viper);
        jett.bladeStorm(brimstone);
    }
}