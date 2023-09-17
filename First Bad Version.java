/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1) {
            return 1;
        }
        int upperBound = n;
        int lowerBound = 1;
        while(lowerBound <= upperBound) {
            if(lowerBound == upperBound && isBadVersion(lowerBound)) {
                return lowerBound;
            }
            int middle = lowerBound + (upperBound -lowerBound) / 2;
            if(isBadVersion(middle)) {
                upperBound = middle - 1;
            } else {
                lowerBound = middle + 1;
            }
        }
        return lowerBound;
    }
}