import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan jumlah baris (N): ");
        int n = input.nextInt();

        // Loop luar untuk setiap baris
        for (int i = 0; i < n; i++) {

            // ==========================================================
            // BARIS TAMBAHAN: Loop untuk mencetak spasi di awal baris
            // Jumlah spasi adalah (n - i - 1)
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            // ==========================================================

            // Kode yang sama seperti sebelumnya untuk mencetak angka
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            // Pindah ke baris baru
            System.out.println();
        }
        input.close();
    }
}