public class PageEleven {
   public static void main(String[] args) {
      int x = 4;
      while (x > 3) {
      x = x - 1;
      System.out.println("x is greater than 3.");
      }
      
      int z = 17;
      while (z == 17) {
      System.out.println("z is equal to 17.");
      z = z-1;
      }
      System.out.println("This runs no matter what.");  // Bec this is out of the two loop blocks. 
                                                        // So it runs no matter what.
   }
}