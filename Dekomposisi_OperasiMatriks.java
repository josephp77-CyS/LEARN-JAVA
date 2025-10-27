public class Dekomposisi_OperasiMatriks {
    public static void main(String[] args) {
        int[][] matriksA = {
            {9, 7, 4},
            {8, 6, 3},
            {7, 5, 2}
        };

        int[][] matriksB = {
            {1, 4, 1},
            {2, 5, 3},
            {3, 2, 2}
        };

       
        
        System.out.println("Matriks A:");
        printMatrix(matriksA);

        System.out.println("\nMatriks B:");
        printMatrix(matriksB);

        System.out.println("\n--- Hasil Operasi Matriks ---");

        // 1. Panggil method PENJUMLAHAN MATRIK
        int[][] hasilJumlah = tambahMatriks(matriksA, matriksB);
        System.out.println("\nHasil Penjumlahan (A + B):");
        printMatrix(hasilJumlah);

        // 2. Panggil method PENGURANGAN MATRIKS
        int[][] hasilKurang = kurangMatriks(matriksA, matriksB);
        System.out.println("\nHasil Pengurangan (A - B):");
        printMatrix(hasilKurang);
        
        // 3. Panggil method PERKALIAN MATRIKS
        int[][] hasilKali = kaliMatriks(matriksA, matriksB);
        System.out.println("\nHasil Perkalian (A * B):");
        printMatrix(hasilKali);
    }

    // METHOD 1: Untuk menjumlahkan dua matriks
    public static int[][] tambahMatriks(int[][] matriks1, int[][] matriks2) {
        int baris = matriks1.length;
        int kolom = matriks1[0].length;
        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        return hasil; // Kembalikan matriks hasil penjumlahan
    }

    // METHOD 2: Untuk mengurangkan dua matriks
    public static int[][] kurangMatriks(int[][] matriks1, int[][] matriks2) {
        int baris = matriks1.length;
        int kolom = matriks1[0].length;
        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
        return hasil; // Kembalikan matriks hasil pengurangan
    }
    
    // METHOD 3: Untuk mengalikan dua matriks 
    public static int[][] kaliMatriks(int[][] matriks1, int[][] matriks2) {
        int baris1 = matriks1.length;
        int kolom1 = matriks1[0].length; // sama dengan baris2
        int kolom2 = matriks2[0].length;
        int[][] hasil = new int[baris1][kolom2];

        for (int i = 0; i < baris1; i++) { // loop baris matriks pertama
            for (int j = 0; j < kolom2; j++) { // loop kolom matriks kedua
                for (int k = 0; k < kolom1; k++) { // loop untuk mengalikan dan menjumlahkan
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        return hasil; // Kembalikan matriks hasil perkalian
    }

   
    public static void printMatrix(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}