package benchmarks;

import euler.Problem1;
import org.openjdk.jmh.annotations.*;



@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1)
@Warmup(iterations = 5)
@Measurement(iterations = 3)
public class BProblem1 {

    @Benchmark
    public void benchmarkGetSumOfMultiplesBelow2() {
        Problem1.getSumOfMultiplesBelow2(10_000_000);
    }

    @Benchmark
    public void benchmarkGetSumOfMultiplesBelow3() {
        Problem1.getSumOfMultiplesBelow3(10_000_000);
    }

}
