package StringsExamples;

import java.util.LinkedHashMap;

public class LongestSubstring {
	public static void main(String[] args) {
		longSubString("JavaConceptOfTheDay");
	}

	public static void longSubString(String inputString){
		char[] charArray=inputString.toCharArray();
		String longestSubstring=null;
		int longestSubstringlength=0;
		
		LinkedHashMap<Character,Integer>charPosMap=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++){
			char ch=charArray[i];
			if(!charPosMap.containsKey(ch)){
				charPosMap.put(ch, i);
				
			}
			else{
				i=charPosMap.get(i);
				charPosMap.clear();
				
			}
			
			if(charPosMap.size()>longestSubstringlength){
				longestSubstringlength=charPosMap.size();
				longestSubstring=charPosMap.keySet().toString();
			}
		}
			System.out.println("Input string : "+inputString);
			System.out.println("Longest Sub string : "+longestSubstring);
			System.out.println("Longest sub string length : "+longestSubstringlength);
			
		}
		
	
}
