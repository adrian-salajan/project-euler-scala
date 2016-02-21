package euler.problem2;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.IntUnaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

/**
 * Created by adrian on 21/2/2016.
 */
public class Problem2 {


    public static long solve1(long limit) {
        FibGen gen = new FibGen(limit);
        long sum = 0;
        while (gen.hasNext()) {
            Long fib = gen.next();
            if (even(fib)) {
                sum +=  fib;
            }
        }
        return sum;
    }

    private static boolean even(Long fib) {
        return fib % 2 == 0;
    }

    LongUnaryOperator fibOp = new LongUnaryOperator() {

        long previous = 0L;
        @Override
        public long applyAsLong(long operand) {
            long fib = operand + previous;
            previous = operand;
            return fib;
        }
    };
}
