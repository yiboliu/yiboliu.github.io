/** Given a roman numeral, convert it to an integer.
 */ Input is guaranteed to be within the range from 1 to 3999.

public class Solution {
    public int romanToInt(String s) {
        char [] chArray = s.toCharArray();
		int result = 0;
		for(int i = 0; i < chArray.length; i++){
			char temp = chArray[i];
			if(temp == 'I'){
				if(i < chArray.length-1 && chArray[i+1] == 'V'){
					result += 4;
					i++;
				}
				else if(i < chArray.length-1 && chArray[i+1] == 'X'){
					result += 9;
					i++;
				}
				else result += 1;
			}
			else if(temp == 'V') result += 5;
			else if(temp == 'X'){
				if(i < chArray.length-1 && chArray[i+1] == 'L'){
					result += 40;
					i++;
				}
				else if(i < chArray.length-1 && chArray[i+1] == 'C'){
					result += 90;
					i++;
				}
				else result += 10;
			}
			else if(temp == 'L') result += 50;
			else if(temp == 'C'){
				if(i < chArray.length-1 && chArray[i+1] == 'D'){
					result += 400;
					i++;
				}
				else if(i < chArray.length-1 && chArray[i+1] == 'M'){
					result += 900;
					i++;
				}
				else result += 100;
			}
			else if(temp == 'D') result += 500;
			else if(temp == 'M') result += 1000;
		}
		return result;
    }
}
