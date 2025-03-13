import java.time.LocalDate;
import java.util.Scanner;

public class Codelab1_Modul1 {
    public static void main(String[] args){
        String nama, kelamin;
        int tahun;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan jenis kelamin: ");
        kelamin = scanner.nextLine();
        System.out.print("Masukkan tahun lahir: ");
        tahun = scanner.nextInt();
        
        int now = LocalDate.now().getYear();
        int umur = now - tahun;

        System.out.print("Data Diri:\n");
        System.out.printf("Nama         : %s \n", nama);
        if (kelamin.equalsIgnoreCase("L")){
            System.out.print("Jenis kelamin: Laki-laki\n");
        } else {
            System.out.print("jenis kelamin: Perempuan\n");
        }
        System.out.printf("Umur         : %d \n", umur);

        scanner.close();

    }
}
