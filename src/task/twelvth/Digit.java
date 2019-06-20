package task.twelvth;

import java.util.stream.IntStream;

public class Digit {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> (n * n / 10) % 1000);
    }
}
