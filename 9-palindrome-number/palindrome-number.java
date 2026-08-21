class Solution {
    public boolean isPalindrome(int x) {
        boolean result;
        
        if (x < 0) {
            result = false;
        } else {
            int original = x;
            long reversed = 0;
            
            while (x != 0) {
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x = x / 10;
            }
            
            if (reversed == original) {
                result = true;
            } else {
                result = false;
            }
        }
        
        return result;
    }
}