public class letterE {
    public static void main(String[] args) {
        for(int i = 0; i < 15; i++){ 
            for(int j = 0; j < 20; j++){ 
                
                if(j == 0) {
                    System.out.print("E ");
                }
                else if (i == 0 && j < 10){
                    System.out.print("E ");
                }
                else if (i == 7 && j < 8){
                    System.out.print("E " );
                }
                 else if (i == 14 && j < 10){
                    System.out.print("E ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}