package co.evecon.alexstargame.math;

import java.util.Random;

/**
 * Random number generator
 */
public class Rnd {
    private static final Random random = new Random();

    /**
     * Generate random number
     * @param min minimum of random number
     * @param max maximum of random number
     * @return result
     */
    public static float nextFloat(float min, float max) {
        return random.nextFloat() * (max - min) + min;
    }
}
