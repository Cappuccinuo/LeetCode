class Solution {
    public String smallestSubsequence(String text) {
        Stack<Integer> stack = new Stack<>();
        char[] array = text.toCharArray();
        int[] last = new int[26];
        Arrays.fill(last, -1);
        int i;
        for (i = 0; i < array.length; i++) {
            last[array[i] - 'a'] = i;
        }
        boolean[] visited = new boolean[26];
        for (i = 0; i < array.length; i++) {
            int num = array[i] - 'a';
            if (visited[num]) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > num && i < last[stack.peek()]) {
                visited[stack.pop()] = false;
            }
            stack.push(num);
            visited[num] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, (char)(stack.pop() + 'a'));
        }
        return sb.toString();
    }
}