/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return findFirstBadVersion(1, n);
    }
    
    public int findFirstBadVersion(int lo, int hi) {
        while (lo < hi) {
            int mid = lo + ((hi - lo) / 2);
            if (!isBadVersion(mid)) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        return lo;
    }
}
// 2018.11.7
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            }
            else {
                start = mid;   
            }
        }
        
        if (isBadVersion(start)) {
            return start;
        }
        else if (isBadVersion(end)) {
            return end;
        }
        throw new java.util.NoSuchElementException("All versions are good.");
    }
}