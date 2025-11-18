package out.usecase;

import java.util.Scanner;

public class StringWrapper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Kalimat = in.nextLine();

        int countWords = Kalimat.split("\\s").length;
        System.out.println(countWords);

        System.out.println(Kalimat.replaceAll("[aiueoAIUEO]", "O"));
        in.close();
    }

}
