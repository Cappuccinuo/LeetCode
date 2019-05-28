class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] array = new int[]{a, b, c};
        Arrays.sort(array);
        if (array[2] - array[0] == 2) {
            return new int[]{0, 0};
        }
        return new int[]{Math.min(array[2] - array[1], array[1] - array[0]) <= 2 ? 1 : 2, array[2] - array[0] - 2};
    }
}