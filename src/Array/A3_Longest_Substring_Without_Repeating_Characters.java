package Array;

import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public int LengthOfLongestSubstring(String s) {
    	if(s.length() == 0||s == null) return 0;
    	HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(int i = 0,j = 0; i<s.length();i++) {
        	if(set.contains(s.charAt(i))) {
        		set.remove(s.charAt(j++));
        	}else {
        		set.add(s.charAt(i));
        		res = Math.max(res,set.size());
        	}
        }
        return res;
    }
}
public class A3_Longest_Substring_Without_Repeating_Characters {
	//用HashMap来做

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " ";
		int len = lengthOfLongestSubstring(s);
		System.out.println(len);
	}
//核心思想是两个节点，遍历一次。j存储的重复子串的起点。找到所有不重复的子串长度，比较大小。
	private static int lengthOfLongestSubstring(String s) {
		// TODO Auto-generated method stub
		if(s.length() == 0||s == null) return 0;
    	int res = 0;
    	HashMap<Character,Integer> map = new HashMap<>();
    	for(int i = 0,j = 0; i < s.length(); i++) {
    		if(map.containsKey(s.charAt(i))) {
    			j = Math.max(j, map.get(s.charAt(i)) + 1);
    		}
    		map.put(s.charAt(i), i);
    		res = Math.max(res, i-j+1);
    	}
 
		return res;
	}

}
