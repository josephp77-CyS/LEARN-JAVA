public class dikelas {
    static int a = 100; // kita perlu menambah static agar menjadi global identifier
    public static void main (String [] args){
        int hasil1 = penjumlahan(15, 20);
        int hasil2 = pengurangan (15, 20);
        int hasil3 = perkalian(15, 20);
        double hasil4 = pembagian (15, 20);
        double hasil5 = pembagian(50, 10) + perkalian(5, 4) - penjumlahan(15, 17);
        System.out.println(hasil1 + "\n" + hasil2 + "\n" + hasil3 + "\n" + hasil4 +"\n" + hasil5 + "\n");
        System.out.println(a); // Cannot make a static reference to the non-static field 

    }
    static int penjumlahan(int a, int b){ // yang ada di dalam kurung adalah lokal identifier
        System.out.println("a+ = " + a); // nilai a yang ada di method penjumlahan adalah local variabel
                                        // dimana ketika kita panggil di method tersebut maka menang yang local variabel.
        int x = a + b;
        return x;
    }
    static int pengurangan(int c, int d){
        int y = c - d;
        return y;
    }
    static int perkalian(int e, int f){
        int z = e * f;
        return z;
    }
    static double pembagian(double g, double h){
        double i;
        i = g/h;
        return i;
    }        
}
