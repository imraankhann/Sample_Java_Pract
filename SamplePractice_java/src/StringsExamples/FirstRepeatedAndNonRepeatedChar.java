package StringsExamples;

import java.util.HashMap;

public class FirstRepeatedAndNonRepeatedChar {
	public static void main(String[] args) {
		firstRepeatedNonRepeatedchar("JavaConceptOfTheDay");
	}

	public static void firstRepeatedNonRepeatedchar(String inputString){
		HashMap<Character,Integer>charCountMap=new HashMap<Character,Integer>();
		char[] strArr=inputString.toCharArray();
		//System.out.println("Char length is : "+strArr.length);
		for (char c : strArr) {
			if(charCountMap.containsKey(c)){
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else{
				
			charCountMap.put(c,1);
			}
			
		}
		for(char c: strArr){
			if(charCountMap.get(c)>1){
				System.out.println("First repeated char in "+inputString+"'is "+c+"'");
				break;
			}
		}
		for(char c: strArr){
			if(charCountMap.get(c)==1){
				System.out.println("First non-repeated char in "+inputString+"'is "+c+"'");
				break;
			}
		}
	}
}
