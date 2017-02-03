package careercup;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
	
	public static void main(String[] args) {
		
	}
	
	private static String longest(String str){
		if(str.length()==0 || str==null){
			return "";
		}
		
		StringBuffer sb=new StringBuffer();
		Map<Character,Integer>charBag=new HashMap<Character,Integer>();
		for(char c: str.toCharArray()){
			int totalChar=charBag.get(c)!=null ? charBag.get(c) : 0;
			if((totalChar+1)%2==0){
				sb.append(c);
				sb=sb.insert(0, c);
				charBag.remove(c);
				continue;
			}
			
		}
		return str;
	}

}
