import java.util.Scanner;

public class scannerinput {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);

    float detik;
    System.out.println("Masukan detik: ");
    detik = in.nextFloat();

    detik = (detik / 3600);

    System.out.println(detik);


    in.close();
    
    }
}
