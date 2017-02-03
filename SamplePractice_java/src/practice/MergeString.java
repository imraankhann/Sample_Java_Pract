package practice;

public class MergeString {
	
	public static void main(String[] args) {
		mergeString("abc","def");
		//UpperCaseChar("ImRaan");
		
	}
	
	public static String mergeString(String a ,String b) {
		String newB="";
		StringBuffer sb=new StringBuffer();
		boolean isGreater=false;
		if(a.length()<b.length()){
			isGreater=true;
			newB=b.substring(0,a.length());
		}
		else{
			newB=b;
		}
		
		for(int i=0;i<a.length();i++){
			sb.append(a.charAt(i));
			
			for(int j=i;j<b.length();j++){
				sb.append(newB.charAt(j));
				break;
			}
		}
		if(isGreater){
			sb.append(b.substring(newB.length(),b.length()));
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public static char UpperCaseChar(String s){
		char c=s.charAt(0);
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				c=s.charAt(i);
				System.out.println("Upper case charater in string is : "+s.charAt(i));
			}
		}
		return s.charAt(c);
	}

}
