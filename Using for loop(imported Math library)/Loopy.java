
/*
* For assignment: V00832396 : WanjinYoo
* Purpose : learn how to design, compile, run more simple java program.
           do more math calculation.
         Input:None
         Output: More Ascii Art, Math Calculations.
*/
         public class Loopy {
         	public static void main(String[] args) {

         	  drawShape(1);
              drawShape(2);
              drawShape(3);
              drawImage(1);
              drawImage(2);
              drawImage(3);
            double length =7.0;
            double width =3.0;
            double height =7.0;
            double base =6.0;
            double diameter=5.0;
            double depth =7.0;
            double peekHeight=14.0;
             System.out.println("rectangle: with length"+length+", width:"+width);
              System.out.println("area:"+rectangleArea(length,width));
              System.out.println("triangle: with height"+height+", base:"+base);
              System.out.println("area:"+triangleArea(height,base));
              System.out.println("circle: with diameter"+diameter);
              System.out.println("area:"+circleArea(diameter));
              System.out.println("circumference:"+circumference(diameter));
              System.out.println("cylinder: with height"+height+", diamter:"+diameter);
              System.out.println("surface area:"+cylinderSurfaceArea(height,diameter));
              System.out.println("rectangular prism: with height"+height+", depth:"+depth+",width:"+width);
              System.out.println("surface area:"+rectPrismSurfaceArea(height,depth,width));
            double width2 =6.0;
            System.out.println("triagular prism: with height"+height+", width:"+width2);
              System.out.println("surface area:"+triPrismSurfaceArea(height,width2));
            double wallHeight =10.0;
            double depth2 = 8.0;
            System.out.println("house: with wall height"+wallHeight+", peek height:"+peekHeight+",width"+width2+",depth"+depth2);
              System.out.println("surface area:"+houseSurfaceArea(wallHeight,peekHeight,width2,depth2));


             
             }
             public static void drawShape(int size){
               for (int i=0;i<size+1;i++)
                {   
                     System.out.print("/");
                  }
               for (int i=0;i<size+1;i++) {
                                                         
                     System.out.print("\\");
                  }
                  System.out.println();
                  System.out.print("/");
               for(int i = 0; i<size;i++){
                  System.out.print("**");
               }
                  System.out.print("/");
                  System.out.println();
               for (int i=0;i<size+1;i++)
                {   
                     System.out.print("\\");
                  }
               for (int i=0;i<size+1;i++) {
                                                         
                     System.out.print("/");
                  }
                  System.out.println();

             }

             public static void drawImage(int numShapes){
               for (int j=1;j<numShapes+1;j++){
                  drawShape(j);
                  
               }
               for (int j=numShapes;j>0;j--){
                  drawShape(j);
               }
             }
               public static double rectangleArea(double length,double width)
         {
            
         
            return length * width;
            
            
         }
          public static double triangleArea(double height,double base)
         {
            return (height * base)/2;
         }
         public static double circleArea(double diameter)
         {
            return (diameter/2)*(diameter/2)*Math.PI;
         }

          public static double circumference(double diameter)
         {
            return diameter* Math.PI;
         }
          
          public static double cylinderSurfaceArea(double height,double diameter)
         {
            return (diameter/2)*(diameter/2)*Math.PI*2+(height*Math.PI*diameter);
         }
          public static double rectPrismSurfaceArea(double height,double depth,double width)
         {
            return height*width*2+depth*width*2+height*depth*2;
         }
          public static double triPrismSurfaceArea(double height,double width)
         {
            return Math.sqrt((width*width)-(width/2)*(width/2))*width+(width*height*3);
         }
         public static double houseSurfaceArea(double wallHeight,double peekHeight,double width,double depth)
         {
            return (depth*wallHeight*2)+(wallHeight*width*2)+(width*(peekHeight-wallHeight))+((Math.sqrt((peekHeight-wallHeight)*(peekHeight-wallHeight)+(width/2)*(width/2))*depth)*2);
         }
         
         



         }
      



         


      
         