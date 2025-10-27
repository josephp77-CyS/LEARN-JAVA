import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        long hasil = faktorial(n);

        System.out.print(hasil);
    }

    static long faktorial(int angka) {
        if (angka <= 1) {
            return 1;
        }

        else {

            return angka * faktorial(angka - 1);
        }
    }
}
