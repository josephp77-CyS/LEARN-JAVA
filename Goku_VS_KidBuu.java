import java.util.Scanner;

public class Goku_VS_KidBuu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Input Awal ---
        int nyawaVegeta = input.nextInt();
        int nyawaKidBuu = input.nextInt();
        int jumlahPenyumbang = input.nextInt();

        // --- Variabel untuk Kalkulasi ---
        double totalEnergiMurni = 0;
        String kontributorTerbesarNama = "";
        double energiKontribusiTerbesar = 0;
        int kelipatan5000Sebelumnya = 0;

        // --- Loop Pengumpulan Energi ---
        for (int i = 0; i < jumlahPenyumbang; i++) {
            // Jika Vegeta sudah kalah, hentikan pengumpulan energi
            if (nyawaVegeta <= 0) {
                break;
            }

            String nama = input.next();
            String planet = input.next();
            double energiAwal = input.nextDouble();

            double pengali = 0.8; // Pengali default untuk planet lain
            if (planet.equals("Bumi")) {
                pengali = 0.9;
            } else if (planet.equals("NewNamek")) {
                pengali = 1.2;
            } else if (planet.equals("KaioshinKai")) {
                pengali = 1.5;
            }

            double energiDisesuaikan = energiAwal * pengali;

            // Cek kontributor terbesar
            if (energiDisesuaikan > energiKontribusiTerbesar) {
                energiKontribusiTerbesar = energiDisesuaikan;
                kontributorTerbesarNama = nama;
            }

            // Tambahkan energi ke total
            totalEnergiMurni += energiDisesuaikan;

            // Cek apakah total energi melewati kelipatan 5000
            int kelipatan5000Sekarang = (int) (totalEnergiMurni / 5000);
            if (kelipatan5000Sekarang > kelipatan5000Sebelumnya) {
                int selisihKelipatan = kelipatan5000Sekarang - kelipatan5000Sebelumnya;
                nyawaVegeta -= (selisihKelipatan * 10);
                kelipatan5000Sebelumnya = kelipatan5000Sekarang;
            }
        }
        
        input.close();

        // Pastikan nyawa vegeta tidak negatif
        if (nyawaVegeta < 0) {
            nyawaVegeta = 0;
        }

        // --- Penentuan Status Pertarungan ---
        String status;
        if (nyawaVegeta <= 0) {
            status = "Goku Kalah!";
        } else if (totalEnergiMurni >= nyawaKidBuu * 150) {
            status = "Kid Buu Hancur!";
        } else if (totalEnergiMurni >= nyawaKidBuu * 100) {
            status = "Kid Buu Kalah!";
        } else {
            status = "Pertarungan Belum Selesai";
        }

        // --- Output Hasil ---
        System.out.printf("Total Energi Murni: %.2f\n", totalEnergiMurni);
        System.out.println("Nyawa Vegeta Tersisa: " + nyawaVegeta);
        System.out.println("Status: " + status);
        System.out.printf("Kontributor energi tertinggi : %s - %.2f\n", kontributorTerbesarNama, energiKontribusiTerbesar);
    }
}