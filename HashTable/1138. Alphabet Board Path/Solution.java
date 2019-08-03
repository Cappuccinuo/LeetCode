class Solution {
    public String alphabetBoardPath(String target) {
        Map<Character, int[]> map = new HashMap<>();
        int i = 0, j = 0;
        int count = 0;
        while (count < 26) {
            if (j >= 5) {
                j = 0;
                i++;
            }
            int[] position = new int[]{i, j};
            map.put((char)('a' + count), position);
            j++;
            count++;
        }
        
        StringBuilder sb = new StringBuilder();
        int[] current = new int[]{0, 0};
        for (char c : target.toCharArray()) {
            int[] next = map.get(c);
            appendPath(current, next, sb);
            current = next;
        }
        
        return sb.toString();
    }
    
    public void appendPath(int[] current, int[] next, StringBuilder sb) {
        int x = current[0];
        int y = current[1];
        int new_x = next[0];
        int new_y = next[1];
        
        if (x != new_x) {
            if (x < new_x) {
                while (x != new_x) {
                    if (x == 4 && y > 0) {
                        break;
                    }
                    sb.append("D");
                    x++;
                }
            }
            else {
                while (x != new_x) {
                    sb.append("U");
                    x--;
                }
            }
        }
        
        if (y != new_y) {
            if (y < new_y) {
                while (y != new_y) {
                    sb.append("R");
                    y++;
                }
            }
            else {
                while (y != new_y) {
                    sb.append("L");
                    y--;
                }
            }
        }
        
        if (x != new_x) {
            sb.append("D");
            x++;
        }
        
        sb.append("!");
    }
}