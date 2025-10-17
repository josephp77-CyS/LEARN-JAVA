public class patternA {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                if(i == 9 - j && j < 10)System.out.print("A");
                else if(j == 9 + i && j >= 10 && j != 15)System.out.print("A");
                else if(i == 6 && j >= 4 && j < 10)System.out.print(" A");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
