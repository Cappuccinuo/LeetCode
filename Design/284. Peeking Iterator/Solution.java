// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iter;
    Integer top;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        top = null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (top == null) {
            top = iter.next();
        }
        return top;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (top != null) {
            Integer temp = top;
            top = null;
            return temp;
        }
        else {
            return iter.next();
        }
    }

    @Override
    public boolean hasNext() {
        return iter.hasNext() || top != null;
    }
}