class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (i < j && !set.contains(arr[i])) {
                i++;
            }
            while (i < j && !set.contains(arr[j])) {
                j--;
            }
            if (arr[i] != arr[j]) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }
        return new String(arr);
    }
}