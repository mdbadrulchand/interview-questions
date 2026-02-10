import DSAAndAlgorithm.CuttingWood;
import DSAAndAlgorithm.FindInsertionIndex;
import DSAAndAlgorithm.FirstAndLastOccurrencesOfNumber;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //? You are given an sorted array that contains unique values, along wit an integer target
        //If the array contains the target value return its index
        //Otherwise, return the insertion index. This is the index where the target would be if it were inserted
        //--in order maintaining the sorted sequence of the array
        int[] nums = {1, 2, 4, 5, 7, 8, 9};
        int target = 6;

        int result = FindInsertionIndex.findTheInsertionIndex(nums, target);

        System.out.println(result);

        int[] nums1 = {1, 2, 3, 4, 4, 4, 4, 4, 5, 6, 7, 8, 9};

        int target1=4;

        //System.out.println(nums1.length);

        int[] result1 =FirstAndLastOccurrencesOfNumber.findFirstAndLastOcurrence(nums1, target1);

        System.out.println(Arrays.toString(result1));

        int[] nums2 = {2,6,3,8};
        int k=7;

        int result2 = CuttingWood.cuttingWood(nums2, k);
        System.out.println("Result 2: "+result2);

    }
}