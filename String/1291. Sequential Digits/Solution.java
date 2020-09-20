class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> result = new LinkedList<>();
        
        for (int l = 2; l <= 9; l++) {
            for (int i = 0; i <= 9 - l; i++) {
                int j = i + l;
                checkDigitValidity(result, digits.substring(i, j), low, high);
            }
        }
        
        return result;
    }
    
    private void checkDigitValidity(List<Integer> result, String num, 
                                    int low, int high) {
        long val = Long.parseLong(num);
        if (val > Integer.MAX_VALUE) {
            return;
        }
        if (low <= val && val <= high) {
            result.add((int)val);
        }
    }
}

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i < 9; i++) {
            appendTheValidSequentialDigits(result, String.valueOf(i), low, high);
        }
        Collections.sort(result);
        return result;
    }
    
    private void appendTheValidSequentialDigits(List<Integer> result, String num, 
                                                int low, int high) {
        long val = Long.parseLong(num);
        if (val > Integer.MAX_VALUE) {
            return;
        }
        if (low <= val && val <= high) {
            result.add((int)val);
        }
        int currentLast = num.charAt(num.length() - 1) - '0';
        if (currentLast == 9) {
            return;
        }
        appendTheValidSequentialDigits(result, num + String.valueOf(currentLast + 1), 
                                      low, high);
    }
}