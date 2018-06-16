// 2018.6.16
class StringIterator {
    Queue<letterPair> queue = new LinkedList<>();
    public StringIterator(String compressedString) {
        Character c = ' ';
        while (!compressedString.equals("")) {
            c = compressedString.charAt(0);
            int index = 1;
            while (index < compressedString.length() &&  
                   compressedString.charAt(index) < 'A') { // 0 - 9 : 30 - 39
                index++;
            }
            int num = Integer.parseInt(compressedString.substring(1, index));
            
            compressedString = compressedString.substring(index);
            queue.offer(new letterPair(c, num));
        }
    }
    
    public char next() {
        if (queue.isEmpty()) {
            return ' ';
        }
        letterPair first = queue.peek();
        char fc = first.letter;
        first.frequency -= 1;
        
        if (first.frequency == 0) {
            queue.poll();
        }
        return fc;
    }
    
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

class letterPair {
    char letter;
    int frequency;
    public letterPair(char l, int f) {
        this.letter = l;
        this.frequency = f;
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */