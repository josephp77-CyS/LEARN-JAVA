import java.util.Scanner;
public class SegitigaPiramidBintang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            for(int k = n-i-1 ; k > 0 ; k--){
                System.out.print(" ");
            }
            for(int j =0; j <2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
