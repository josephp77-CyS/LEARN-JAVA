public class letterX {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 20; j++){
                if(j == i*2 && j >= 0)System.out.print("X");
                else if(j == 20 - (i*2 ) && j >= 0)System.out.print("X");
                else System.out.print( " ");
            }
            System.out.println();
        }
    }
}
