class Solution {
    public String removeDuplicateLetters(String s) {
        char[] letters = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Integer> map = new HashMap<>();
        for (char letter : letters) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        
        Set<Character> visited = new HashSet();
        for (char letter : letters) {
            map.put(letter, map.get(letter) - 1);
            if (visited.contains(letter)) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > letter && map.get(stack.peek()) > 0) {
                char c = stack.pop();
                visited.remove(c);
            }
            stack.push(letter);    
            visited.add(letter);
        }
        for (char c : stack) {
            System.out.println(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}