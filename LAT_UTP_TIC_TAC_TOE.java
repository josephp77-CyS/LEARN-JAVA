import java.util.Scanner;

public class LAT_UTP_TIC_TAC_TOE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] kotak = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                kotak[i][j] = in.nextInt();

            }
        } // MEMINTA INPUT DARI USER

        int pemenang = -1; // KONDISI PEMENANG BELUM DITEMUKAN 

        for (int l = 0; l < 3; l++) {
            if (kotak[l][0] == kotak[l][1] && kotak[l][1] == kotak[l][2]) {
                pemenang = kotak[l][0];
                break;
            }
        } // UNTUK PENGECEKAN TIAP BARIS VERTIKAL
        if (pemenang == -1) {
            for (int k = 0; k < 3; k++) {
                if (kotak[0][k] == kotak[1][k] && kotak[1][k] == kotak[2][k]) {
                    pemenang = kotak[0][k];
                    break;
                }
            }
        } // UNTUK PENGECEKAN TIAP BARIS HORIZONTAL 
        if (pemenang != -1) { // KETIKA PEMENANG SUDAH DITEMUKAN 
            System.out.println("Pemain " + pemenang + " menang!");
        } else {
            System.out.println("Draw!");
        }
    }
}
