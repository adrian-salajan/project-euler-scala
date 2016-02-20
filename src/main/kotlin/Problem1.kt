package demo

import java.util.*

object KProblem1 {

    fun getSumOfMultiplesBelow2(number: Int): Int {
        return 0.rangeTo(number - 1)
                .filter {multiple(it, 3) || multiple(it, 5)}
                .sum();
    }

    private fun multiple(i: Int, d: Int) = (i % d) == 0;

    fun getSumOfMultiplesBelow1(number: Int): Int {
        var sum = 0;
        for (i in 0 .. number - 1) {
            if (multiple(i, 3) || multiple(i, 5)) {
                sum += i;
            }
        }
        return sum;
    }

}


