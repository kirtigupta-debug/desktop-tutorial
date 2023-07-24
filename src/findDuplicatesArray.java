package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *Given an integer array nums of length n where all the integers of nums are in the range [1, n]
 * and each integer appears once or twice, return an array of all the integers that appears twice.
 *
 * You must write an algorithm that runs in O(n) time and uses only constant extra space.
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 */
public class findDuplicatesArray {
        public static List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i< nums.length; i++){
                int resultValue = Math.abs(nums[i]);
                int index = resultValue -1;
                if(nums[index] <0){
                    result.add(resultValue +1);
                }
                nums[index] = -nums[index];

            }
           return result;
        }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 2, 7, 8, 2, 3, 1));
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(findDuplicates(array));
    }
    /**
     * Line number  result.add(resultValue +1);
     * the new created index needs to be added 1.
     */
}

/**
 * O(n) time = for loop
 * and uses only constant extra space = no hashmaps/ we can use the List<Integer>, as it's in the question
 * range [1, n] which means [1,8] if n = 8 , number can't be greater than 8, or less than 1
 */