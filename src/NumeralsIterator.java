import java.util.Iterator;

public class NumeralsIterator implements Iterator<Integer> {

    private final  int limit;

    private int next = 1;

    public NumeralsIterator(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return next <= limit;
    }

    @Override
    public Integer next() {
        return next++;
    }
}
