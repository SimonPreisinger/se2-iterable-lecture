import java.util.Iterator;

public class StringCharsIterator implements Iterator<Character> {
    private final String theString;

    private int position;

    public StringCharsIterator(String theString) {
        this.theString = theString;
    }

    @Override
    public boolean hasNext() {
        return position < theString.length();
    }

    @Override
    public Character next() {
        position++;
        return theString.charAt(position - 1);
    }
}
