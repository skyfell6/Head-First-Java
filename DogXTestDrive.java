// Current Date: 10/9/2016
// page 73 dog example:

public class DogXTestDrive{
   public static void main(String[] args){
      DogX one = new DogX();
      one.name = "Bingo";
      one.size = 80;
   
      DogX two = new DogX();
      two.name = "Cooper";
      two.size = 45;
      
      DogX three = new DogX();
      three.name = "Rusty";
      three.size = 12;
      
      System.out.print(one.name+" says "); one.bark();
      System.out.print(two.name+" says "); two.bark();
      System.out.print(three.name+" says "); three.bark();
   }
}