// page 91 puzzle, other class 'Puzzle4b' is linked to this one
// even though I'm not sure if it's supposed to be called Puzzle4b 
// for the other class, it was a blank line I had to fill out.
// oct 21, 2016

public class Puzzle4{
   public static void main(String[] args){
      Puzzle4[] obs = new Puzzle4[6];
      int y = 1;
      int x = 0;
      int result = 0;
      while (x<6){
         obs[x].ivar=y;
         ivar=x;
         y = y*10;
         x = x+1;
      }
      x = 6;
      while (x > 0){
         x = x - 1;
         result = result + obs[x].doStuff(x);
      }
      System.out.println("result " + result);
   }
}