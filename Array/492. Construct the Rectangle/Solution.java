class Solution {
    public int[] constructRectangle(int area) {
        int sq = (int)Math.sqrt(area);
        while (area % sq != 0) {
            sq--;
        } 
        return new int[]{area / sq, sq};
    }
}

class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int min = Integer.MAX_VALUE;
        List<int[]> allPossible = getAllPossible(area);
        for (int[] p : allPossible) {
            if (p[0] - p[1] < min) {
                result = p;
                min = p[0] - p[1];
            }
        }
        return result;
    }
    
    private List<int[]> getAllPossible(int area) {
        List<int[]> result = new LinkedList<>();
        for (int i = 1; i <= Math.sqrt(area); i++) {
            int[] temp = new int[2];
            if (area % i == 0) {
                temp[0] = area / i;
                temp[1] = i;
                result.add(temp);
            }
        }
        return result;
    }
}