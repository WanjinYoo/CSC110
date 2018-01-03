/*
* For assignment: V00832396 : WanjinYoo
part1
PURPOSE: to print a ascii rocket ship
INPUT: int size, controls the proportions of the rocket.
int numBoosters, controls how many boosters are drawn 
OUTPUT: an ascii representation of Apollo Spaceship.
*/

import java.util.*;
public class RocketLaunch {
	public static void main(String[] args) { 
		int n = userinput();
		int n2 = userinput2();

		
	
	drawRocket(n,n2);
	Scanner userInput = new Scanner(System.in);
	System.out.print("What is your message? ");
	String msg = userInput.nextLine();
	System.out.print("What is your key? ");
	int key = userInput.nextInt();
   System.out.print("type 1 for encrypt or 2 for decrypt? ");
   int numb = userInput.nextInt();
	if (numb <= 1)
encrypt(msg,key);
   if (numb >= 2)
decrypt(msg,key);
   

	}

	public static int userinput(){
		Scanner console = new Scanner(System.in);
		System.out.println("What size rocket would you like to build?");
		int n = console.nextInt();
	
		return n;
	}
	public static int userinput2(){
		Scanner console = new Scanner(System.in);
		System.out.println("How many boosters?");
		int n2 = console.nextInt();
		return n2;

}

	public static void drawRocket(int size,int numBoosters)  {
		String space= " ";
		drawspacecraft(size);
		drawLemAdapater(size);
		drawinstrumentunit(size);
		for (int i=0;i<numBoosters;i++){
		drawbooster(size);
	}
		drawtail(size);
	}


public static void drawspacecraft(int size){
	String space= " ";




			for (int  i=0;i<size*2;i++) {
				System.out.print(space);
				System.out.print(space);
				for (int j=size*2;j>i;j-- ) {
				System.out.print(space);
			}

				for (int j=0;j<i;j++ ) {
			        System.out.print("/");	
			      		}

		    
		    System.out.print("**");

		    for (int j=0;j<i;j++ ) {
		    System.out.print("\\");
		   
		}
		System.out.println();
	}
	for (int  i=0;i<=0;i++) {
		for (int j=2;j>i;j-- ) {
				System.out.print(space);
			}
		

		System.out.print("+");
		for (int j=0;j<size;j++){
		System.out.print("=*=*");
	}
		System.out.print("+");
		System.out.println();
	}
}



  public static void drawLemAdapater(int size){
	for (int  i=0;i<=0;i++) {
		String space= " ";
		System.out.print(space);

		System.out.print("//");
		for (int j=size;j<size*2;j++){
		System.out.print(" & &");
	}
		System.out.print("\\\\");
		System.out.println();
	}
	for (int  i=0;i<=0;i++) {

		System.out.print("//");
		for (int j=size;j<size*2;j++){
		System.out.print(" & &");

	}
	    System.out.print(" &");
		System.out.print("\\\\");
		System.out.println();
	}
	for (int  i=0;i<=0;i++) {
		System.out.print("+");
		for (int j=0;j<size+1;j++){
		System.out.print("=*=*");
	}
		System.out.print("+");
		System.out.println();
	}
}
   

   public static void drawinstrumentunit(int size){


	for (int  i=0;i<=1;i++) {
		System.out.print("||");
		for (int j=0;j<size*2+1;j++){
		System.out.print("~#");
	}
		System.out.print("||");
		System.out.println();
	}
	for (int  i=0;i<=0;i++) {
		System.out.print("+");
		for (int j=0;j<size+1;j++){
		System.out.print("=*=*");
	}
		System.out.print("+");
		System.out.println();
	}
}
	//boosters
public static void drawbooster(int size){
	for (int  i=0;i<=size*2+1;i++) {
		System.out.print("|");


		if(i<size+1)
			for (int j=size-1;i<=j;j--){
		System.out.print(".");
	}
	if(i>size+1)
		for (int j=size+2;j<=i;j++){
			System.out.print(".");
		}
		
	
	if(i<size+1)
		for (int j=0;j<=i;j++){

			System.out.print("/\\");
				}
	
	if(i>size)		
			for (int j=size+size+1;i<=j;j--){

			System.out.print("\\/");
				
	}

			
	if(i<size+1)
			for (int j=size-1;i<=j;j--){
		System.out.print("..");
	}
	if(i>size+1)
		for (int j=size+2;j<=i;j++){
			System.out.print("..");
		}
	
	if(i<size+1)
		for (int j=0;j<=i;j++){

			System.out.print("/\\");
				}
	
	if(i>size)		
			for (int j=size+size+1;i<=j;j--){

			System.out.print("\\/");
				
	}
	if(i<size+1)
			for (int j=size-1;i<=j;j--){
		System.out.print(".");
	}
	if(i>size+1)
		for (int j=size+2;j<=i;j++){
			System.out.print(".");
		}
	
	System.out.print("|");
	System.out.println();
}
	for (int  i=0;i<=0;i++) {
		System.out.print("+");
	}
		for (int j=0;j<size+1;j++){
		System.out.print("=*=*");
	
}
System.out.print("+");
System.out.println();
}
//tail
public static void drawtail(int size){
System.out.print("//");
System.out.print("  ");
for(int i=0;i<size;i++){
	System.out.print("/\\");
	System.out.print("  ");
}
System.out.print("\\\\");
System.out.println();
}

/*
part2
PURPOSE: encrypts msg given an encryption key between 1 and 95 
INPUT: String msg, the message to be encrypted
int key, the amount to increase the ascii character by to encrypt the message
OUTPUT: anencryptedversionofmsgreturnedasaString
*/
public static String encrypt(String msg, int key){
      

  System.out.print(" Your message encrypted is : ");
   int size = msg.length();
       
   for (int  i=0;i<=size-1;i++) {
  char letter = msg.charAt(i);

   
      
      letter += key;
      System.out.print(letter);
     
   }
   System.out.println();
   return "";
}

 

/*

 PURPOSE: decrypts msg given an encryption key between 1 and 95 
INPUT: String msg, the message to be decrypted
int key, the amount to shift the ascii character by to decrypt the message
OUTPUT: adecryptedversionofmsgreturnedasaString
*/
   
   public static String decrypt(String msg,int key){
    

   System.out.print(" Your message decrypted is : ");
   int size = msg.length();
       
   for (int  i=0;i<=size-1;i++) {
  char letter = msg.charAt(i);

   
      
      letter -= key;
      System.out.print(letter);
     
   }
   System.out.println();
   

   return "";

          
}     

}