package DSAAndAlgorithm;

public class FindInsertionIndex {

    public static int findTheInsertionIndex(int[] nums, int target) {
        int left=0, right=nums.length-1;

        while (left<right){
            int mid = (left+right)/2;
            if(nums[mid] >= target){
                right = mid;

            }else {
                left = mid+1;
            }
        }
        return left;
    }
}
