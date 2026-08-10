class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int maxRes = 0;
        int l = 0, r = 0;
        Set<Character> charSet = new HashSet<>();

        while (r < s.length()) {
            if (!charSet.contains(s.charAt(r))) {
                charSet.add(s.charAt(r));
                maxRes = Math.max(maxRes, charSet.size()); 
                r++; 
            } 
            
            else {
                charSet.remove(s.charAt(l));
                l++;
            }
        }

        return maxRes;
    }
}
