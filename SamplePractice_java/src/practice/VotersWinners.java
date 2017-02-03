package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class VotersWinners {
	
	public static void main(String[] args) {
		winners(new String[]{"Veronica","Trump","Barrack Obama","Veronica","Barrack Obama","Bill Clinton"});
	}
	private static void winners(String [] s){
		
		TreeMap<String, Integer> tm=new TreeMap<String,Integer>();
		for(String st:s){
			if(tm.containsKey(st)){
				tm.put(st, tm.get(st)+1);
			}
			else{
				tm.put(st, 1);
			}
		}
		System.out.println("Tree map count is : "+tm);
		String winner="";
		int val=0;
		for(Map.Entry<String, Integer> mp: tm.entrySet()){
			if(val<=mp.getValue()){
				winner=mp.getKey();
				val=mp.getValue();
			}
		}
		System.out.println("winner is : "+winner);
				
		
		
		
		Set<String>sSet=tm.keySet();
		for(String str: sSet){
			if(tm.get(str)>1 ){
				System.out.println(str +":"+tm.get(str));
			}
		}
		
	}	
}

//}
//HashMap<String,Integer> mapCount=new HashMap<String,Integer>();
//for(String str: s){
//	if(mapCount.containsKey(str)){
//		mapCount.put(str, mapCount.get(str)+1);
//	}
//	else{
//		mapCount.put(str, 1);
//	}
//}
//
//Set<String> mapSet=mapCount.keySet();
//for(String st: mapSet){
//	if(mapCount.get(st)>1){
//		System.out.println(st +":"+mapCount.get(st));
//	}
//}
//	}
//}

