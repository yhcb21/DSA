class Solution {
    public void moveZeroes(int[] nums) {
        int temp =0;
        // int i = 0;
        // int j = nums.length - 1;
        // while ( i <= j) {
        //         if (nums[j] == 0) {
        //             j--;
        //         }
        //         else if( nums[i] != 0) {
        //             i++;
        //         }
        //         else{
        //             nums[i] = temp;
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //             i++;
        //             j--;
        //         }
            
        // }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
}
        System.out.println(nums);
        
    }
}