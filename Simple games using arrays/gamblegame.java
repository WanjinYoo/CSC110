/*user input (mainfuction,scanner)
computer guess(randomnum(random class),return the main back,if statement,
 if it is( you won)if not (u lost))
do while*/

import java.util.*;
 public class gamblegame {
 	public static void main(String[] args){

 		int n = userguess();
    int n2 = randomnumber();
    if (n==n2){
      System.out.println("You win!!");
         }
 		else do {
      if(n>20){
        System.out.println("I said less than 20!");
            n = userguess();
        n2 = randomnumber();
      }
      
      else {
        System.out.format("The number was a %d\n",n2);
        n = userguess();
        n2 = randomnumber();

      }
    } while (n!=n2);
    System.out.println("You win!!");
}




 public static int userguess(){
 	Scanner numbs = new Scanner(System.in);
 	System.out.println("guess the number (less than 20)");
 	int n = numbs.nextInt();
 	return n;

 }
  public static int randomnumber(){
  	Random numGener = new Random();
  	int n2 = numGener.nextInt(20);
    return n2;
  	

  }
 }