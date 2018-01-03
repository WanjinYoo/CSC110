/*
* For assignment: V00832396 : WanjinYoo
PURPOSE: to play the chuck a luck game
INPUT: Scanner scanner, to collect input from the user for the
the bet amount and if they want to continue playing
Random randomObject, to simulate dice roll
OUTPUT: promptstoaskuserforbetandupdatesofbankroll
*/
import java.util.*;
import java.util.Scanner;

public class ChukALuck{
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);
Random rand = new Random(System.currentTimeMillis()); 
play(scan, rand);
}
public static void play(Scanner scanner, Random randomObject) {
	String space = " ";
	String response = "";
	System.out.print("How much do you want to add to your bankroll? ");
	double x = scanner.nextDouble();
	System.out.println();
	int i = 1;
	do{
	System.out.format("What is the value of your next bet($0.00 - $%.2f)? ",x);
	double y = scanner.nextDouble();
	System.out.print("Choose the number between 1 and 6 :");
	Double z = scanner.nextDouble();
	int n = myMethod2(randomObject);
	int n2 = myMethod2(randomObject);
	int n3  =myMethod2(randomObject);    
	 System.out.println("Dice rolls: "+ n +space+ n2+space+n3 );

	if (z==n||z ==n2||z==n3){
     	System.out.format("Winnings = %.2f\n",y);
     	x += y;
     }
     else if(z==n && z==n2 ||z==n2 && z==n3 || z==n && z==n3){
     	System.out.format("Winnings = %.2f\n",y*2);
     	x += y*2;
     }
     else if(z == n && z == n2 && z == n3){
     	System.out.format("Winnings = %.2f\n",y*10);
     	x += y*10;
     }
     else  {
     	System.out.format("Winnings = 0.00\n");
     	x -= y;
 }


     
      System.out.printf("After bet"+space+i+space+"your bankroll is $%.2f",x);
      System.out.println();
      i++;
      System.out.println();
      if (x<0){
      System.out.println("You do not have money to play!!");
    }
      else{
      
      System.out.print("Do you want to keep playing? ");
      response = scanner.next();
  } 
}

     	while ((response.equals("yes")));   
 }
	    
public static int myMethod2(Random rand) {
	String space = " ";
	int n = rand.nextInt(5)+1;		 
	return  n;
}
}
