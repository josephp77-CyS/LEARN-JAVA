import java.util.Scanner;

public class Menjumlahkan_Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        long sum = 0;

        int n = in.nextInt();


        for (; n !=0; n/=10){
            sum += n %10;
        }
        System.out.println("Penjumlahan Digit : " + sum);
    }
    
}
