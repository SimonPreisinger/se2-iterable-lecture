import java.util.Iterator;

public class StringChars implements Iterable<Character>{
    private final String theString;

    public StringChars(String theString){
        this.theString = theString;
    }

    @Override
    public Iterator<Character> iterator() {
        return new StringCharsIterator(theString);
    }
}
