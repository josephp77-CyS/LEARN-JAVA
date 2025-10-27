import java.util.Scanner;

public class DOCTORSTRANGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input & Persiapan
        System.out.print("Masukkan jumlah tingkat energi: ");
        int n = scanner.nextInt();
        int[] energi = new int[n];

        // 2. Pembacaan Data
        System.out.println("Masukkan " + n + " tingkat energi (acak):");
        for (int i = 0; i < n; i++) {
            energi[i] = scanner.nextInt();
        }

        // 3. Proses Sorting (Bubble Sort)
        // Loop luar untuk repetisi
        for (int i = 0; i < n - 1; i++) {
            // Loop dalam untuk perbandingan dan penukaran
            for (int j = 0; j < n - i - 1; j++) {
                // Jika elemen kiri lebih besar dari kanan, tukar
                if (energi[j] > energi[j + 1]) {
                    int temp = energi[j];
                    energi[j] = energi[j + 1];
                    energi[j + 1] = temp;
                }
            }
        }

        // 4. Output
        System.out.println("\n--- Energi Kekacauan Telah Stabil (Terurut) ---");
        for (int i = 0; i < n; i++) {
            System.out.print(energi[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}