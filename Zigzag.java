/** The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 *  P   A   H   N
 *  A P L S I I G
 *  Y   I   R
 *  And then read line by line: "PAHNAPLSIIGYIR"
 *  Write the code that will take a string and make this conversion given a number of rows:
 *
 *  string convert(string text, int nRows);
 */ convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
public class Solution {
    public String convert(String s, int numRows) {
		int n = numRows;
		int m = s.length();
		int diff= 2*n-2;
		char[] temp = new char[m];
		int l = 0;
		for(int i = 0; i < n; i++){
			for(int j = i; j < m; j += diff){
				if(i > 0 && j > 2*i){
					if(l < m && i < n-1){
						temp[l] = s.charAt(j-2*i);
						l++;
					}

				}
				if(l < m){
					temp[l] = s.charAt(j);
				}
				l++;
			}
		}
		String result = String.valueOf(temp);
		return result;
	}
}
