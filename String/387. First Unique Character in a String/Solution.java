// 2019.4.19
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

class Solution {
    public int firstUniqChar(String s) {
        char[] array = s.toCharArray();
        DataStream ds = new DataStream();
        int i;
        int len = array.length;
        for (i = 0; i < len; i++) {
            ds.add(array[i], i);
        }
        return ds.getFirstUniqueCharIndex();
    }
}

class DataStream {
    ListCharNode dummy;
    ListCharNode tail;
    Map<Character, ListCharNode> mapToPrev;
    boolean[] visited;
    
    DataStream() {
        dummy = new ListCharNode('#', -1);
        tail = dummy;
        mapToPrev = new HashMap<>();
        visited = new boolean[26];
    }
    
    void add(char c, int i) {
        if (!mapToPrev.containsKey(c)) {
            ListCharNode newNode = new ListCharNode(c, i);
            mapToPrev.put(c, tail);
            tail.next = newNode;
            tail = tail.next;
            return;
        }

        if (!visited[c - 'a']) {
            visited[c - 'a'] = true;
            ListCharNode prev = mapToPrev.get(c);
            prev.next = prev.next.next;
            if (prev.next == null) {
                tail = prev;
            }
            else {
                mapToPrev.put(prev.next.c, prev);
            }
        }
    }
    
    int getFirstUniqueCharIndex() {
        if (dummy.next == null) {
            return -1;
        }
        return dummy.next.index;
    }
}

class ListCharNode {
    char c;
    int index;
    ListCharNode next;
    ListCharNode(char c, int i) {
        this.c = c;
        this.index = i;
    }
}