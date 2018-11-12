class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prev = 0;
        for (int i = 0; i < logs.size(); i++) {
            String log = logs.get(i);
            String[] split = log.split(":");
            int id = Integer.parseInt(split[0]);
            int timeStamp = Integer.parseInt(split[2]);
            if (split[1].equals("start")) {
                if (!stack.isEmpty()) {
                    result[stack.peek()] += timeStamp - prev;
                }
                stack.push(id);
                prev = timeStamp;
            }
            else {
                if (!stack.isEmpty()) {
                    result[stack.peek()] += timeStamp - prev + 1;
                }
                stack.pop();
                prev = timeStamp + 1;
            }
        }
        return result;
    }
}