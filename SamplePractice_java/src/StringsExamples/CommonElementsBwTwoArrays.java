package StringsExamples;

import java.util.HashSet;

public class CommonElementsBwTwoArrays {

	public static void main(String[] args) {
		String [] s1={"One","Two","Three","Four","Five","Six","Seven"};
		String [] s2={"One","Five","Six","Eight"};
		HashSet<String> set=new HashSet<String>();
		
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if(s1[i].equals(s2[j])){
					set.add(s1[i]);
				}
				
			}
		}
		System.out.println(set);
				
	}
}
