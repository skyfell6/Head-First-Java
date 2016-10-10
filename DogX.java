// Current Date: 10/9/2016
// page 73 dog example:

public class DogX{
   String name;
   int size;   
   void bark(){
      if (size > 60){
         System.out.println("Woof! Woof!");
      } else if (size > 14){
         System.out.println("Ruff! Ruff!");
      } else {
      System.out.println("Yip! Yip!");
      }
   }
}