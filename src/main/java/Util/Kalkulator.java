package Util;

import java.util.concurrent.ThreadLocalRandom;

public class Kalkulator {

    public static int randomHoursbetween (int min, int max){

        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        return localRandom.nextInt(min, max);
    }
}
