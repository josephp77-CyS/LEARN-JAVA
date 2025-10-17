import java.util.Scanner;

public class filterarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        int A = in.nextInt();
        
        int[] filter = new int[A];
        for (int i = 0; i < A; i++) {
            
            System.out.print("");
            filter[i] = in.nextInt(); 
        }
        int modus = 0;
        int modusSekarang = 0;
        for (int k = 0; k < filter.length; k++){
            int elmenSekarang = filter[k];
            int jumlahSekarang = 0;
            for (int l = 0; l < filter.length; l++){
                if(filter [l] == elmenSekarang){
                    jumlahSekarang++;
                }
            }
            if (jumlahSekarang > modusSekarang){
                modusSekarang = jumlahSekarang;
                modus = elmenSekarang;
            }
        }
        System.out.println("Nilai yang paling sering muncul adalah: " + modus);
        System.out.println("Jumlah kemunculan: " + modusSekarang);
        
        in.close();

    }
}
