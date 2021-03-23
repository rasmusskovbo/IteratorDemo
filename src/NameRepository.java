public class NameRepository implements Container {
    // Instantiates a simple array of Strings
    public String[] names = {"Simon", "Rasmus", "Thomas"};

    // Implements the Container function
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Private inner class that implements the iterator interface and defines its functionality.
    // This is the class that is returned at line 8
    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
