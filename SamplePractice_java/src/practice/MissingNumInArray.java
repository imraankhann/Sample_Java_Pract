package practice;

public class MissingNumInArray {
	public static void main(String[] args) {
		int a[]={1,2,4,5,6,10};
		int miss=getMiss(a,6);
		System.out.printf("%d",miss);
		//getchar();
		
	}
	
	public static int getMiss(int[]a, int n){
		int i,total;
		total=(n+1)*(n+2)/2;
		for(i=0;i<n-1;i++){
			total-=a[i];
			//return total;
		}
		return total;
	}

}
