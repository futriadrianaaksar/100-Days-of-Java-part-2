public class day10 {

    public static void main(String[] args) {
        String a = "Anaj";//bukan final variabel(constanta) karena bisa di update.
        a = "Hai"; // ini updatenya

        final String b = "jons";// ini final variabel yang dimana nilainya tidak bisa diubah.
        System.out.printf("%s\n", a);
        System.out.printf("%s\n", b);
    }
}
