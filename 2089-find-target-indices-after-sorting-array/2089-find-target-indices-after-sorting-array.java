class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        int freq = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] < target) {
                count++;
            }
            if (nums[i] == target) {
                freq++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = count; i < count+freq; i++ ) {
            ans.add(i);
        }

        return ans;
    }
}