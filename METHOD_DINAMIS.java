public class METHOD_DINAMIS {
    static int x; int y; int z; int a = 9;
    public static void main(String[] args) {
        METHOD_DINAMIS tambah = new METHOD_DINAMIS();
        tambah.penambahan();
        tambah.pengurangan();
        System.out.println(tambah.a*tambah.a);
        // System.out.println(tambah.z);
    }
    void penambahan() {
        x= 5;
        y= 9;
        z = x+y;
        System.out.println(z);
      
    }
    void pengurangan() {
        x= 5;
        y= 9;
        z = x-y;
        System.out.println(z);
    }
}
