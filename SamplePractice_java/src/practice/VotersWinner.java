package practice;

import java.util.Map;
import java.util.TreeMap;

public class VotersWinner {

	
	public static void main(String[] args) {
		winners(new String[]{"Veronica","Trump","Barrack Obama","Veronica","Barrack Obama","Bill Clinton"});
	}
	
	private static void winners(String [] s){
		TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
		for(String st:s){
			if(tm.containsKey(st)){
				tm.put(st, tm.get(st)+1);
			}
			else{
				tm.put(st, 1);
			}
		}
		System.out.println(tm);
		String Winner="";
		int val=0;
		
		for(Map.Entry<String,Integer>mp:tm.entrySet()){
			if(val<=mp.getValue()){
				Winner=mp.getKey();
				val=mp.getValue();
			}
			
		}
		System.out.println("Winner is : "+Winner +" Value is : "+val);
		
	}
	
}
