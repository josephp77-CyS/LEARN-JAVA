import java.util.Scanner;

public class LATIHANUTP_LABIRIN_ {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ukuranPapan = in.nextInt();

        char[][] papanLabirin = new char[ukuranPapan][ukuranPapan];

        for (int i = 0; i < ukuranPapan; i++) {
            for (int j = 0; j < ukuranPapan; j++) {
                papanLabirin[i][j] = '.';
            }
        }
        int mulaiBaris = in.nextInt();
        int mulaiKolom = in.nextInt();
        papanLabirin[mulaiBaris][mulaiKolom] = 'S';
        int FinishBaris = in.nextInt();
        int FinishKolom = in.nextInt();
        papanLabirin[FinishBaris][FinishKolom] = 'F';

        in.nextLine();

        String Tembok = in.nextLine();
        String[] BagianTemboknya = Tembok.split(" ");
        for (int i = 0; i < BagianTemboknya.length; i++) {
            String[] Pemisah = BagianTemboknya[i].split(",");

            int baris = Integer.parseInt(Pemisah[0]);
            int kolom = Integer.parseInt(Pemisah[1]);
            papanLabirin[baris][kolom] = 'T';
        }
        for (int i = 0; i < ukuranPapan; i++) {
            for (int j = 0; j < ukuranPapan; j++) {
                System.out.print(papanLabirin[i][j]);
            }
            System.out.println();
        }

        // ... setelah mencetak papan awal ...
        int pa = mulaiBaris, pb = mulaiKolom; // Posisi pemain (pa,pb) dimulai dari Start (ma,mb)

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            char perintah = in.next().charAt(0);

            // 1. Siapkan posisi TUJUAN, jangan ubah posisi ASLI dulu
            int next_pa = pa;
            int next_pb = pb;

            // 2. Hitung posisi tujuan berdasarkan perintah
            if (perintah == 'W') {
                next_pa--;
            } else if (perintah == 'S') {
                next_pa++;
            } else if (perintah == 'A') {
                next_pb--;
            } else if (perintah == 'D') {
                next_pb++;
            }

            // 3. Lakukan VALIDASI pada posisi tujuan
            boolean invalid = false;
            if (next_pa < 0 || next_pa >= ukuranPapan || next_pb < 0 || next_pb >= ukuranPapan) { // Cek batas
                invalid = true;
            } else if (papanLabirin[next_pa][next_pb] == 'T') { // Cek tembok
                invalid = true;
            }

            // 4. BERTINDAK berdasarkan hasil validasi
            if (invalid) {
                System.out.println("Invalid Move!");
            } else {
                // Gerakan valid! Baru kita ubah papan dan posisi asli pemain
                papanLabirin[pa][pb] = '.'; // Hapus 'S' atau 'P' yang lama
                pa = next_pa; // Update posisi asli
                pb = next_pb;
                papanLabirin[pa][pb] = 'P'; // Gambar 'P' di posisi baru
            }
        }
        // ... setelah for loop selesai ...
        if (pa == FinishBaris && pb == FinishKolom) {
            System.out.println("Selamat Kamu Berhasil Keluar!!");
        } else {
            System.out.println("Kamu terjebak dalam labirin!");
        }

    }
}
