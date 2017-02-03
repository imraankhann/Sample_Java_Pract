package StringsExamples;

public class ReverseStringEx1 {
	
	public static void main(String[] args) {
		String str="Java concept";
		
		System.out.println("=================>>>>>>>> Normal Reverse <<<<<<<<<<=================");
		char[] c=str.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
		
		
	}


}
