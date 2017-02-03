package StringsExamples;

public class SwapCharInString {
	
	public static void main(String[] args) {
		
		//System.out.println(swapChar("abcdef",2,3));
		String s="abcdef";
		int lindex=s.indexOf(s.charAt(1)), rindex=s.length();
		System.out.println(lindex+" \n"+rindex);
		for(int i=0;i<lindex;i++){
			for(int j=rindex;j<0;j--){
				//System.out.println(s);
				System.out.println(swapChar(s,i,j));
			}
		}
		
		
}
	
	private static String swapChar(String s, int lidx, int Rindx){
		StringBuilder sb=new StringBuilder(s);
//		for(int i=0;i<sb.length();i++){
//			for(int j=i;j<sb.length();j++){
		char l=sb.charAt(lidx), r= sb.charAt(Rindx);
		sb.setCharAt(lidx, r);
		sb.setCharAt(Rindx, l);
	//	}
	//	}
		return sb.toString();
	}

}
