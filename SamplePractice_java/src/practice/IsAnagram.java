package practice;

import java.util.Arrays;

public class IsAnagram {
	public static void main(String[] args) {
		String str1="army";
		String str2="mary";
		//System.out.println(isArmsStrongNum(153));
//	   isAnagram(str1, str2);
//	   isAnagram("pots", "tops");
//	   isAnagram("army","navy");
//	   isAnagram("army","mary");
	   isAnagram2();
	}
	
	public static boolean isArmsStrongNum(int n){
		int c=0,a,temp;
		int rev=0;
		int n1=156;
		
		temp=n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
//		while(n!=0){
//			rev=rev*10;
//			rev=rev+n%10;
//			n1=n/10;
//		}
//		System.out.println(n1);
			if(temp==c)
				return true;
			
		}
		return false;
		
	}
	public static void isAnagram(String s1, String s2){
		boolean status=true;
		if(s1.length()!=s2.length()){
		status= false;}
		else{
			char[] s1Arr=s1.toCharArray();
		    char[] s2Arr=s2.toCharArray();
		    Arrays.sort(s1Arr);
		    Arrays.sort(s2Arr);
		    status=Arrays.equals(s1Arr, s2Arr);
		}
		if(status){
			System.out.println(s1 +" and "+ s2 +" are Anagram");
		}
		else{
			System.out.println(s1+" and "+s2 +" are not Anagrams");
		}
	}
	
	public static void isAnagram2(){
		boolean isPresent= false;
		String s1="pots";
		String s2="rake";
		char[] a=s1.toCharArray();
		char[] c=s2.toCharArray();
		for(int i=0;i<a.length;i++){
			for(int j=1;j<c.length;j++){
				if(a[i]==c[j]){
					System.out.println(a[i]+" True ");
					isPresent = true;
					break;
				}
				else{
					System.out.println("false");
					isPresent= false;
					
				}
			
			}
			if(!isPresent)
			{
				System.out.println("String does not match");
				break;
			}
		}
	}

}

