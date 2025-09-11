public class day5 {
    public static void main(String[] args) {
        
        byte jumlahApel = 10;
        short jumlahSiswa = 300;
        int populasiKota = 1500000;
        long jarakKeBulan = 384400000L; 

        System.out.println("Jumlah apel: " + jumlahApel);
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Populasi kota: " + populasiKota);
        System.out.println("Jarak ke bulan: " + jarakKeBulan + " meter");

        System.out.printf("Biodata Ana:\n\tApel: %d\n\tSiswa: %d\n\tPopulasi: %d\n\tJarak: %d meter\n", 
                          jumlahApel, jumlahSiswa, populasiKota, jarakKeBulan);
    }
}
