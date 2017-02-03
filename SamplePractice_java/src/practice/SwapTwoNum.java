package practice;

public class SwapTwoNum {
	
	public static void main(String[] args) {
		int x=10;
		int y=5;
		System.out.println("x and y before swapping"+" x: "+x +" y: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x and y after swapping "+" x: "+x +" y: "+y);
	}

}
