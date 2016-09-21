// (page 24) puzzle     CURRENT DATE: 9/13/16
//  Never got to solve it on my own, had to look into the answer next page (26)
public class PoolPuzzleOne {
   public static void main(String []args) {     
      int x = 0;
      
      while (x<4){
      
         System.out.print("a");
         if (x<1){
            System.out.print(" ");
         }
         System.out.print("n");
         
         if (x>1) {
         
            System.out.print(" oyster");
            x=x+2;
         }    
         if (x==1) {
         
            System.out.print("noys");
         }        
         if (x<1) {
         
            System.out.print("oise");
         }
         System.out.print(" ");  // for this particular line in the book
                                 // it goes like this: System.out.print("");  
                                 // forgot to add a space in ("")
         
         x=x+1;
      } 
   }
}