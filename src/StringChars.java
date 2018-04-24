import java.util.Iterator;

public class StringChars implements Iterable<Character>{
    private final String theString;

    public StringChars(String theString){
        this.theString = theString;
    }

    @Override
    public Iterator<Character> iterator() {
        return new HalloSusi(theString);
    }

    private static class FastoSusi implements Iterator<Character> {
        private final String theString;

        private int position;

        public FastoSusi(String theString) {
            this.theString = theString;
        }

        @Override
        public boolean hasNext() {
            return position < theString.length();
        }

        @Override
        public Character next() {
            position++;
            position++;
            return theString.charAt(position - 1);
        }
    }

    private static class HalloSusi implements Iterator<Character> {
        private final String theString;

        private int position;

        public HalloSusi(String theString) {
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
}
