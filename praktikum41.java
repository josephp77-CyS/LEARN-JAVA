import java.util.Scanner;

public class praktikum41 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int KAPASITAS_MAKSIMAL = 100;
        int[] dataAngka = new int[KAPASITAS_MAKSIMAL];
        int jumlahDataSaatIni = 0;
        int pilihan;

        do {
            System.out.println("\n--- MENU UTAMA ---");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");

            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                  System.out.println("--- Input Data ---");
                    System.out.print("Berapa banyak angka yang ingin diinput? ");
                    int jumlahInput = in.nextInt();
                    if ((jumlahDataSaatIni + jumlahInput) > KAPASITAS_MAKSIMAL) {
                        System.out.println("Kapasitas tidak cukup!");
                        System.out.println("Sisa kapasitas yang tersedia: " + (KAPASITAS_MAKSIMAL - jumlahDataSaatIni));
                    } else {
                        System.out.println("Silakan masukkan " + jumlahInput + " angka:");
                        for (int i = 0; i < jumlahInput; i++) {
                            System.out.print("Masukkan Angka ke-" + (i + 1) + ": ");
                            int angka = in.nextInt();
                            dataAngka[jumlahDataSaatIni] = angka;
                            jumlahDataSaatIni++;
                        }
                    }
                    break;
                case 2:
                    System.out.println("--- Lihat Data ---");
                    if (jumlahDataSaatIni == 0){
                        System.out.println("Data masih kosong");
                    } else {
                        System.out.println("Data anda");
                        for (int i = 0; i< jumlahDataSaatIni; i++){
                            System.out.println(dataAngka[i]);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("--- Rata-rata (Average) ---");
                    if (jumlahDataSaatIni == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        double total = 0;
                        for (int i = 0; i < jumlahDataSaatIni; i++) {
                            total += dataAngka[i];
                        }
                        double rataRata = total / jumlahDataSaatIni;
                        System.out.printf("Rata-rata dari data adalah: %.2f\n", rataRata);
                    }
                    break;

                case 4:
                    System.out.println("--- Penjumlahan (Sum) ---");
                    if (jumlahDataSaatIni == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        int total = 0;
                        for (int i = 0; i < jumlahDataSaatIni; i++) {
                            total += dataAngka[i];
                        }
                        System.out.println("Total penjumlahan dari data adalah: " + total);
                    }
                    break;

                case 5:
                    System.out.println("--- Nilai Maksimal (Max) ---");
                    if (jumlahDataSaatIni == 0 ) {
                        System.out.println("Data masih kosong, tidak bisa mencari nilai maksimal.");
                    } else {
                        int nilaiMax = 0;
                        for (int i = 1; i < jumlahDataSaatIni; i++) {
                            if (dataAngka[i] > nilaiMax) {
                                nilaiMax = dataAngka[i];
                            }
                        }
                        System.out.println("Nilai maksimal dari data adalah: " + nilaiMax);
                    }
                    break;

                case 6:
                    System.out.println("--- Nilai Minimal (Min) ---");
                    if (jumlahDataSaatIni == 0) {
                        System.out.println("Data masih kosong, tidak bisa mencari nilai minimal.");
                    } else {
                        int nilaiMin = dataAngka [0];
                        for (int i = 1; i < jumlahDataSaatIni; i++) {
                            if (dataAngka[i] < nilaiMin) {
                                nilaiMin = dataAngka[i];
                            }
                        }
                        System.out.println("Nilai minimal dari data adalah: " + nilaiMin);
                    }
                    break;
                default:
                    break;
            }

        } while (pilihan > 0 && pilihan < 7);

        in.close();
    }
}