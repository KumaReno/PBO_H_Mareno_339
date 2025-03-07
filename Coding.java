import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        String nama;
        int umur;
        Scanner objInput = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        nama = objInput.nextLine();
        System.out.print("Masukkan umur: ");
        umur = objInput.nextInt();

        System.out.format("Nama saya %s umur %d", nama, umur);
    }
}
