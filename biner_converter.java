import java.util.Scanner;

public class biner_converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bilanganDesimal, hasilBagi;
        int [] angkaBiner = new int[100];

        bilanganDesimal = in.nextInt();

        hasilBagi = bilanganDesimal;
        int i = 1;
        for (; hasilBagi != 0; hasilBagi/=2){
            angkaBiner[i++]= hasilBagi %2;

        }
        System.out.print("Angka Binernya adalah : ");
        for (int j = i -1 ; j>0; j--){
            System.out.print(angkaBiner[j]);
        }

        

        
    }
}
