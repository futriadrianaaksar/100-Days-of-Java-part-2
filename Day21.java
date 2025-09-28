public class Day21 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);

        // proses tukar nilai
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sesudah ditukar: a = " + a + ", b = " + b);
    }
}
