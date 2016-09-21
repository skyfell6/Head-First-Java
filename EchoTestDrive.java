public class EchoTestDrive{
   public static void main(String[] args){
      Echo e1 = new Echo();
      e2 = e1;  // this won't compile right, I guess I haven't declared the e2 variable. 
      int x = 0;
      while (x < 5){
         e1.hello();
         if(x==3){
            e2.count = e2.count+1;
         }
         if (x>1){
            e2.count = e2.count + e1.count;
         }
      x = x+1;
      }
      System.out.println(e2.count);
   }
}
