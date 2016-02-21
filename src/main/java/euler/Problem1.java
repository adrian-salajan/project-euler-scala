package euler;


import java.util.stream.IntStream;

public class Problem1 {

    public static long getSumOfMultiplesBelow3(long number) {
        long n = number - 1;
        return sumDivisibleBy(n, 3) +
                sumDivisibleBy(n, 5) -
                sumDivisibleBy(n, 15);
    }

    // 1+2+3+...+p = p*(p+1)/2
    private  static long sumDivisibleBy(long n, long divisor) {
        long p = n / divisor;
        long sum = (p * (p+1));
        return divisor * sum / 2;
    }

    public static long getSumOfMultiplesBelow2(long number) {
        return getStream(number)
                .filter( n -> n % 3 == 0 || n % 5 == 0)
                .sum();
    }

    private static IntStream getStream(long number) {
        return IntStream.iterate(0, n -> n + 1)
                .limit(number);
    }

    private static boolean multiple(long i, long d) {
        return i % d == 0;
    }

    public static long getSumOfMultiplesBelow1(long number) {

        long sum = 0;

        for (long i = 0; i < number; i++) {
            if (multiple(i, 3) || multiple(i, 5)) {
                sum += i;
            }
        }

        return sum;

    }

}
