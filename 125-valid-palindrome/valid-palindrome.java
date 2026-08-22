class Solution {
    public boolean isPalindrome(String s) {
        boolean result;
        int left = 0;
        int right = s.length() - 1;
        result = true; // assume true until proven otherwise
        
        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else if (leftChar != rightChar) {
                result = false;
                break;
            } else {
                left++;
                right--;
            }
        }
        
        return result;
    }
}