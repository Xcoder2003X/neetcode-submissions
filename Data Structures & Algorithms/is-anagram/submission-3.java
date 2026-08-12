class Solution {
    public boolean isAnagram(String s, String t) {
    
    int n = s.length();

    if(n != t.length()) return false ;

    int [] occur = new int [26];

    for( int i = 0 ;i<n ; i++){
    occur[Integer.valueOf(s.charAt(i) - 'a')]++ ;
    }

    for(int i = 0 ; i<n ; i++){
    occur[Integer.valueOf(t.charAt(i)- 'a')]-- ;
    
    }

    for(int i=0 ; i<26 ; i++){
        if(occur[i] !=0)return false ;
    }

    return true ;
    }
}
