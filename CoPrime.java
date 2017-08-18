
import java.util.*;
 

public class CoPrime {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in); 
        int a = in.nextInt(); 
        int b = in.nextInt(); 
        int max; 
        
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        int count = 0; 
        for (int i=2; i<=max; i++) { 
            if (a % i == 0 && b % i==0) {
                count++; 
            }
        }
        if (count == 0) { 
        System.out.println("Coprime");
            
        } else {
            System.out.println("Not coprime"); 
        }
    }
}
