package practice;

public class ArmstrongDemo {
	public static void main(String[] args) {
		int num=371 ;
		if(isArmstrong(num)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}

	private static boolean isArmstrong(int num){
		int result=0;
		int orig=num;
		while(num!=0){
			int remainder=num%10;
			
			//result=result+remainder*remainder*remainder;
			result=(int) (result+Math.pow(remainder, 3));
			num=num/10;
		}
			if(orig==result){
				return true;
			}
			return false;
		}
		//return false;
	
}
