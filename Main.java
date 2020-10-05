import java.util.Scanner;
/**
 *Hailstone pattern
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner
     Scanner input = new Scanner(System.in);
    //ask user for integer
     System.out.println("Please enter a positive integer to see the hailstone sequence");
    //declare a variablle
     int n = input.nextInt();
     //loop statement
     while (n > 1){
     if (n % 2 == 0){
       n = n/2;
       System.out.println(n);
      
      }else if (3*n + 1 > 0){
        n = n*3 + 1;
        System.out.println(n);

      }
      }
     }
}
