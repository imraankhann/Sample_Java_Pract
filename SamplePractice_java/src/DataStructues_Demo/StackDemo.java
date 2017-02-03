package DataStructues_Demo;

public class StackDemo {
	int top;
	int a[];
	public StackDemo(){
		top=-1;
	}
	public static void main(String[] args) {
		StackDemo sd=new StackDemo();
		sd.stackD(9);
	}
	
	public  void stackD(int x){
		if(top>=10){
			System.out.println("Stack Overflow");
		}
		else{
			a[++top]=x;
			System.out.println("Elements are inserted");
		}
	}
	
	public int stackPop(){
		if(top<0){
			System.out.println("Stack underflow");
			return 0;
		}
		else{
			int d=a[top--];
			return d;
		}
	}
	
	public void stackEmpty(){
		if(top<0){
			System.out.println("Stack is empty");
		}
		else{
			System.out.println("Stack is not empty");
		}
	}

}
