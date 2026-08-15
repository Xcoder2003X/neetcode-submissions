class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
    Set<List<Integer>> resultSet = new HashSet<>();
        
        // Optional: sorting helps keep triplets ordered consistently
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element to optimize
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Target for the twoSum function is the negative of the current element
            int target = -nums[i];
            
            // Call the twoSum helper starting from index i + 1
            twoSum(nums, i + 1, target, nums[i], resultSet);
        }

        return new ArrayList<>(resultSet);
        
        
    }

    public void twoSum(int[] numbers, int start, int target, int firstNum, Set<List<Integer>> resultSet) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = start; i < numbers.length; i++) {
            int complement = target - numbers[i];
            
            if (seen.contains(complement)) {
                List<Integer> triplet = Arrays.asList(firstNum,                  complement,numbers[i]);
                resultSet.add(triplet);
            }
            
            seen.add(numbers[i]);
        }
    }
}
