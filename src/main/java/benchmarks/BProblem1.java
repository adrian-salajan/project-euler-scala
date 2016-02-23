package benchmarks;

import euler.Problem1;
import org.openjdk.jmh.annotations.*;
import problem3.PrimeTests;
import problem3.SProblem3;


@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1)
@Warmup(iterations = 5)
@Measurement(iterations = 3)
public class BProblem1 {

    @Benchmark
    public void benchmarkGetSumOfMultiplesBelow2() {
    }

    @Benchmark
    public void benchmarkGetSumOfMultiplesBelow3() {
    }

}
