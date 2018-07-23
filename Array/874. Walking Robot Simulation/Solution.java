class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obstacleSet = new HashSet();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + " " + obstacle[1]);
        }
        
        int direction = 0;
        int result = 0;
        int x = 0;
        int y = 0;
        int[][] delta = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        for (int c : commands) {
            if (c == -1) {
                direction++;
                if (direction == 4) {
                    direction = 0;
                }
            }
            else if (c == -2) {
                direction--;
                if (direction == -1) {
                    direction = 3;
                } 
            }
            else {
                while (c-- > 0 
                       && 
                       !obstacleSet.contains((x + delta[direction][0]) 
                                             + " " 
                                             + (y + delta[direction][1]))) {
                    x += delta[direction][0];
                    y += delta[direction][1];
                }
            }
            result = Math.max(result, x * x + y * y);
        }
        
        return result;
    }
}