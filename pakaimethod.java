import java.util.Scanner;

public class pakaimethod {

    public static void main(String[] args) {

        int hasil = penjumlahan(20, 30);
        System.out.println("Hasil penjumlahan   = " + hasil);
        int hasil1 = pengurangan(20, 30);
        System.out.println("Hasil pengurangan   = " + hasil1);
        int hasil2 = perkalian(20, 30);
        System.out.println("Hasil perkalian     = " + hasil2);
        int hasil3 = pembagian(20, 2);
        System.out.println("Hasil pembagian     = " + hasil3);

        int hasilTotal = hasil + hasil1 + hasil2 + hasil3;
        System.out.println("Total nya = " + hasilTotal);

    }

    static int penjumlahan(int a, int b) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan a = ");
        a = in.nextInt();
        System.out.print("Masukan b = ");
        b = in.nextInt();
        int c = a + b;
        return c;
    }

    static int pengurangan(int a, int b) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan a = ");
        a = in.nextInt();
        System.out.print("Masukan b = ");
        b = in.nextInt();
        int c = a - b;
        return c;
    }

    static int perkalian(int a, int b) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan a = ");
        a = in.nextInt();
        System.out.print("Masukan b = ");
        b = in.nextInt();
        int c = a * b;
        return c;
    }

    static int pembagian(int a, int b) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan a = ");
        a = in.nextInt();
        System.out.print("Masukan b = ");
        b = in.nextInt();
        int c = a / b;
        return c;
    }

}