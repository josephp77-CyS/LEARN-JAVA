import java.util.Scanner;

public class LATIHAN_UTP_SUDOKU {  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ukuran papan Sudoku yang benar adalah 9x9
        int[][] papanSudoku = new int[9][9];
        
        // Membaca input dengan kondisi perulangan yang benar (< 9)
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                papanSudoku[i][j] = in.nextInt();
            }
        }

        // 1. Variabel penentu (flag)
        boolean isValid = true;

        // 2. Pengecekan Baris
        for (int i = 0; i < 9; i++) {
            // Array 'seen' direset untuk setiap baris baru
            boolean[] seen = new boolean[10]; // Indeks 0 diabaikan, kita pakai 1-9
            for (int j = 0; j < 9; j++) {
                int angka = papanSudoku[i][j];

                // Cek apakah angka valid (1-9)
                if (angka < 1 || angka > 9) {
                    isValid = false;
                    break;
                }
                // Cek apakah angka sudah pernah muncul di baris ini
                if (seen[angka]) {
                    isValid = false;
                    break; // Keluar dari loop kolom
                }
                seen[angka] = true; // Tandai angka ini sudah terlihat
            }
            if (!isValid) {
                break; // Keluar dari loop baris jika sudah ditemukan tidak valid
            }
        }

        // 3. Pengecekan Kolom (Hanya jika baris masih valid)
        if (isValid) {
            for (int j = 0; j < 9; j++) {
                boolean[] seen = new boolean[10]; // Reset untuk setiap kolom baru
                for (int i = 0; i < 9; i++) {
                    int num = papanSudoku[i][j];

                    // Pengecekan rentang angka dan duplikat (sama seperti di atas)
                    if (num < 1 || num > 9) {
                        isValid = false;
                        break;
                    }
                    if (seen[num]) {
                        isValid = false;
                        break;
                    }
                    seen[num] = true;
                }
                if (!isValid) {
                    break;
                }
            }
        }

        // 4. Pengecekan Kotak 3x3 (Hanya jika baris dan kolom masih valid)
        if (isValid) {
            // Loop ini akan mengunjungi titik awal dari setiap kotak 3x3 (0,0), (0,3), (0,6), (3,0), dst.
            for (int kolomAwal = 0; kolomAwal < 9; kolomAwal += 3) {
                for (int barisAwal = 0; barisAwal < 9; barisAwal += 3) {
                    boolean[] seen = new boolean[10]; // Reset untuk setiap kotak baru
                    
                    // Loop di dalam kotak 3x3
                    for (int i = kolomAwal; i < kolomAwal + 3; i++) {
                        for (int j = barisAwal; j < barisAwal + 3; j++) {
                            int num = papanSudoku[i][j];

                            if (num < 1 || num > 9) {
                                isValid = false;
                                break;
                            }
                            if (seen[num]) {
                                isValid = false;
                                break;
                            }
                            seen[num] = true;
                            if  (!isValid) break;
                        }
                    }
                    if (!isValid) break;
                }
                if (!isValid) break;
            }
        }
        
        // 5. Cetak hasil akhir HANYA SATU KALI
        if (isValid) {
            System.out.println("VALID");
        } else {
            System.out.println("TIDAK VALID");
        }
    }
}