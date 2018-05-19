// 2018.5.19
class Solution {
    public boolean isStrobogrammatic(String num) {
        if (num == null || num.length() == 0) {
            return true;
        }
        Map<Character, Character> rotateMap = new HashMap<>();
        rotateMap.put('6', '9');
        rotateMap.put('8', '8');
        rotateMap.put('9', '6');
        rotateMap.put('1', '1');
        rotateMap.put('0', '0');
        
        String reverseStr = reverse(num, rotateMap);
        if (reverseStr == null) {
            return false;
        }
        String afterRotate = rotate(reverseStr, rotateMap);
        return num.equals(afterRotate);
    }
    
    private String reverse(String num, Map<Character, Character> rotateMap) {
        char[] array = num.toCharArray();
        int start = 0;
        int end = array.length - 1;
        while (start + 1 < end) {
            if (!rotateMap.containsKey(array[start]) 
                || !rotateMap.containsKey(array[end])) {
                return null;
            }
            swap(array, start, end);
            start++;
            end--;
        }
        
        if (!rotateMap.containsKey(array[start]) || !rotateMap.containsKey(array[end])) {
            return null;
        }
        swap(array, start, end);
        return new String(array);
    }
    
    private String rotate(String reverseStr, Map<Character, Character> rotateMap) {
        char[] array = reverseStr.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = rotateMap.get(array[i]);
        }
        return new String(array);
    }
    
    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}