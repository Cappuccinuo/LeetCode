class Solution {
    public String toGoatLatin(String S) {
        if (S.length() == 0) {
            return "";
        }
        
        Set<Character> dict = new HashSet();
        dict.add('a');
        dict.add('A');
        dict.add('e');
        dict.add('E');
        dict.add('i');
        dict.add('I');
        dict.add('o');
        dict.add('O');
        dict.add('u');
        dict.add('U');
        
        StringBuilder sb = new StringBuilder();
        
        String[] words = S.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (dict.contains(words[i].charAt(0))) {
                sb.append(words[i]);
                sb.append("ma");   
            }
            else {
                sb.append(words[i].substring(1));
                sb.append(words[i].charAt(0));
                sb.append("ma");
            }
            
            for (int j = 0; j < i + 1; j++) {
                sb.append("a");
            }
            
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}