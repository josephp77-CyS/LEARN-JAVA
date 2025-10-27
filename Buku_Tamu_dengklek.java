import java.util.Scanner;

public class Buku_Tamu_dengklek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int jumlahPengunjung = in.nextInt();
        in.nextLine(); 

        String[] namaReguler = new String[jumlahPengunjung];
        String[] namaVIP = new String[jumlahPengunjung];
        int jumlahReguler = 0;
        int jumlahVIP = 0;

        final int HARGA_REGULER = 70000;
        final int HARGA_VIP = 120000;

        for (int i = 0; i < jumlahPengunjung; i++) {
            String dataPengunjung = in.nextLine();

            // --- BAGIAN YANG DISEDERHANAKAN ---
            String kode = "";
            String nama = "";
            int indeksPemisah = 0; // Untuk menyimpan posisi tanda hubung

            // Loop 1: Mencari kode dan posisi pemisah
            for (int j = 0; j < dataPengunjung.length(); j++) {
                char karakter = dataPengunjung.charAt(j);
                if (karakter == '-') {
                    indeksPemisah = j; // Catat posisi tanda hubung
                    break; // Keluar dari loop pertama jika sudah ketemu
                }
                kode += karakter;
            }

            // Loop 2: Menyalin nama, dimulai dari setelah pemisah
            for (int j = indeksPemisah + 1; j < dataPengunjung.length(); j++) {
                nama += dataPengunjung.charAt(j);
            }
            // ------------------------------------

            // Logika klasifikasi dan penyimpanan tetap sama
            if (kode.equals("001")) {
                namaReguler[jumlahReguler] = nama;
                jumlahReguler++;
            } else if (kode.equals("010")) {
                namaVIP[jumlahVIP] = nama;
                jumlahVIP++;
            }
        }

        long totalPendapatan = ((long)jumlahReguler * HARGA_REGULER) + ((long)jumlahVIP * HARGA_VIP);

        // --- Bagian Output (tidak ada perubahan) ---
        System.out.println("============ Laporan ============");
        System.out.println("Pengunjung Reguler: " + jumlahReguler);
        for (int i = 0; i < jumlahReguler; i++) {
            System.out.println((i + 1) + ". " + namaReguler[i]);
        }
        
        System.out.println("Pengunjung VIP        : " + jumlahVIP);
        for (int i = 0; i < jumlahVIP; i++) {
            System.out.println((i + 1) + ". " + namaVIP[i]);
        }

        System.out.println("Total Pendapatan      : Rp. " + totalPendapatan);
        
        in.close();
    }
}