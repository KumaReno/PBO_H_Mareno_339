import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        int pilihan;
        Scanner Input = new Scanner(System.in);

        Admin Admin = new Admin("Admin339", "Password339");
        Mahasiswa Mahasiswa = new Mahasiswa("Mareno Ali Ibrahim", "202410370110339");

        System.out.println("Selamat datang kembali!");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Pilih jenis login :");
        pilihan = Input.nextInt();



        switch (pilihan) {
            case 1:
                System.out.println("\n=== Login Admin ===");
                Admin.displayInfo();
                break;
            case 2:
                System.out.println("\n=== Login Mahasiswa ===");
                Mahasiswa.displayInfo();
                break;
            case 3:
                System.out.println("Terima kasih!");
                Input.close();
                return;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        }
    }

