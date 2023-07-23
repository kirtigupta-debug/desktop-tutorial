package src.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class binarySearch
{
    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        while(left<=right){
            int middle = left + (right -left)/2;
            if(nums[middle] == target){
                return middle;
            }
            else if(nums[middle]> target){
                right = middle -1;
            }
            else{
                left = middle+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1,0,3,5,9,12));
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(search(array,9));
    }
}
