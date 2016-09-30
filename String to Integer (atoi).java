/**Implement atoi to convert a string to an integer.
 *Requirements for atoi:
 *The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 *
 *The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 *
 *If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 *
 *If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 */
 public class Solution {
     public int myAtoi(String str) {
         char [] charArray = str.toCharArray();
 		ArrayList<Character> nws = new ArrayList<Character>();
 		int firstInd = 0;
 		boolean allWhite = true;
 		for(int i = 0; i < charArray.length; i++){
 			if(!Character.isWhitespace(charArray[i])){
 				firstInd = i;
 				allWhite = false;
 				break;
 			}
 		}
 		if(allWhite) return 0;
 		char sign = charArray[firstInd];
 		if(charArray[firstInd]=='+'||charArray[firstInd]=='-'){
 			if(firstInd < charArray.length-1){
 				nws.add(charArray[firstInd]);
 				firstInd++;
 			}
 			else return 0;
 		}
 		for(int j = firstInd; j < charArray.length; j++){
 			char ch = charArray[j];
 			if(Character.isDigit(ch)){
 				nws.add(ch);
 			}
 			else break;
 		}
 		long result = 0;
 		if(sign == '-'){
 			for(int i = 1; i < nws.size(); i++){
 				int pow = nws.size()-i-1;
 				result -= Math.pow(10, pow) * Character.getNumericValue(nws.get(i));
 			}
 		}
 		else if(sign == '+'){
 			for(int i = 1; i < nws.size(); i++){
 				int pow = nws.size()-i-1;
 				result += Math.pow(10, pow) * Character.getNumericValue(nws.get(i));
 			}
 		}
 		else{
 			for(int i = 0; i < nws.size(); i++){
 				int pow = nws.size()-i-1;
 				result += Math.pow(10, pow) * Character.getNumericValue(nws.get(i));
 			}
 		}
 		if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
 		else if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
 		else return (int) result;
 	}
 }
