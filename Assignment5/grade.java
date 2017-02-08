import java.util.*;
import java.io.*;

public class grade{
	public static void main(String[] args){
		File grade = new File("rolls.txt");
		
		try{
			Scanner grader = new Scanner(grade);
			int [] wanjin = new int[10];
		System.out.println(wanjin[3]);
		int count=0;
		while (grader.hasNextInt()){
			int num = grader.nextInt();
			count++;
			
		}
		//int[] x ;
		//x=new int[10];
		System.out.println(count);
		grader = new Scanner(grade);
		

		
			
			
		}
		/*int i = 0;	
		          do{
		  	int temp = x[i];
		  	i+=1;
		  	x[i] += temp;	
		  	if (i==(x.length-1))	 {

		  	     System.out.println("The average is "+(temp/x.length-1));
		  		 System.out.println(temp);
		  		 System.out.println(x.length-1);
		  	}
		  }
		  	//while(i<x.length-1);

		  	/*while(i<x.length-1){
		  		int temp = x[i];
		  		i+=1;
		  		if(temp>x[i]);{
		  		   x[i]=temp;
		  		}
		  		 if(i==x.length-1){
		  			System.out.println(temp);
		  		}
		  	}
		    
		  	*/	

		  	
	 

		// System.out.println("The average is "+x[])

		
		catch (FileNotFoundException e) {
			System.out.println("File not found ");
		}
	}

	//public static int countturns(Scanner grader){
		//int[] x ;
		//x=new int[10];

		

		//return x;


	//}
}