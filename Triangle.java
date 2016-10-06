// page 65 Date: 10/6/16
public class Triangle {
   double area;
   int height;
   int length;
   public static void main(String[] args){
      int x = 0;                               // correct!
      Triangle [] ta = new Triangle[4];        // correct!
      while (x<4){                             // correct!
         ta[x] = new Triangle();               // was wrong, now correct!
         ta[x].height = (x+1) * 2;
         ta[x].length = x+4;
         ta[x].setArea();                      // was wrong, now correct!
         System.out.print("triangle "+x+", area");
         System.out.println(" = "+ta[x].area); // correct!
         x = x+1;
      }
      int y = x;                               // was wrong, now correct!
      x=27;
      Triangle t5 = ta[2];
      ta[2].area = 343;
      System.out.print("y = " +y);
      System.out.println(", t5 area = "+ t5.area);
   }
   void setArea() {
      area=(height*length)/2;                  // correct!
   }
}
