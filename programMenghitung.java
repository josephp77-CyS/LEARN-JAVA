
public class programMenghitung {
    public static void main(String[] args) {
       int [][] matriksA = {
        {9, 7, 4},
        {8, 6, 3},
        {7, 5, 2}
       };

       int [][] matriksB = {
        {1, 4, 1},
        {2, 5, 3},
        {3, 2, 2}
       };

       int [] [] hasilJumlah = new int [3][3];
       int [] [] hasilPengurangan = new int [3][3];
       int [] [] hasilPerkalian  = new int [3][3];

       System.out.println("Matriks A:");
       printMatrix(matriksA);

       System.out.println("Matriks B:");
       printMatrix(matriksB);

       for ( int i = 0; i<3; i++){
        for ( int j = 0; j<3; j++){
            hasilJumlah[i][j] = matriksA[i][j] + matriksB[i][j];
            hasilPengurangan[i][j] = matriksA[i][j] - matriksB[i][j];
        }
       }
       for(int  i = 0; i<3; i++){
        for ( int j = 0; j<3; j++){
            for(int k = 0; k <3; k++){
                hasilPerkalian[i][j] = matriksA [i][j] * matriksB [i][j];
              
            }
        }
       }
          System.out.println("\n--- Hasil Operasi Matriks ---");

        System.out.println("\nHasil Penjumlahan (A + B):");
        printMatrix(hasilJumlah);

        System.out.println("\nHasil Pengurangan (A - B):");
        printMatrix(hasilPengurangan);

        System.out.println("\nHasil Perkalian (A * B):");
        printMatrix(hasilPerkalian);
    }
    public static void printMatrix(int [][] matriks) {
        for (int i = 0 ; i < matriks.length; i++){
            for ( int j = 0; j < matriks[i].length; j++ ){
                System.out.print(matriks[i][j]+ "\t");

            }
            System.out.println();
        }
        
    }
    
}
