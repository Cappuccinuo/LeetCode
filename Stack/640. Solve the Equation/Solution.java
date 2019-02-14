class Solution {
    // Init two stack, one store the coefficient of x, one store numbers
    // e.g "2x+3x-6x=x+2"
    // At last, I want coefOfX: [2, 3, -6, -1], nums: [2]
    // This is the same as 2x + 3x - 6x - x = 2
    Stack<Integer> coefOfX = new Stack<>();;
    Stack<Integer> nums = new Stack<>();;
    
    char c = '+';
    int num = 0;
    boolean encounterDigit = false;
    boolean encounterEqual = false;
    
    public String solveEquation(String equation) {
        char[] array = equation.toCharArray();
        int len = array.length;
        int i = 0;
        char current;
        
        while (i < len) {
            current = array[i];
            if (Character.isDigit(current)) {
                // This boolean variable is to deal with case like "0x = x"
                // If we see no num before x, the coef should be 1, see pushNumToCoef()
                encounterDigit = true;
                while (i < len && Character.isDigit(array[i])) {
                    num = num * 10 + array[i] - '0';
                    i++;
                }
                continue;
            }
            else if (current == 'x') {
                pushNumToCoef();
                initVars();
            }
            else if (current == '+' || current == '-') {
                pushNumToNums();
                initVars();
                c = current;
            }
            else if (current == '=') {
                pushNumToNums();
                encounterEqual = true;
                initVars();
            }
            i++;
        }
        
        pushNumToNums();
        int[] count = getCount();
        return getResult(count[0], count[1]);
    }
    
    private int[] getCount() {
        int xCount = 0;
        int numSum = 0;
        while (!nums.isEmpty()) {
            numSum += nums.pop();
        }
        while (!coefOfX.isEmpty()) {
            xCount += coefOfX.pop();
        }
        return new int[]{xCount, numSum};
    }
    
    private String getResult(int xCount, int numSum) {
        if (xCount == 0 && numSum == 0) {
            return "Infinite solutions";
        }
        if (xCount == 0) {
            return "No solution";
        }
        if (numSum == 0) {
            return "x=0";
        }
        return "x=" + String.valueOf(numSum / xCount);
    }
    
    private void pushNumToNums() {
        // For all the num on right side, they are positive
        // For all the num on left side, they are negative
        if (num != 0) {
            if (c == '+') {
                nums.push(encounterEqual ? num : -num);
            }
            else {
                nums.push(encounterEqual ? -num : num);
            }
        }
    }
    
    private void pushNumToCoef() {
        // For all the coef on left side, they are positive
        // For all the coef on right side, they are negative
        if (num == 0 && !encounterDigit) {
            num = 1;
        }
        int x = encounterEqual ? (c == '+' ? -num : num) : (c == '+' ? num : -num);
        coefOfX.push(x);
    }
    
    private void initVars() {
        c = '+';
        num = 0;
        encounterDigit = false;
    }
}