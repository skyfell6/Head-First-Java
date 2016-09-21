class DogOne{
   String name;
   public static void main(String[] args){      
   // make a new dog object and access it
      DogOne dog1 = new DogOne();
      dog1.bark();
      dog1.name = "Bart";
   
      // now make a dog array
      DogOne[] myDogs = new DogOne[3];
      myDogs[0] = new DogOne();
      myDogs[1] = new DogOne();
      myDogs[2] = dog1;
   
      myDogs[0].name = "Fred";
      myDogs[1].name = "Marge";
   
      // Hmm.. what is myDogs[2]'s name?  MY ANSWER: Bart, bec myDogs[2] = dog1 (line 4)
      System.out.print("last dog's name is ");
      System.out.println(myDogs[2].name);
   
      // now loop through the array
      // and tell all dogs to bark
      int x = 0;
      while (x < myDogs.length){  // Arrays have a variable 'length' that gives you the
         myDogs[x].bark();        // number of elements in the array
         x++;  // x = x + 1;   
      }
   }
   public void bark(){
      System.out.println(name + " says Ruff!");  // RESUME WORKING ON THIS LINE
   }
   public void eat(){ }
   public void chaseCat() { }
}
