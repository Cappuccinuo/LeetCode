// 3ms
class Solution {
    public int nextGreaterElement(int n) {
        String num = String.valueOf(n);
        if (num.length() == 1) {
            return -1;
        }
        char[] numArr = num.toCharArray();
        for (int i = numArr.length - 1; i >= 1; i--) {
            if (numArr[i] > numArr[i - 1]) {
                char target = numArr[i - 1];
                int swapIndex = getIndex(numArr, i, target);
                swap(numArr, i - 1, swapIndex);
                reverse(numArr, i, numArr.length - 1);
                try {
                    return Integer.parseInt(new String(numArr));
                } catch (Exception e) {
                    return -1;
                }
                /*
                long l = Long.parseLong(new String(numArr));
                if (l > Integer.MAX_VALUE) {
                    return -1;
                }
                return Integer.parseInt(new String(numArr));
                */
            }
        }
        return -1;
    }
    
    private int getIndex(char[] arr, int index, char target) {
        while (index < arr.length && arr[index] > target) {
            index++;
        }
        return index - 1;
    }
    
    private void swap(char[] arr, int index1, int index2) {
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    private void reverse(char[] arr, int index1, int index2) {
        while (index1 < index2) {
            swap(arr, index1, index2);
            index1++;
            index2--;
        }
    }
}


// 5ms
class Solution {
    public int nextGreaterElement(int n) {
        String num = String.valueOf(n);
        if (num.length() == 1) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = num.length() - 1; i >= 1; i--) {
            if (num.charAt(i) > num.charAt(i - 1)) {
                sb.append(num.substring(0, i - 1));
                sb.append(helper(num.substring(i - 1, num.length())));
                long l = Long.parseLong(sb.toString());
                if (l > Integer.MAX_VALUE) {
                    return -1;
                }
                return Integer.parseInt(sb.toString());
            }
        }
        return -1;
    }
    
    public String helper(String str) {
        StringBuilder sb = new StringBuilder();
        char[] c = str.toCharArray();
        char origin = c[0];
        Arrays.sort(c);
        int originIndex = index(c, 0, c.length - 1, origin);
        int i = originIndex + 1;
        while (c[originIndex] == c[i]) {
            i++;
        }
        char current = c[i];
        sb.append(current);
        List<Character> list = new ArrayList<>();
        for (Character ca : c) {
            list.add(ca);
        }
        list.remove(i);
        for (Character ca : list) {
            sb.append(ca);
        }
        return sb.toString();
    }
    
    private int index(char[] array, int begin, int end, char target) {
        while (begin < end) {
            int mid = begin + (end - begin) / 2;
            if (array[mid] == target) {
                return mid;
            }
            else if (array[mid] < target) {
                return index(array, mid + 1, end, target);
            }
            else if (array[mid] > target) {
                return index(array, begin, mid, target);
            }
        }
        return -1;
    }
}