// 2018.6.24 After Contest
class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int N = A.length();
        
        if (A.equals(B)) {
            Set<Character> set = new HashSet();
            for (char c : A.toCharArray()) {
                set.add(c);
            }
            return set.size() < N;
        }
        
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diff.add(i);
            }
        }
        
        return diff.size() == 2 
            && A.charAt(diff.get(0)) == B.charAt(diff.get(1))
            && A.charAt(diff.get(1)) == B.charAt(diff.get(0));
    }
}
// 2018.6.24 During Contest
class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        
        Map<Character, Integer> map = new HashMap<>();
        
        int count = 0;
        boolean hasSame = false;
        List<diffPair> list = new ArrayList<>();
        int N = A.length();
        for (int i = 0; i < N; i++) {
            if (a[i] != b[i]) {
                count++;
                if (count > 2) {
                    return false;
                }
                diffPair d = new diffPair(a[i], b[i]);
                list.add(d);
            }
            else {
                char same = a[i];
                if (map.containsKey(same) && map.get(same) == 2) {
                    hasSame = true;
                }
                map.put(same, map.getOrDefault(same, 0) + 2);
            }
        }
        
        if (count == 0 && hasSame) {
            return true;
        }
        
        if (count != 2) {
            return false;
        }
        
        diffPair d1 = list.get(0);
        diffPair d2 = list.get(1);
        
        if (d1.a != d2.b || d1.b != d2.a) {
            return false;
        }
        
        return true;
    }
}

class diffPair {
    char a;
    char b;
    diffPair(char a, char b) {
        this.a = a;
        this.b = b;
    }
}