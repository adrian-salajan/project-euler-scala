package euler.problem2;

import java.util.Iterator;

/**
 * Created by adrian on 21/2/2016.
 */
public class FibGen implements Iterator<Long> {

    private final long limit;

    private long current = 1;
    private long next = 2;


    public FibGen(long limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return current <= limit;
    }

    @Override
    public Long next() {
        long r = current;
        long nextFib = next + current;
        current = next;
        next = nextFib;
        return r;
    }
}
