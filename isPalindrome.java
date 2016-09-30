// Determine whether an integer is a palindrome. Do this without extra space.
public class Solution {
    public boolean isPalindrome(int x) {
        boolean skip = false;
		while(!skip){
			int length = String.valueOf(x).length();
			if(length <= 1) break;
			if(x%10 != (int) (x/Math.pow(10, length-1))) return false;
			x = (int) (x - Math.pow(10, length-1) * (int) (x/Math.pow(10, length-1)));
			x = x/10;
			int diff = length - 2 - String.valueOf(x).length();
			if(x % Math.pow(10, diff) != 0) return false;
			else x = (int) (x / Math.pow(10, diff));
		}
		return true;
    }
}
