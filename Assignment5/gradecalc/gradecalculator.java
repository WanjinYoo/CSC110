import java.util.*;
import java.io.*;
import java.io.PrintStream; 
public class gradecalculator{

 public static void main(String[] args){

 	Scanner scan = new Scanner(System.in);

 
 	System.out.println("enter the name of your grade file");
 	boolean condition = false;

 
 	
		
do {	
Scanner s = null;	
String user_input = scan.nextLine(); 

try{    

        PrintStream output = new PrintStream("gradeReport.txt");
	    File grade = new File(user_input);	
		s = new Scanner(grade);
		
		System.out.println("Calculationg grades and generating report...");
		System.out.println("Check current directory for gradeReport.txt");
        int row = getNumEntries(grade);
        
     // place all of the numbers on the main.
        

        int count=0;
		while (s.hasNextDouble()){
			double num = s.nextDouble();
			count++;
		}

        s= new Scanner(grade);
	 	
	 	count+=1;
	 	int[] values = new int[count];
	for(int i=1;i<values.length;i++){
		double input =s.nextDouble();
		int number=(int)Math.round(input);
		values[i] =number;
	}
	 // taking values from the file
	 // i reprensents all the numbers from grade.txt 
	s = new Scanner(grade);
	int[] nums = new int[row];
	int x=0;

	 
	 do{	
	 	

	 	double new_value = 0;

	 		
	 		int i = 1;
	for(i=1;i<12;i++){
		double input =s.nextDouble();
		double temp = 0;
		
		
		//int number=(int)Math.round(input);
		//grades[i] = number;
		
		if (i==1){

		    temp=(input*20)*0.05;
		
		    new_value+=temp;

		}
		if (i==2){
			temp=(input*10)*0.04;
				
			
			new_value+=temp;

			
		
		}
		if (i==3){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		if (i==4){
			temp=(input*10)*0.04;
			new_value+=temp;

		
		}
		if (i==5){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		if (i==6){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		if (i==7){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		if (i==8){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		
		if (i==9){
			temp=(input*5)*0.15;
			new_value+=temp;

			
		}
		if (i==10){
			temp=(input*2.857)*0.15;
			new_value+=temp;

			
		}
		if (i==11){
			temp=(input*0.9)*0.37;
			new_value+=temp;

			
		}
		
		
		

	   
	}
	double temp_percent=new_value;
	int percent=(int)Math.round(temp_percent);
	
	
	nums[x] = percent;
	x++;	   	   
}

while(x < row);

// so I can pass the interger row to other method
//nums[] = percent numbers
String[] letters= new String[10];
letters[0]= "A+";
letters[1]= "A";
letters[2]= "A-";
letters[3] = "B+";
letters[4] = "B";
letters[5] = "B-";
letters[6]= "C+";
letters[7]= "C";
letters[8] = "D";
letters[9] = "F";




       
        int max=max(nums);
        output.println("Maximum Grade: "+max);
        
        int min=min(nums);
        output.println("Minimum Grade: "+min);
        int avg=avg(nums);
        output.println("Average Grade: "+avg);
        output.println();
        output.println();
          String[] percent=getLetterGrades(nums);

        int[] count_letter=countGrades(percent); 
        output.println("Letter grade    Count");
      for(int i=0;i<10;i++){
      output.println(letters[i]+"\t"+"\t"+count_letter[i]); 
      }


       
        //countGrades(percent);
      output.println();
      output.println();


        
        output.println("Letter grade    Percentage");
       for(int i=0;i<row;i++){
        
        output.println(percent[i]);
    }
 

      
        

   				
	condition = true; 	
		
}
catch(FileNotFoundException e){
	
	System.out.println("your input file does not exist");
	System.out.println("please enter again");
	
	condition = false;
	

}
}
while(condition != true);

}

		


 
 
/* PURPOSE:gets the number of line entries in a file
* INPUT:File fIn, file with text
* OUTPUT:returns number of lines in the file as an integer
 */
public static int getNumEntries(File fin)throws FileNotFoundException {
	Scanner s=new Scanner(fin);
	
	int count=0;
		while (s.hasNext()){
			String num = s.nextLine();
			count++;
		}
	
	return count;

}
/*
* PURPOSE:prints an array of integers to the console 
* INPUT:int[] values, array of integers
* OUTPUT:none
 */
public static void print(int[] values){
	

	int x=1;
	for(int i=1;i<values.length;i++){
		
		
		System.out.print(values[i]+"   ");
	   if (i==11*x){
	   	System.out.println();
	   	x++;

	   } 
	   

	}
		





}
/*
* PURPOSE:identifies the min value in an array of integers
* INPUT:int[] values, array of integers
* OUTPUT: returns the min value as an integer
*/
public static int min(int[] values){
	int i = 0;
	
	int row =values.length;
	int temp = values[0];
while(i<row){
if (temp>values[i])
	temp = values[i];
i++;
}

return temp;




}
/*
* PURPOSE: identifies the max value of an array of integers
* INPUT: int[] values, array of integers
* OUTPUT: returns the max value as an integer
 */
public static int max(int[] values){
	int i = 0;
	
	int row =values.length;
	int temp=0;
while(i<row){
if (temp<values[i])
	temp = values[i];
i++;
}


return temp;

	

}
/*
* PURPOSE: calculates the average of an array of integers
* INPUT: int[] values, array of integers
* OUTPUT: returns the average as an integers
*/
public static int avg(int[] values){
	int i = 0;
	int sum=0;
	int row =values.length;
while(i<row){
sum +=values[i];
i++;
}
int average = sum/row;

return average;






}
/*
* PURPOSE: gets the corresponding letter grades 
*          for an array of integers
* INPUT:  int[]grades,array of grades as integers
* OUTPUT:  returns the letter grades in a String array
*/
public static String[] getLetterGrades(int[] grades){


	int i = 0;
	int row =grades.length;
		String[] nums = new String[row];
		String tab ="\t";
		String letter=null;
  



  while(i<row){
  	int percent = grades[i];

  
	if(percent>89){
	letter = "A+" ;
}
   else if(percent>84){
   	letter = "A";
   }
   else if(percent>79){
    letter = "A-";
   }
   else if(percent>76){
   	letter = "B+";
   }
   else if(percent>72){
    letter = "B";
   }
   else if(percent>69){
   	 letter = "B-";
   }
   else if(percent>64){
   	 letter = "C+";
   }
   else if(percent>59){
    letter = "C";
   }
   else if(percent>49){
   	letter = "D";
   }
   else if(percent<50){
    letter = "F";
   }
	String numbs2 = String.valueOf(percent);
	
	nums[i] = letter+tab+tab+numbs2;
	i++;	   	   
}


return nums;

}
/*
* PURPOSE: counts the number grades matching each letter grade
* in the array of Strings passed in as a parameter.
* The counts will be stored in an array of 10 integers where,
* index 0 holds the number of "A+"'s in grades array
* index 1 holds the number of "A"'s in grades array
* ...
* index 9 holds the number of "F"'s in grades array
* INPUT: String[] grades, array of letter grades as Strings
* OUTPUT: returns an integer array holding the letter grade counts 
*/
public static int[] countGrades(String[] grades )throws FileNotFoundException{
	File grade = new File("grades.txt");
	Scanner s = new Scanner(grade);
	
	
	int row =grades.length;
	
	int[] count2 = new int[10];
	int[] nums = new int[row];
	int x=0;
	int percent = 0;
	
	s = new Scanner(grade);

	 
	 do{	
	 	double new_value = 0;

	 		
	 		int i = 1;
	for(i=1;i<12;i++){
		double input =s.nextDouble();
		double temp = 0;
		
		if (i==1){

		    temp=(input*20)*0.05;
		
		    new_value+=temp;

		}
		if (i==2){
			temp=(input*10)*0.04;
				
			
			new_value+=temp;

			
		
		}
		if (i==3){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		if (i==4){
			temp=(input*10)*0.04;
			new_value+=temp;

		
		}
		if (i==5){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		if (i==6){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		if (i==7){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		if (i==8){
			temp=(input*10)*0.04;
			new_value+=temp;

			
		}
		
		if (i==9){
			temp=(input*5)*0.15;
			new_value+=temp;

			
		}
		if (i==10){
			temp=(input*2.857)*0.15;
			new_value+=temp;

			
		}
		if (i==11){
			temp=(input*0.9)*0.37;
			new_value+=temp;

			
		}
		
		
		

	   
	}
	double temp_percent=new_value;
	percent=(int)Math.round(temp_percent);
	
	
	nums[x] = percent;
	if(percent>89){
	
	count2[0]+=1;
}
   else if(percent>84){
   	
   	count2[1]+=1;
   }
   else if(percent>79){
     
    count2[2]+=1;
   }
   else if(percent>76){
   	
   	count2[3]+=1;
   }
   else if(percent>72){
    
    count2[4]+=1;
   }
   else if(percent>69){
   	 
   	 count2[5]+=1;
   }
   else if(percent>64){

   	
   	 count2[6]+=1;
   }
   else if(percent>59){
    
    count2[7]+=1;
   }
   else if(percent>49){
   	
   	count2[8]+=1;
   }
   else if(percent<50){
    
    count2[9]+=1;
   }
	x++;	   	   
}
while(x < row);
/*count[9]= "A+"+count2[9];
count[8]= "A"+ count2[8];
count[7]= "A-"+ count2[7];
count[6] = "B+"+ count2[6];
count[5] = "B"+ count2[5];
count[4] = "B-"+ count2[4];
count[3]= "C+"+ count2[3];
count[2]= "C"+ count2[2];
count[1] = "D"+ count2[1];
count[0] = "F"+ count2[0];*/







 




	
	//String[] num = new String[row];

 





return count2;	
}


}


