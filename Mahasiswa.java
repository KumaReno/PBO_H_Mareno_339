import java.util.Scanner;

public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void displayInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String inputNama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String inputNim = scanner.nextLine();

        if (inputNama.equalsIgnoreCase(super.getNama()) && inputNim.equals(super.getNim())) {
            System.out.println("Login Mahasiswa berhasil!");
            System.out.println("Nama Mahasiswa: " + super.getNama());
            System.out.println("NIM Mahasiswa: " + super.getNim());
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}