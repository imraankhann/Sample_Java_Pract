package StringsExamples;

public class ReverseSringEx2 {
	
	public static void main(String[] args) {
		//String str="Java concept of the day";
		reverseString("Hello World");
		//System.out.println(recurssiveMethod(str));
//		System.out.println("Sub string is "+str.substring(1));
//		System.out.println("charAt is "+str.charAt(0));
//		System.out.println("====>>"+(str.substring(1))+str.charAt(0));
	}
	public static String recurssiveMethod(String str){
		if((str==null)||str.length()<=1){
			return str;
		}
		
		return recurssiveMethod(str.substring(1))+str.charAt(0);
		
		
	}
	
	private static void reverseString(String str){
		String revStr="";
		for(int i=str.length()-1;i>=0;i--){
			revStr+=str.charAt(i);
		}
		
		System.out.println(revStr);
	}

}
