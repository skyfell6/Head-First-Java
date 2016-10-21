// page 91 puzzle, other class 'Puzzle4b' is linked to this one
// even though I'm not sure if it's supposed to be called Puzzle4b 
// for the other class, it was a blank line I had to fill out.
// oct 21, 2016

class Puzzle4b{
   int ivar;
   public int doStuff(int factor){
      if (ivar > 100){
         return ivar*factor;
      } else {
         return ivar*(5-factor);
      }
   }
}
