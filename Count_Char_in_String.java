import java.util.Scanner;

public class Count_Char_in_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int karakter = 0;
        int angka = 0;
        int space = 0;
        int other = 0;
        String kalimat = in.nextLine();

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == ' ') {
                space++;
            } else if (kalimat.charAt(i) == 'a' ||
                    kalimat.charAt(i) == 'b' ||
                    kalimat.charAt(i) == 'c' ||
                    kalimat.charAt(i) == 'd' ||
                    kalimat.charAt(i) == 'e' ||
                    kalimat.charAt(i) == 'f' ||
                    kalimat.charAt(i) == 'g' ||
                    kalimat.charAt(i) == 'h' ||
                    kalimat.charAt(i) == 'i' ||
                    kalimat.charAt(i) == 'j' ||
                    kalimat.charAt(i) == 'k' ||
                    kalimat.charAt(i) == 'l' ||
                    kalimat.charAt(i) == 'm' ||
                    kalimat.charAt(i) == 'n' ||
                    kalimat.charAt(i) == 'o' ||
                    kalimat.charAt(i) == 'p' ||
                    kalimat.charAt(i) == 'q' ||
                    kalimat.charAt(i) == 'r' ||
                    kalimat.charAt(i) == 's' ||
                    kalimat.charAt(i) == 't' ||
                    kalimat.charAt(i) == 'u' ||
                    kalimat.charAt(i) == 'v' ||
                    kalimat.charAt(i) == 'w' ||
                    kalimat.charAt(i) == 'x' ||
                    kalimat.charAt(i) == 'y' ||
                    kalimat.charAt(i) == 'z' ||
                    kalimat.charAt(i) == 'A' ||
                    kalimat.charAt(i) == 'B' ||
                    kalimat.charAt(i) == 'C' ||
                    kalimat.charAt(i) == 'D' ||
                    kalimat.charAt(i) == 'E' ||
                    kalimat.charAt(i) == 'F' ||
                    kalimat.charAt(i) == 'G' ||
                    kalimat.charAt(i) == 'H' ||
                    kalimat.charAt(i) == 'I' ||
                    kalimat.charAt(i) == 'J' ||
                    kalimat.charAt(i) == 'K' ||
                    kalimat.charAt(i) == 'L' ||
                    kalimat.charAt(i) == 'M' ||
                    kalimat.charAt(i) == 'N' ||
                    kalimat.charAt(i) == 'O' ||
                    kalimat.charAt(i) == 'P' ||
                    kalimat.charAt(i) == 'Q' ||
                    kalimat.charAt(i) == 'R' ||
                    kalimat.charAt(i) == 'S' ||
                    kalimat.charAt(i) == 'T' ||
                    kalimat.charAt(i) == 'U' ||
                    kalimat.charAt(i) == 'V' ||
                    kalimat.charAt(i) == 'W' ||
                    kalimat.charAt(i) == 'X' ||
                    kalimat.charAt(i) == 'Y' ||
                    kalimat.charAt(i) == 'Z') {
                karakter++;
            } else if (kalimat.charAt(i) == '1' ||
                    kalimat.charAt(i) == '2' ||
                    kalimat.charAt(i) == '3' ||
                    kalimat.charAt(i) == '4' ||
                    kalimat.charAt(i) == '5' ||
                    kalimat.charAt(i) == '6' ||
                    kalimat.charAt(i) == '7' ||
                    kalimat.charAt(i) == '8' ||
                    kalimat.charAt(i) == '9' ||
                    kalimat.charAt(i) == '0') {
                angka++;
            } else {
                other++;
            }
        }

        System.out.println("The string is : " + kalimat);
        System.out.println("letter : " + karakter);
        System.out.println("space : " + space);
        System.out.println("number : " + angka);
        System.out.println("other : " + other);
    }
}