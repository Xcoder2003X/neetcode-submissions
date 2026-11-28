class Solution {
    public int findMin(int[] nums) {
        
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            // Ila nums[mid] sghr mn nums[r], l-minimum kayn f l-lissar (b-7sab mid)
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                // Ila nums[mid] > nums[r], l-minimum kayn b3d mid f l-limn
                l = mid + 1;
            }
        }

        return nums[l];
    }
}
