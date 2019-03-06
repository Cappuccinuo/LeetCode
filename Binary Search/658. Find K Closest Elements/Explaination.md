Brute Force: Just sort the array first by distance to target, if two number have same distance to target, then sort by natural order of two number. 

Time Complexity: O(NlogN)

```Java
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new LinkedList<>();
        
        int len = arr.length;
        // Space: O(N)
        Integer[] nums = new Integer[len];
        int i;
        for (i = 0; i < len; i++) {
            nums[i] = arr[i];
        }
        
        Arrays.sort(nums, new Comparator<Integer>() {
           @Override 
            public int compare(Integer a, Integer b) {
                int distA = Math.abs(a - x);
                int distB = Math.abs(b - x);
                if (distA == distB) {
                    return a - b;
                }
                return distA - distB;
            }
        });

        for (i = 0; i < k; i++) {
            result.add(nums[i]);
        }
        
        Collections.sort(result);
        return result;
    }
}
```



Min-Heap: 

Time Complexity: O(NlogN)

```java
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new LinkedList<>();
        // Space Complexity: O(N)
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int distA = Math.abs(a - x);
                int distB = Math.abs(b - x);
                if (distA == distB) {
                    return a - b;
                }
                return distA - distB;
            } 
        });

        for (int num : arr) {
            pq.offer(num);
        }

        while (result.size() < k) {
            result.add(pq.poll());
        }

        Collections.sort(result);
        return result;
    }
}
```



Min-Heap with optimization: first we use binary search to find the number that is the closest to target. Then we add left k element and right k element into min-heap. 

Time Complexity:  O(klogk + logN)

```java
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new LinkedList<>();
        int closestIndex = getClosestIndex(arr, x);
        int len = arr.length;
        int start = closestIndex - k >= 0 ? closestIndex - k : 0;
        int end = closestIndex + k < len ? closestIndex + k : len - 1;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override 
            public int compare(Integer a, Integer b) {
                int distA = Math.abs(a - x);
                int distB = Math.abs(b - x);
                if (distA == distB) {
                    return a - b;
                }
                return distA - distB;
            }
        }); 
        int i;
        for (i = start; i <= end; i++) {
            pq.offer(arr[i]);
        }
        while (result.size() < k) {
            result.add(pq.poll());
        }
        Collections.sort(result);
        return result;
    }
    
    private int getClosestIndex(int[] arr, int x) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= x) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (Math.abs(arr[start] - x) < Math.abs(arr[end] - x)) {
            return start;
        }
        return end;
    }
}
```



Binary Search + Two Pointer: After find the closest element, we can use two pointers to check elements on left and elements on right.

Time Complexity: O(log(n) + k)

```java
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new LinkedList<>();
        int closestIndex = getClosestIndex(arr, x);
        int len = arr.length;
        int i = closestIndex - 1;
        int j = closestIndex;

        while (k-- > 0) {
            if (isValidIndex(i, len) && isLeftCloser(i, j, arr, x, len)) {
                result.add(arr[i--]);
            }
            else if (isValidIndex(j, len) && !isLeftCloser(i, j, arr, x, len)) {
                result.add(arr[j++]);
            }
        }
        
        Collections.sort(result);
        return result;
    }
    
    private boolean isValidIndex(int ind, int len) {
        return ind >= 0 && ind < len;
    }
    
    private boolean isLeftCloser(int i, int j, int[] arr, int x, int len) {
        if (!isValidIndex(i, len)) {
            return false;
        }
        if (!isValidIndex(j, len)) {
            return true;
        }
        int distA = Math.abs(arr[i] - x);
        int distB = Math.abs(arr[j] - x);
        if (distA <= distB) {
            return true;
        }
        return false;
    }
    
    private int getClosestIndex(int[] arr, int x) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= x) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (Math.abs(arr[start] - x) < Math.abs(arr[end] - x)) {
            return start;
        }
        return end;
    }
}
```



Binary Search: As the array is sorted, we can use a property of the sorted array.

e.g array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k is 3, x is 7, result should be [6, 7, 8].

Actually we just need to find a start index in array, cause with k we can easily know the end index.

So where should the start index locate?

What if we choose index 1, which get result [2, 3, 4], the distance to x is [5, 4, 3]

What if we choose index 2, which get result [3, 4, 5], the distance to x is [4, 3, 2]...

What if we choose index 4, which get result [5, 6, 7], the distance to x is [2, 1, 0] 

What if we choose index 5, which get result [6, 7, 8], the distance to x is [1, 0, 1]

What if we choose index 6, which get result [7, 8, 9], the distance to x is [0, 1, 2].

Index 5 works, so how can we find it? We can see a pattern above is that, the best result set is the first interval, that has dist(start num, x) >= dist(end num, x).

So, the problem can be translate to, find the first start index, that makes interval[index, index + k] has property dist(num start, x) >= dist(num start + k , x).

Time Complexity: O(log(N - k) + k)

```java
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new LinkedList<>();
        int len = arr.length;
        int start = 0;
        int end = len - k;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (Math.abs(arr[mid] - x) > Math.abs(arr[mid + k] - x)) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        int index = -1;
        if (start + k < len && Math.abs(arr[start] - x) <= Math.abs(arr[start + k] - x)) {
            index = start;
        }
        else {
            index = end;
        }
        int i;
        for (i = index; i < index + k; i++) {
            result.add(arr[i]);
        }
        Collections.sort(result);
        return result;
    }
}
```

