package StayAtHome;

import java.util.Random;

public class Punkt {

   Random random = new Random();
   int coordinates;

   public Punkt (int coordinates){
      this.coordinates = random.nextInt(9);
      this.coordinates = coordinates;
   }

   public int getCoordinates() {
      return coordinates;
   }

   //   public static Punkt nowyPunkt(int coordinates){
//      Random random = new Random();
//      return nowyPunkt(random.nextInt(9));
//   }
}

