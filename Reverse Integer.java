/**
 *Reverse digits of an integer.
 *Example1: x = 123, return 321
 *Example2: x = -123, return -321
 */
 public class Solution {
    public int reverse(int x) {
        String temp = x + "";
		int l = temp.length();
		char[] result = new char[l];
		if(temp.charAt(0)=='-'){
			result[0]='-';
			for(int i = 1; i < l; i++){
				result[i] = temp.charAt(l-i);
			}
		}
		else{
			for(int i = 0; i < l; i++){
				result[i] = temp.charAt(l-1-i);
			}
		}
		long y = Long.parseLong(new String(result));
		if(Math.abs(y) > Integer.MAX_VALUE) return 0;
		else return Integer.parseInt(new String(result));
    }
}
