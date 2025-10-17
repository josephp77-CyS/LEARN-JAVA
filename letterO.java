public class letterO {
    public static void main(String[] args) {
        
    
    for(int i = 0; i < 11; i++){ 
            for(int j = 0; j < 11; j++){ 
                
                if(i == 0 &&  j == 6 ) {
                    System.out.print("O");
                }
                else if (i == 4 - j && j < 11  ){
                    System.out.print("O");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
