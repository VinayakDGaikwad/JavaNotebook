
import java.util.Scanner;

/**
 *
 * @author vdg
 */
public class genericEvenodd {

    static boolean isPrime(int number){
      boolean flag = false;
      
      for(int i = 0; i < number; i++ ){
          if (i % number == 0){
              flag = true;              
              break;
          }                
      }     
      return flag;
    };
    
    
    public static void main(String args[]) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int s = sc.nextInt();
            System.out.print(isPrime(s));
        }
        
        
    }
}
