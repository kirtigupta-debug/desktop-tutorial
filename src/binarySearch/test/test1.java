package src.binarySearch.test;

/**
 * /**
 *  *Given an integer array nums of length n where all the integers of nums are in the range [1, n]
 *  * and each integer appears once or twice, return an array of all the integers that appears twice.
 *  *
 *  * You must write an algorithm that runs in O(n) time and uses only constant extra space.
 *  * Input: nums = [4,3,2,7,8,2,3,1]
 *  * Output: [2,3]
 *  * Input: nums = [4,3,2,7,8,2,3,1]
 *  * Output: [2,3]
 *  [10,2,5,10,9,1,1,4,3,7]
 *  output: [7,10]
 *  */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test1 {

        public static List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<>();
            for(int i =0;i < nums.length; i++){
                int modified_index = Math.abs(nums[i])-1;
                if(nums[modified_index]<0){
                    result.add(modified_index+1);
                }
                nums[modified_index] = -nums[modified_index];
            }
            return result;
        }

    public static void main(String[] args) {
       // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 2, 7, 8, 2, 3, 1));
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(findDuplicates(array));
    }
}
