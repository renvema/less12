package task.twelvth;

import java.util.function.DoubleUnaryOperator;
import java.util.stream.IntStream;

public class CalcIntegral {

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x, 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        int n = 10000000;
        double res = 0;
        double h = (b - a) / n;

        for (double i = a; i < b; i += h) {
            res = res + f.applyAsDouble(i);
        }

        return res * h;
    }
}
