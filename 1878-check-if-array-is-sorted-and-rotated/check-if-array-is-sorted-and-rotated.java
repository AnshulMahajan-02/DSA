class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int breaks = 0;
        
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n; // wrap around to index 0 at the end
            if (nums[i] > nums[next]) {
                breaks++;
            }
        }
        
        return breaks <= 1;
    }
}
