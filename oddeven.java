
import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
            if (a % 2 == 0) {
                System.out.println("Even");
                if (b % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Odd");
                if (b % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
        } else {
            System.out.println("Odd");
            if (a % 2 == 0) {
                System.out.println("Even");
                if (b % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Odd");
                if (b % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
        }
        in.close();
    }
}
