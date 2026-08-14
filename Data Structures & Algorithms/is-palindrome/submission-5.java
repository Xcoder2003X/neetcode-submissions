class Solution {
    public boolean isPalindrome(String s) {
        
        

        String clean = s.replaceAll("[^a-zA-Z0-9]", "");
        int l =0 , r = clean.length() -1;

        while(l<r){

            if(Character.toLowerCase(clean.charAt(l)) != Character.toLowerCase(clean.charAt(r)))return false ;

            else l++ ; r-- ;
        }

        return true ;
    }
}
