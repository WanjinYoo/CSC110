
/*
* For assignment: V00832396 : WanjinYoo
* Purpose : learn how to design, compile, run simple java program.
           do the simple math calculation.
         Input:None
         Output: Ascii Art, Calculation of surface area.
*/
 //part 1
 public class Welcome{
    public static void main(String[] args){
       System.out.println(" /~~~~~\\");
       printFrog();
       System.out.println(" /~~~~~\\");
       printPig();
       System.out.println(" /~~~~~\\");
       printFrog();
       System.out.println(" /~~~~~\\");
       printPig();
       System.out.println(" /~~~~~\\");
       System.out.println(" /~~~~~\\\n");
       calcSurfaceArea();

    }

    public static void printPig() {
    	System.out.println("  ^__^  " );
    	System.out.println("(O    O)");
      System.out.println("  (oo)  ");
      System.out.println(" (\")_(\")@");
    }

    public static void printFrog() {
      System.out.println ("  @..@  " );
      System.out.println (" (----)");
      System.out.println("( >__< )");
      System.out.println("\"\"    \"\" ");
    }
    //part2
    private static int diameter = 4;

  public static void calcSurfaceArea() {
    int h = 5;
    double Circumference = diameter * Math.PI;
    double Topofthecylinder =diameter * Math.PI;
    double Areaofthewall = Circumference * h;

    System.out.print(" Surface Area is:");
    System.out.println(Areaofthewall + (Topofthecylinder *2));     
 

  }
 }





  


    


  