package demo 

import kotlin.test.assertEquals as same
import org.junit.Test as test

class TestSource() {

    @test fun problem1() {
        same(233168,  Problem1.getSumOfMultiplesBelow2(1000))
        same(233168, KProblem1.getSumOfMultiplesBelow2(1000))
    }
}

