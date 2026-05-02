class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                 cleaned.append(Character.toLowerCase(c));
            }
        }
        String word = cleaned.toString();
        int size= word.length();
        int lo =0;
        int hi=size-1;
        
        while (lo < hi){
            if(word.charAt(lo)!=word.charAt(hi)){
               
                return false;
                
            
        }
        lo++;
        hi--;
    }
        
       return true; 
    }
}
