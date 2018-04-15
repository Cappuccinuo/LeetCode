// 2018.4.15
class Solution {
    class ListCharNode {
        char val;
        ListCharNode next;
        ListCharNode(char x) {
            this.val = x;
        }
    }
    
    class DataStream {
        Set<Character> duplicate;
        Map<Character, ListCharNode> nodeToPrev;
        ListCharNode dummy;
        ListCharNode tail;
        
        DataStream() {
            duplicate = new HashSet();
            nodeToPrev = new HashMap<>();
            dummy = new ListCharNode('.');
            tail = dummy;
        }
        
        void add(char c) {
            if (duplicate.contains(c)) {
                return;
            }
            
            if (nodeToPrev.get(c) == null) {
                ListCharNode newNode = new ListCharNode(c);
                tail.next = newNode;
                nodeToPrev.put(c, tail);
                tail = newNode;
                return;
            }
            
            ListCharNode prev = nodeToPrev.get(c);
            prev.next = prev.next.next;
            if (prev.next == null) {
                tail = prev;
            }
            else {
                nodeToPrev.put(prev.next.val, prev);
            }
            
            duplicate.add(c);
            nodeToPrev.remove(c);
        }
        
        Character firstUniqueChar() {
            if (dummy.next == null) {
                return null;
            }
            return dummy.next.val;
        }
    }
    
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        DataStream ds = new DataStream();
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            ds.add(letters[i]);
        }
        return ds.firstUniqueChar() == null ? -1 : s.indexOf(ds.firstUniqueChar());
    }
}

// 2018.4.13
class Solution {
    public int firstUniqChar(String s) {
        int firstIndex = s.length();
        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && s.lastIndexOf(c) == index) {
                firstIndex = Math.min(firstIndex, index);
            }
        }
        return firstIndex == s.length() ? -1 : firstIndex;
    }
}



class Solution {
    public int firstUniqChar(String s) {
        int index = -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                index = s.indexOf(ch);
                break;
            }
        }
        return index;
    }
}