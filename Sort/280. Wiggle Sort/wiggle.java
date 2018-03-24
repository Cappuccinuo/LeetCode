import java.util.*;

public class wiggle {
    // Time Complexity : O(nlogn)
    // Space Complexity : O(1) depends on the sorting implementation
    public static void sort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i = i + 2) {
            swap(nums, i, i + 1);
        }
    }

    // Time Complexity : O(n) Worst case : [10, 1, 12, 1, 13, 1]
    // Space Complexity : O(1)
    public static void linearSort(int[] nums) {
        boolean small = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (small) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }
            else {
                if (nums[i] < nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }
            small = !small;
        }
    }

    public static void linearSortShorter(int[] nums) {
        // small depends on the index, odd or even
        for (int i = 0; i < nums.length - 1; i++) {
            if ((i % 2 == 0) == (nums[i] > nums[i + 1])) {
                swap(nums, i, i + 1);
            }
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 2, 1, 6, 4};
        //sort(nums);
        //linearSort(nums);
        linearSortShorter(nums);
        printArray(nums);
    }
}