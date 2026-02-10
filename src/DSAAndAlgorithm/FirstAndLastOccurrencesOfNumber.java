package DSAAndAlgorithm;

public class FirstAndLastOccurrencesOfNumber {
    public static int[] findFirstAndLastOcurrence(int[] nums1, int target1) {

        int lowerBond = findLowerBond(nums1, target1);
        int upperBond = findUpperBond(nums1, target1);
        return new int[]{lowerBond,upperBond};

    }

    private static int findUpperBond(int[] nums1, int target1) {
        int left = 0, right = nums1.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums1[mid] > target1) {
                right = mid - 1;
            } else if (nums1[mid]<target1){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return nums1.length > 0 && nums1[left] == target1 ?left:-1;
    }

    private static int findLowerBond(int[] nums1, int target1) {

        int left = 0, right = nums1.length - 1;
        while (left < right) {
            int mid = (left + right) / 2+1;
            if (nums1[mid] > target1) {
                right = mid - 1;
            } else if (nums1[mid]<target1){
                left = mid+1;
            }else {
                left = mid;
            }
        }
        return nums1.length > 0 && nums1[right] == target1 ?right:-1;
    }
}
