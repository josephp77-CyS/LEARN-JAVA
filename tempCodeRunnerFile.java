
import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        
        if (n %2 ==0){
            System.out.print("Even");
        }else if(n%2!=0) {
            System.out.print("Odd");
              }
        else if (b %2 ==0 ){
            System.out.print("Even");
        }else if(b%2!=0) {
            System.out.print("Odd");}
        else if (a %2 ==0){
            System.out.print("Even");
        }else if(a%2!=0) {
            System.out.print("Odd"); }
        else{
    }}
}