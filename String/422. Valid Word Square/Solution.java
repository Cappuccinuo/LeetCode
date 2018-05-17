class Solution {
    public boolean validWordSquare(List<String> words) {
        int count = 0;
        for (String word : words) {
            String columnWord = getColumnWord(words, count);
            count++;
            if (!columnWord.equals(word)) {
                return false;
            }
        }
        return true;
    }
    
    private String getColumnWord(List<String> words, int index) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (index < word.length()) {
                sb.append(word.charAt(index));   
            }
        }
        return sb.toString();
    }
}