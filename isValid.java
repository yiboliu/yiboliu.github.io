/**
 *  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> close = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
        	close.add(s.charAt(i));
        }
        if(s.length() % 2 == 1) return false;
        while(close.size() > 0){
        	boolean dec = false;
        	for(int i = 0; i < close.size(); i++) {
        		if(i == close.size()-1) return false;
        		else if(close.get(i) == '(' && close.get(i+1) == ')') {
        			close.remove(i);
        			close.remove(i);
        			dec = true;
        			break;
        		}
        		else if(close.get(i) == '[' && close.get(i+1) == ']') {
        			close.remove(i);
        			close.remove(i);
        			dec = true;
        			break;
        		}
        		else if(close.get(i) == '{' && close.get(i+1) == '}') {
        			close.remove(i);
        			close.remove(i);
        			dec = true;
        			break;
        		}
        	}
        	if(!dec) return false;
        }
		return true;
    }
}
