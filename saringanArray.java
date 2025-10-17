import java.util.Scanner;

public class saringanArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();

        int[] filter = new int[A];
        for (int i = 0; i < A; i++) {
            filter[i] = in.nextInt();
        }
        for (int j = 0; j < filter.length; j++){
            System.out.println(filter[j]);
        }
        in.close();

    }
}
