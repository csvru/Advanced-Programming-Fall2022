package tools.numbers;

import java.util.Random;

public class RandomNumber {

    private static final Random random = new Random();

    public static int integer(int bound) {
        return random.nextInt(bound);
    }

    public static double real(int bound) {
        return random.nextDouble(bound);
    }
    public static double real(int origin, int bound) {
        return random.nextDouble(origin, bound);
    }
}
