import java.util.Scanner;

public class HitungNilaiKelas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2. Meminta input untuk jumlah kelas dan jumlah siswa
        System.out.print("Masukkan jumlah kelas: ");
        int jumlahKelas = input.nextInt();

        System.out.print("Masukkan jumlah siswa per kelas: ");
        int jumlahSiswa = input.nextInt();

        System.out.println("Daftar Nilai Siswa:");

        // 3. Outer loop untuk iterasi setiap kelas
        for (int i = 1; i <= jumlahKelas; i++) {
            System.out.println("Kelas " + i + ":");

            // Inisialisasi variabel untuk setiap kelas baru
            int totalNilai = 0;
            int nilaiTertinggi = Integer.MIN_VALUE; // Nilai awal terendah agar input pertama pasti lebih tinggi
            int nilaiTerendah = Integer.MAX_VALUE;  

            // 4. Inner loop untuk iterasi setiap siswa di dalam kelas
            for (int j = 1; j <= jumlahSiswa; j++) {
                System.out.print("Masukkan nilai siswa ke-" + j + ": ");
                int nilai = input.nextInt();

                // Menambahkan nilai ke total
                totalNilai += nilai;

                // Memeriksa dan memperbarui nilai tertinggi
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                }

                // Memeriksa dan memperbarui nilai terendah
                if (nilai < nilaiTerendah) {
                    nilaiTerendah = nilai;
                }
            }

            // 5. Menghitung nilai rata-rata
            // (double) digunakan agar hasil pembagian menjadi desimal (pecahan)
            double rerata = (double) totalNilai / jumlahSiswa;

            // 6. Mencetak hasil untuk kelas saat ini
            // %.2f digunakan untuk memformat angka menjadi 2 angka di belakang koma
            System.out.printf("- Nilai rerata = %.2f\n", rerata);
            System.out.printf("- Nilai tertinggi = %.2f\n", (double) nilaiTertinggi);
            System.out.printf("- Nilai terendah = %.2f\n", (double) nilaiTerendah);
        }
        
        // Menutup scanner setelah selesai digunakan
        input.close();
    }
}