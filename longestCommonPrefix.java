//Write a function to find the longest common prefix string amongst an array of strings.
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
		String result = strs[0];
		for(int i = 1; i < strs.length; i++){
			char [] obj = strs[i].toCharArray();
			char [] model = result.toCharArray();
			int end = 0;
			for(int j = 0; j < Math.min(obj.length, model.length); j++){
				if(model[j] != obj[j]){
					end = j;
					break;
				}
				else if(j==Math.min(obj.length, model.length)-1){
					end = j + 1;
					break;
				}
			}
			result = strs[0].substring(0, end);
		}
		return result;
    }
}
