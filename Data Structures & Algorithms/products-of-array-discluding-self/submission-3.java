class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length ;
        int [] leftMult = new int[n];
        int [] rMult = new int[n];

        int [] res = new int[n];

        leftMult[0] = 1;
        leftMult[1] = nums[0];
        rMult[n-1] = 1;
        rMult[n-2] = nums[n-1];

        for(int i=2 ; i<n ; i++){
            leftMult[i]=leftMult[i-1]*nums[i-1];
            rMult[n-i-1]=rMult[n-i]*nums[n-i];
        }

        for(int i=0 ; i< n ; i++){
           res[i]=leftMult[i] * rMult[i] ;
        }

        return res ;
    }
}  
