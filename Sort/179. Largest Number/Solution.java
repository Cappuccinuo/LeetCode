class Solution {
    public String largestNumber(int[] nums) {
        int N = nums.length;
        String[] numStrs = new String[N];
        int index = 0;
        for (int num : nums) {
            numStrs[index++] = String.valueOf(num);
        }
        Arrays.sort(numStrs, new largestNumberComparator());
        
        if (numStrs[0].equals("0")) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for (String numStr : numStrs) {
            sb.append(numStr);
        }
        
        return sb.toString();
    }
    
    private class largestNumberComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            String a = s1 + s2;
            String b = s2 + s1;
            return b.compareTo(a);
        }
    }
}
