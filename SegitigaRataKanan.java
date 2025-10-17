import java.util.Scanner;
public class SegitigaRataKanan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2!=0){
            for(int i=0; i<n; i++){
                for(int k = n-i-1; k>0 ; k--){
                    if(k>0){
                        System.out.print(" ");
                    }
                    else{ }
                    }
                for(int j=1; j<(n+1)/2; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
