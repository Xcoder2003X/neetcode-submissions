class Solution {
    public int longestConsecutive(int[] nums) {
    
    if (nums == null || nums.length == 0) return 0;

       // je peut verifier l existance maintenant en o(1)

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLen = 0 ;

        for (int num : nums) {
            
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                maxLen = Math.max(maxLen, currentStreak);
            }
        }

        return maxLen;

        
    }
}
