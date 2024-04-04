import java.util.Scanner;  // Import the Scanner class
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    Scanner what = new Scanner(System.in);
    System.out.println("01)Try againg");
    System.out.println("02)Exite");
    int x=what.nextInt();

    switch (x) {
      case 1:
        Scanner maxnumber = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter maximum range :-");
        int max=maxnumber.nextInt();
        
        Scanner minnumber = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter minimum range :-");
        int min=minnumber.nextInt();
    
        Scanner randomnumber = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter your random number :-");
        int ran=randomnumber.nextInt();
    
        Random random=new Random();
        int rand=random.nextInt(max);
      
    
        if (ran==rand) {
          System.out.println("You are Win!");
        }
        else{
          System.out.println("You are fail! ");
        }
      
        System.out.println("max is: " + max);  // Output user input
        System.out.println("min is: " + min);  // Output user input
        System.out.println("Random number is:"+ rand );
        break;
      case 2:
        System.out.println("!!!!!!!!!!!!!!!!");
        break;
      default:
        System.out.println("erro");
      }

  }
}