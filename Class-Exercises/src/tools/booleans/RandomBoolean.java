package tools.booleans;

import tools.numbers.RandomNumber;

public class RandomBoolean {
    public static boolean rand() {
        return RandomNumber.integer(2) < 1;
    }
}
