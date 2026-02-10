package DSAAndAlgorithm;

import java.util.Arrays;

public class CuttingWood {
    public static int cuttingWood(int[] nums2, int k) {
        // Need to revisit
        int left=0,right= Arrays.stream(nums2).max().getAsInt();;
        int heights =Arrays.stream(nums2).max().getAsInt();
        while (left<right){
            int mid =(left+right)/(2+1);
            if (cutsEnoughWood(mid,k,heights)){
                left=mid;
            }else {
                right = mid-1;
            }
        }
        return right;
    }

    private static boolean cutsEnoughWood(int mid, int k, int heights) {
        int woodCollected = 0;
        for (int i=0;i<heights;i++){
            if (heights>mid){
                woodCollected +=(heights-mid);
            }

        }
        return woodCollected >=k;
    }
}
