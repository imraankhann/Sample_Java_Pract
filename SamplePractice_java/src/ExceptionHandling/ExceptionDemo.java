package ExceptionHandling;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		String[] s={"abc","122",null,"xyz"};
		for(int i=0;i<s.length;i++){
			try{
				int a=s[i].length()+Integer.parseInt(s[i]);
			}catch(NumberFormatException e){
				System.out.println("NumberFormatException will be handled here... ");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException will be handled here... ");
			}
			catch(NullPointerException e){
				System.out.println("NullPointerException will be handled here... ");
			}
		}
	}

}
