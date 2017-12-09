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