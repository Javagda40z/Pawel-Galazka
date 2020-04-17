package StayAtHome;

import java.util.Random;

public class Punkt {

   Random random = new Random();

   int coordinates = random.nextInt(9);

   public int Punkt (int coordinates){
      this.coordinates = coordinates;
      return coordinates;
   }

   public void setCoordinates(int coordinates) {
      this.coordinates = coordinates;
   }
}

