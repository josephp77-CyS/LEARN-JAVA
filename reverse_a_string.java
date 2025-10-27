import java.util.Scanner;

public class reverse_a_string {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Masukan Kalimat String : ");

        char[] kalimat = in.nextLine().toCharArray();

        System.out.print("Hasil reverse String : ");

        for (int i = kalimat.length - 1 ; i>=0;i--){
            System.out.print(kalimat[i]);
        }


    }
    
}
