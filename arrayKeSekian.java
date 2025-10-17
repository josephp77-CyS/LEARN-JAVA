import java.util.Scanner;
public class arrayKeSekian {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        int n = in.nextInt();
        int x = in.nextInt();


    
        String [] arrayn = new String[n];     
            for (int i = 0; i < arrayn.length; i++) {
                arrayn[i] = in.next();
            }

            System.out.println(arrayn[x-1]);
        }
        
    }
    
