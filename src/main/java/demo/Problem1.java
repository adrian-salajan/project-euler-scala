package demo;


import java.util.stream.IntStream;

public class Problem1 {

    public static int getSumOfMultiplesBelow2(int number) {
        return IntStream.iterate(0, n -> n + 1)
                .limit(number)
                .filter( n -> n % 3 == 0 || n % 5 == 0)
                .sum();
    }

    private static boolean multiple(int i, int d) {
        return i % d == 0;
    }

    public static int getSumOfMultiplesBelow1(int number) {

        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (multiple(i, 3) || multiple(i, 5)) {
                sum += i;
            }
        }

        return sum;

    }

}
