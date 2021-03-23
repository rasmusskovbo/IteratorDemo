public class AgeRepository implements Container {
    // Instantiates a simple array of integers
    public int[] ages = {30, 25, 46};

    // Implements the Container function
    @Override
    public Iterator getIterator() {
        return new AgeIterator();
    }

    // Private inner class that implements the iterator interface and defines its functionality.
    // This is the class that is returned at line 8
    private class AgeIterator implements Iterator {
        int index;

        // Simplified if statement: Checks statement and returns true/false accordingly.
        @Override
        public boolean hasNext() {
            return index < ages.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return ages[index++];
            }
            return  null;
        }
    }

}
