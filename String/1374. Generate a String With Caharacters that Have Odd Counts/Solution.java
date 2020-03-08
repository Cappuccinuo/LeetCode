class Solution {
    public String generateTheString(int n) {
        // When n is odd, we want "bbb", so we want to select 'b' which is (1, 2)
        // When n is even, we want "baaa", so we want to select 'a' which is (0, 1)
        return "b" + "ab".substring(n % 2, 1 + n % 2).repeat(n - 1);
    }
}

class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        int i;
        if (n % 2 == 1) {
            for (i = 0; i < n; i++) {
                sb.append(c);
            }
            return sb.toString();
        }

        for (i = 0; i < n - 1; i++) {
            sb.append(c);
        }

        char tail = (char)(r.nextInt(26) + 'a');
        while (c == tail) {
            tail = (char)(r.nextInt(26) + 'a');
        }

        sb.append(tail);
        return sb.toString();
    }
}