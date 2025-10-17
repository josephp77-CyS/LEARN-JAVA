public class charAt {
    public static void main(String[] args) {
        // 1. Membuat sebuah array of String
        String[] daftarBuah = {"Apel", "Pisang", "Ceri", "Durian"};

        // --- PENGGUNAAN 1: Mengambil karakter dari satu elemen spesifik ---
        System.out.println("--- Mengambil karakter dari satu elemen ---");
        // Mengambil elemen pertama dari array ("Apel")
        String buahPertama = daftarBuah[0]; 
        
        // Mengambil karakter pertama (indeks 0) dari string "Apel"
        char hurufAwal = buahPertama.charAt(0); // Hasilnya adalah 'A'

        System.out.println("Elemen pertama array: " + buahPertama);
        System.out.println("Huruf pertama dari elemen tersebut adalah: " + hurufAwal);
        System.out.println("====================================================\n");


        // --- PENGGUNAAN 2: Menggunakan loop untuk setiap elemen array ---
        System.out.println("--- Mengambil huruf pertama dari setiap elemen ---");
        // Loop akan berjalan untuk setiap elemen dalam array daftarBuah
        for (int i = 0; i < daftarBuah.length; i++) {
            // Mengambil huruf pertama (indeks 0) dari setiap buah
            char karakterPertama = daftarBuah[i].charAt(0);
            
            // Mencetak hasilnya
            System.out.println("Kata: " + daftarBuah[i] + ", Huruf pertamanya: " + karakterPertama);
        }
    }
}