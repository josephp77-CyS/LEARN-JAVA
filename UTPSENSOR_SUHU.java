import java.util.Scanner;

public class UTPSENSOR_SUHU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input jumlah data
        System.out.print("Masukkan jumlah data suhu: ");
        int n = scanner.nextInt();

        // 2. Persiapan array
        int[] suhu = new int[n];

        // 3. Pembacaan Data
        System.out.println("Masukkan " + n + " data suhu:");
        for (int i = 0; i < n; i++) {
            suhu[i] = scanner.nextInt();
        }

        // 4. Inisialisasi
        int suhuMaks = suhu[0]; //MULAI DARI ELEMEN PERTAMA
        int suhuMin = suhu[0];//MULAI DARI ELEMEN PERTAMA
        double totalSuhu = suhu[0];//MULAI DARI ELEMEN PERTAMA

        // 5. Analisis data dari elemen kedua
        for (int i = 1; i < n; i++) {
            // Cek suhu maksimum
            if (suhu[i] > suhuMaks) {
                suhuMaks = suhu[i];
            }
            // Cek suhu minimum
            if (suhu[i] < suhuMin) {
                suhuMin = suhu[i];
            }
            // Akumulasi total
            totalSuhu += suhu[i];
        }

        // 6. Kalkulasi & Output
        double rataRata = totalSuhu / n;

        System.out.println("--- Hasil Analisis Sensor ---");
        System.out.println("Suhu Tertinggi: " + suhuMaks);
        System.out.println("Suhu Terendah : " + suhuMin);
        System.out.printf("Suhu Rata-rata: %.2f\n", rataRata);
        
        scanner.close();
    }
}