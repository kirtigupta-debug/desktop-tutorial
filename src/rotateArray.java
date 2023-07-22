package src;

public class rotateArray {
    /**
     *step 1: reverse entire array
     * step 2: reverse k array
     * step 3: reverse lenght-k
     */
        public void rotate(int[] nums, int k) {
            rotate(0,nums.length-1,nums);
            rotate(0, k-1, nums);
            rotate(k,nums.length-1,nums);
        }

        public void rotate(int start, int end, int[] nums){
            while(start<end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end --;
            }
        }

}
