
public class Solutions {
	public static void main(String[] args){

	}

	public static int reverse(int x) {
// 	Reverse digits of an integer.
//
// 	Example1: x = 123, return 321
// 	Example2: x = -123, return -321
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

	public static String convert(String s, int numRows) {
// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"
// Write the code that will take a string and make this conversion given a number of rows:
//
// string convert(string text, int nRows);
// convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
		int n = numRows;
		int m = s.length();
		int diff= 2*n-2;
		char[] temp = new char[m];
		int l = 0;
		for(int i = 0; i < n; i++){
			for(int j = i; j < m; j+=diff){
				if(i>0 && j>2*i){
					if(l<m && i<n-1){
						temp[l]=s.charAt(j-2*i);
						System.out.println(temp[l]+""+l);
						l++;
					}

				}
				if(l<m){
					temp[l]=s.charAt(j);
					System.out.println(temp[l]+""+l);
				}
				l++;
			}
		}
		String result = String.valueOf(temp);
		return result;
	}
}
