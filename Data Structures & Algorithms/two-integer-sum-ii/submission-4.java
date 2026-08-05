class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer , Integer> set = new HashMap<>();

        for(int i=0 ; i<numbers.length ; i++){

            int sub = target - numbers[i] ;
            
            if(set.containsKey(sub))return new int[] {set.get(sub)+1 , i+1};
            else set.put(numbers[i] , i);
        }

        return new int[] {-1 ,-1};
    }
}
