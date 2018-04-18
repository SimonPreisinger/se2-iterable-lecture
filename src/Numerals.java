import java.util.Iterator;

public class Numerals implements Iterable<Integer> {
    private final int limit;

    public Numerals(int limit) {
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumeralsIterator(limit);
    }
}
