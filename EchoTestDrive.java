public class EchoTestDrive{
   public static void main(String[] args){
      Echo e1 = new Echo();
      Echo e2 = e1;  // this won't compile right, I guess I haven't declared the e2 variable. 
                     // Looking into the answer.. Oh Echo e2=e1; is possible,  I thought it was not
                     // SECOND POSSIBLE ANSWER for line 4: Echo e2 = new Echo();
      int x = 0;
      while (x < 4){
         e1.hello();
         e1.count = e1.count+1;  
         if(x==3){
            e2.count = e2.count+1;
         }
         if (x>0){
            e2.count = e2.count + e1.count;
         }
      x++;
      }
      System.out.println(e2.count);
   }
}
