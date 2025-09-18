import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama kamu: ");
        String nama = input.nextLine(); // Membaca teks (String)

        // Meminta pengguna memasukkan umur
        System.out.print("Masukkan umur kamu: ");
        int umur = input.nextInt(); // Membaca angka (int)

        // Mencetak input yang diterima
        System.out.println("Halo, " + nama + "!");
        System.out.println("Umur kamu: " + umur + " tahun");
      
        input.close();
    }
}
