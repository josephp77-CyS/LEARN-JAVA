import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("");
        } else {

            int a = 0;
            int b = 1;

            for (int i = 0; i <= n; i++) {
                System.out.print(a + " ");

                int angkaBerikutnya = a + b;

                a = b;
                b = angkaBerikutnya;

            }
            System.out.println();
        }

        input.close();
    }
}