// 2018.7.1
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            }
            else if (bill == 10) {
                if (five <= 0) {
                    return false;
                }
                five--;
                ten++;
            }
            else {
                if (five > 0 && ten > 0) {
                    ten--;
                    five--;
                }
                else if (five >= 3) {
                    five -= 3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}

// 2018.7.1 During Contest
class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null) {
            return true;
        }
        if (bills[0] != 5) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);
        
        for (int bill : bills) {
            if (bill == 5) {
                map.put(5, map.get(5) + 1);
                continue;
            }
            int change = bill - 5;

            
            if (!hasChange(map, change)) {
                return false;
            }
            map.put(bill, map.getOrDefault(bill, 0) + 1);
            
        }
        
        return true;
    }
    
    private boolean hasChange(Map<Integer, Integer> map, int change) {
        int five = Math.min(change / 5, map.get(5));
        int ten = Math.min(change / 10, map.get(10));
        int twen = Math.min(change / 20, map.get(20));
        
        boolean canChange = false;
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        for (i = 0; i <= five; i++) {
            if (canChange) {
                break;
            }
            for (j = 0; j <= ten; j++) {
                if (canChange) {
                    break;
                }
                for (k = 0; k <= twen; k++) {
                    if (i * 5 + 10 * j + k * 20 == change) {
                        a = i;
                        b = j;
                        c = k;
                        canChange = true;
                        break;
                    }
                }
            }
        }

        
        if (canChange) {
            map.put(5, map.get(5) - a);
            map.put(10, map.get(10) - b);
            map.put(20, map.get(20) - c);
        }
        
        return canChange;
    }
}