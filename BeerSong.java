// Page 14
public class BeerSong {
   public static void main(String[] args) {
      int beerNum = 99;
      String word = "bottles";
      
      while (beerNum > 0) {
      
         if (beerNum == 1) {
         word = "bottle";
         }
         
         System.out.println(beerNum + " " + word + " of beer on the wall.");
         // System.out.println(beerNum + " " + word + " of beer.");  ----- UNNECESSARY DUPLICATE
         // System.out.println("Take one down."); ----- MOVED TO LN 17 (LN=LINE)
         beerNum = beerNum - 1;
         System.out.println("Take one down.");
         
         if (beerNum > 0) {
         // System.out.println(beerNum + " " + word + " of beer on the wall.");  ----- UNNECESSARY DUPLICATE
         } else {
         System.out.println("No more bottles of beer on the wall.");
         }
      }
   }
}