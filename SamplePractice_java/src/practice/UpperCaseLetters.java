package practice;

public class UpperCaseLetters {
	public static void main(String[] args) {
		String str="Java Concept of the Day is Good";
		//findUpperCase(str);
		toLowerCase(str);
	}
	
	private static void findUpperCase(String str){
		int k=0;
		char check;
		//String[] charStr=str.split(" ");
//		for(int i=0;i<=charStr.length-1;i++){
//			System.out.println(charStr[i]);
//			char[] c=charStr[i].toCharArray();
//			for(int j=0;j<c.length;j++){
//				System.out.println(c[j]);
//				if(c[j].)
//			}
//		}
		//Prog to check uppercase char in a given string 
		
		for(int i=0;i<str.length();i++){
			
			//check=str.charAt(i);
			if(Character.isUpperCase(str.charAt(i))){
				System.out.println(str.charAt(i));
			}
			
		}
		System.out.println(str.length());
		
	}
	
	
	public static void toLowerCase(String a)
    {
        for (int i = 0; i< a.length(); i++)
        {
            char aChar = a.charAt(i);
            if (65 <= aChar && aChar<=90)
            {
              System.out.print(aChar);
            }
            
         }
     }
	

}
