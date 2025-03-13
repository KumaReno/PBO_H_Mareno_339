import java.util.Scanner;

public class Tugas_1_Modul_1 {
    public static void main(String[] args){

        int pilihan;
        String username, password, nama, nim;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilih login: ");
        System.out.print("\n1. Admin ");
        System.out.print("\n2. Mahasiswa ");
        System.out.print("\nMasukkan pilihan: ");
        pilihan = scanner.nextInt();

        scanner.nextLine(); //ini sudah saya update
        if (pilihan == 1){
            System.out.print("Masukkan username: ");
            username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            password = scanner.nextLine();

            if (username.equals("Admin339") && password.equals("Password339")){
                System.out.print("Login Admin berhasil!");
            } else {
                System.out.print("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2){
            System.out.print("Masukkan Nama: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            nim = scanner.nextLine();

            if (nama.equals("Mareno Ali Ibrahim") && nim.equals("202410370110339")){
                System.out.print("Login Mahasiswa berhasil!\n");
                System.out.print("nama: Mareno Ali Ibrahim\n");
                System.out.print("NIM: 202410370110339\n");
            } else {
                System.out.print("Login gagal! Username atau password salah.");
            }

        } else {
            System.out.print("Pilihan tidak valid.");
        }
    } //among us
}
