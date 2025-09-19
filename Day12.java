import java.util.Scanner; 
public class Day12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();

        input.nextLine(); // Membersihkan buffer setelah nextDouble
        System.out.print("Masukkan hobi: ");
        String hobi = input.nextLine();

        System.out.println("\n=== BIODATA ANTONIA ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.printf("Tinggi: %.1f cm\n", tinggi);
        System.out.println("Hobi: " + hobi);

        input.close();
    }
}
