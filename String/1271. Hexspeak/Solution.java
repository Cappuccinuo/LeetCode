class Solution {
    public String toHexspeak(String num) {
        String hexString = Long.toHexString(Long.parseLong(num));
        Character[] allowedLetters = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', '1', '0'};
        Set<Character> set = new HashSet(Arrays.asList(allowedLetters));
        
        for (char c : hexString.toCharArray()) {
            if (!set.contains(c)) {
                return "ERROR";
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : hexString.toCharArray()) {
            sb.append(c == '1' ? "I" : (c == '0' ? "O" : Character.toUpperCase(c)));
        }
        return sb.toString();
    }
}

class Solution {
    public String toHexspeak(String num) {
        Long number = Long.parseLong(num);
        
        Map<Long, String> allowedHexMapping = new HashMap<>();
        allowedHexMapping.put(0L, "O");
        allowedHexMapping.put(1L, "I");
        allowedHexMapping.put(10L, "A");
        allowedHexMapping.put(11L, "B");
        allowedHexMapping.put(12L, "C");
        allowedHexMapping.put(13L, "D");
        allowedHexMapping.put(14L, "E");
        allowedHexMapping.put(15L, "F");
        
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            long remain = number % 16;
            number = number / 16;
            if (remain > 1 && remain < 10) {
                return "ERROR";
            }
            sb.insert(0, allowedHexMapping.get(remain));
        }
        
        return sb.toString();
    }
}