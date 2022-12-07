package tools.booleans;

import java.util.Random;

public class RandomBoolean {
    private static final Random random = new Random();

    public static boolean rand() {
        return random.nextBoolean();
    }
}
