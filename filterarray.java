import java.util.Scanner;

public class filterarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); // 5

        int[] filter = new int[A];
        for (int i = 0; i < A; i++) {

            filter[i] = in.nextInt();
        }
        int modus = 0;
        int modusSekarang = 0;
        for (int j = 0; j < filter.length; j++) {
            int elmenSekarang = filter[j];
            int jumlahSekarang = 0;
            for (int k = 0; k < filter.length; k++) {
                if (filter[k] == elmenSekarang) {
                    jumlahSekarang++;
                }
            }
            if (jumlahSekarang > modusSekarang) {
                modusSekarang = jumlahSekarang;
                modus = elmenSekarang;
            } else if ( jumlahSekarang == modusSekarang){
                if (elmenSekarang < modus){
                    modus = elmenSekarang;
                }
            }

        }
        System.out.println("Nilai yang paling sering muncul adalah: " + modus);
        System.out.println("Jumlah kemunculan: " + modusSekarang);

        in.close();

    }
}
