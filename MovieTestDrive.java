public class MovieTestDrive{
   public static void main(String[] args) {
      Movie one = new Movie();
      one.title = "Transporter";
      one.genre = "Action/Fighting";
      one.rating = 5.5;
      System.out.println(" Title: "+one.title);
      System.out.println(" Genre: "+one.genre);
      System.out.println("Rating: "+one.rating);
      
      Movie two = new Movie();
      two.title = "Grudge";
      two.genre = "Horror";
      two.rating = 5.0;
      System.out.println("\n Title: "+two.title);
      System.out.println(" Genre: "+two.genre);
      System.out.println("Rating: "+two.rating);
      //two.playIt();
      
      Movie three = new Movie();
      three.title = "Inception";
      three.genre = "Mystery";
      three.rating = 9.5;
      System.out.println("\n Title: "+three.title);
      System.out.println(" Genre: "+three.genre);
      System.out.println("Rating: "+three.rating);
      three.playIt();      
   }
}